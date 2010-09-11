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

	@Override
	public boolean enviarMensaje(String mensaje, String... destinatarios) {
		System.out.println("Enviando Mensaje");
		System.out.println(" - mensaje : " + mensaje);
		
		String[] dest = destinatarios;
		
		for (int i = 0; i < dest.length; i++) {
			String d = dest[i];
			System.out.println(" - destinatario : " + d);
		}

		System.out.println("Mensaje Enviado ");
		
		return false;
	}

}
