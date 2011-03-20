package com.seguridad;

public class Usuario {

	public static boolean validarUsuario(String login, String pass){
		if(login.equals("992970357") && pass.equals("123456")){
			return true;
		}
		return false;
		
	}
}
