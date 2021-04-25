package basededatos;

import java.util.Vector;
import basededatos.Administrador;

public class Administradores {
	public BDPrincipal _bd_main_administradores;
	public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

	public void Alta_cuenta(String aNombre, String aCorreo, String aContrasena, int aTipoDeUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Baja_cuenta(String aCorreo, int aTipoDeUsuario, int aId_usuario) {
		throw new UnsupportedOperationException();
	}
}