package kosta.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread {
	Socket socket = null;
	PrintWriter writer = null;
	static List<PrintWriter> list = 
			Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	public PerClientThread() {}

	public PerClientThread(Socket socket) {
		super();
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sendAll(String msg) {
		for (PrintWriter writer : list) {
			writer.println(msg);
			writer.flush();
		}
	}
	
	@Override
	public void run() {
		System.out.print("이름: ");
		String name = "";
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = br.readLine();
			sendAll("##" + name + "님 입장 하셨습니다.##");
			while (true) {
				String msg = br.readLine();
				if (msg == null) break;
				msg = name + " : " + msg;
				sendAll(msg);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sendAll("##" + name + "님 퇴장 하셨습니다.##");
			list.remove(writer);
			try {
				socket.close();
			} catch (Exception e2) {}
		}
	}
}
