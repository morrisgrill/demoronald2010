package pe.com.core.dao;

public class EnvioMensajeDaoImp implements EnvioMensajeDao{
	
	@Override
	public boolean enviarMensaje(String mensaje, String destinatario){
		System.out.println("Enviando Mensaje");
		System.out.println(" - mensaje : " + mensaje);
		System.out.println(" - destinatario : " + destinatario);
		System.out.println("Mensaje Enviado ");
		return true;
	}

}
