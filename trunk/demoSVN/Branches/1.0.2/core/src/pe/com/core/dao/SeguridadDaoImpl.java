/**
 * 
 */
package pe.com.core.dao;

/**
 * @author Ronald
 *
 */
public class SeguridadDaoImpl implements SeguridadDao {

	@Override
	public boolean logueaUsuario(String usuario, String password) {
		
		boolean usuarioIngresa= false;
		if(usuario.equals("admin") && password.equals("admin")){
			usuarioIngresa= true;
		}
		return usuarioIngresa;
	}

}
