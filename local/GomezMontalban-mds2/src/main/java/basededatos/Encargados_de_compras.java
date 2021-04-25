package basededatos;

import java.util.Vector;
import basededatos.Encargado_de_compras;

public class Encargados_de_compras {
	public BDPrincipal _db_main_encargado_de_compras;
	public Vector<Encargado_de_compras> _contiene_encargado_de_compras = new Vector<Encargado_de_compras>();

	public void Alta_cuenta(String aNombre, String aCorreo, String aContrasena, int aTipoDeUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Baja_cuenta(String aCorreo, int aTipoDeUsuario, int aId_usuario) {
		throw new UnsupportedOperationException();
	}
}