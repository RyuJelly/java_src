package kosta.service;

public class Main {

	public static void main(String[] args) {
		DAO oracle = new OracleDao();
		DAO mysql = new MySQLDao();
		
		//MySQLDao insert 호출 => 익명내부클래스로 구현하시오.
		DAO my = new DAO() {
			
			@Override
			public void insert() {
				System.out.println("MySQLDao insert 호출!!!!");
				
			}
		};
		
		
		Service s = new Service(my);
		
		s.insertService();

	}

}
