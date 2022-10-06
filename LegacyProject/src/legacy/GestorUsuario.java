package legacy;

import legacy.Modelo.Usuario;
import legacy.Persistencia.UsuarioControlador;

public class GestorUsuario {
	//Esto nada
	public static boolean autenticar(String login, String password) throws Exception{
		boolean autenticado = false;
		
		if(UsuarioControlador.read(login, password) != null)
			autenticado = true;
		return autenticado;
	}
	

	public static boolean nuevoUsuario(String login, String password) throws Exception{
		boolean insertado = false;
		
		Usuario u = new Usuario(login, password);
		if(u.insert() ==1)
			insertado = true;
		return insertado;		
	}

	public static boolean eliminarUsuario(String login, String pasword)throws Exception{
		Usuario u = new Usuario();
		boolean eliminado;
			u.eliminar();
		return eliminado;
	}

}
