package basededatos;

import java.util.Vector;
import basededatos.Empresa_de_transportes;

public class Empresas_de_transportes {
	public BDPrincipal _db_main_empresas_de_transporte;
	public Vector<Empresa_de_transportes> _contiene_empresa_de_transporte = new Vector<Empresa_de_transportes>();

	public void Alta_cuenta(String aNombre, String aCorreo, String aContrasena, int aTipoDeUsuario, String aApellidos) {
		throw new UnsupportedOperationException();
	}

	public void Baja_cuenta(String aCorreo, int aTipoDeUsuario, int aId_usuario) {
		throw new UnsupportedOperationException();
	}
}