package basededatos;

import java.util.Vector;
import basededatos.Oferta;

public class Ofertas {
	public BDPrincipal _db_main_ofertas;
	public Vector<Oferta> _contiene_ofertas = new Vector<Oferta>();

	public Oferta[] cargar_ofertas() {
		throw new UnsupportedOperationException();
	}

	public void Alta_oferta_categoria(int aId_categoria, double aDescuento, String aFechaLimite) {
		throw new UnsupportedOperationException();
	}

	public void Alta_oferta_producto(int aId_producto, double aDescuento, String aFechaLimite) {
		throw new UnsupportedOperationException();
	}
}