package kosta.service;

public class Main {

	public static void main(String[] args) {
		DAO oracle = new OracleDao();
		DAO mysql = new MySQLDao();
		Service s = new Service(mysql);
		
		s.insertService();

	}

}
