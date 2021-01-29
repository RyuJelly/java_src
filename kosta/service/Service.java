package kosta.service;

public class Service{
	private DAO dao;
	
	public Service() {
	}
	
	public Service(DAO dao) {
		super();
		this.dao = dao;
	}

	public void insertService() {
		dao.insert();
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}



}
