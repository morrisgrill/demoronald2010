package pe.com.core.prueba;

import pe.com.core.dao.EnvioMensajeDaoImp;
import pe.com.core.dao.SeguridadDao;
import pe.com.core.dao.SeguridadDaoImpl;
import pe.com.core.service.EnvioMensajeService;
import pe.com.core.service.SeguridadService;

public class MainPueba {
	
	public static void main(String[] args){
		EnvioMensajeService service = new EnvioMensajeService();
		service.setEnvioMensajeDao(new EnvioMensajeDaoImp());
		
		SeguridadService seguridadService = new SeguridadService();
		seguridadService.setDao(new SeguridadDaoImpl());
		
		/*invocando al servicio*/
		service.enviarMensaje("Ronald ve a comer", "Maria");
		
		/*envio de mensajes a destinatarios adicionales*/
		
		service.enviarMensaje("Ronald ve a comer", "Ronald", " Maria", "Pedro" , "Renzo");
		
		
		if(seguridadService.loguearusuario("admin", "admin")){
			System.out.println("ingreso");
		}else{
			System.out.println("no ingreso");
		}
		
	}

}
