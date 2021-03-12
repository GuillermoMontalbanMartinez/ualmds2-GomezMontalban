package interfaz;

public class Cibernauta extends Cibernauta_común {
	public Banner_no_registrado _banner_no_registrado;
	public Registro _registro;
	
	public Cibernauta() {
		super();
		_banner_no_registrado = new Banner_no_registrado();
	}
}