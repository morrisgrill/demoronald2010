package pe.com.core.service;

import pe.com.core.dao.EnvioMensajeDao;

public class EnvioMensajeService {

	private EnvioMensajeDao envioMensajeDao;
	
	public void setEnvioMensajeDao(EnvioMensajeDao envioMensajeDao) {
		this.envioMensajeDao = envioMensajeDao;
	}

	public void enviarMensaje(String mensaje, String destinatario ){
		envioMensajeDao.enviarMensaje(mensaje, destinatario);
	}
	
	public void enviarMensaje(String mensaje, String... destinatario ){
		envioMensajeDao.enviarMensaje(mensaje, destinatario);
	}
	
}
