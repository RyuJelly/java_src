package kosta.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.URLDecoder;

public class ClientRecieve extends Thread {
	Socket socket;
	
	public ClientRecieve() {}

	public ClientRecieve(Socket socket) {
		super();
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while (true) {
				String str = br.readLine();
				String str2 = URLDecoder.decode(str, "UTF-8");
				if (str == null) break;
				
				System.out.println("클라이언트: " + str2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
