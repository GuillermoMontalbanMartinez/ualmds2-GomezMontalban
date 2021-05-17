package basededatos;

import java.util.Vector;
import basededatos.Compra_pendiente;

public class Compras_pendientes {
	public BDPrincipal _db_main_compras_pendientes;
	public Vector<Compra_pendiente> _contiene_compras_pendientes = new Vector<Compra_pendiente>();
	
	public Compra_pendiente[] cargar_pedidos_a_entregar() {
		throw new UnsupportedOperationException();
	}

	public void confirmar_compra(int aId_compra) {
		throw new UnsupportedOperationException();
	}
}