package pe.com.core.prueba;

import pe.com.core.dao.EnvioMensajeDaoImp;
import pe.com.core.service.EnvioMensajeService;

public class MainPueba {
	
	public static void main(String[] args){
		EnvioMensajeService service = new EnvioMensajeService();
		service.setEnvioMensajeDao(new EnvioMensajeDaoImp());
		
		/*invocando al servicio*/
		service.enviarMensaje("Ronald ve a comer", "Maria");
		
		/*envio de mensajes a destinatarios adicionales*/
		
		service.enviarMensaje("Ronald ve a comer", "Ronald", " Maria", "Pedro" , "Renzo");
		
		
	}

}
