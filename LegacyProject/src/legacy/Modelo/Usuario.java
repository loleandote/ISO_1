package legacy.Modelo;


public class Usuario {
	
	private String mLogin;
	private String mPassword;
	
	
	//Constructor para la creaci�n de un objeto Usuario vacio
	public Usuario(){
		this.mLogin = null;
		this.mPassword = null;
	}
	
	//Constructor para la creaci�n de un Usuario
	public Usuario(String login, String password){
		this.mLogin = login;
		this.mPassword = password;
	}
	
}