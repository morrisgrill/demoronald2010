package pe.com.core.service;

import pe.com.core.dao.SeguridadDao;

public class SeguridadService {

	private SeguridadDao dao;
	
	public boolean loguearusuario(String usuario, String password){
		
		return dao.logueaUsuario(usuario, password);
	}

	public void setDao(SeguridadDao dao) {
		this.dao = dao;
	}
	
	
}
