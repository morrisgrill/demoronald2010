package pe.com.core.dao;

public interface EnvioMensajeDao {
	/**
	 * Pinta un mensaje y el destinatario en la consola.
	 * @param mensaje Mensaje que requiere enviar.
	 * @param destinatario Destinatario al que le llegar&aacute; el
	 * mensaje. 
	 * @return	<code>true</code> si el envio es correcto. 
	 * 	<code>false</code>si no se env&iacute;a correctamente. 
	 */
	public boolean enviarMensaje(String mensaje, String destinatario);
	
	public boolean enviarMensaje(String mensaje, String... destinatarios);

}
