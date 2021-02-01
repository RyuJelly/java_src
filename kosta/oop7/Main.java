package kosta.oop7;

public class Main {

	public static void main(String[] args) {
		SNSMessager sns = new SNSMessager();
		sns.send("ok");
		
		
		MessageSender ms = new MessageSender() {
			
			@Override
			void send(String message) {
				System.out.println("Email send!!!");
				
			}
		};

		ms.send("ok");
		
	}

}
