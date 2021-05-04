package interfaz;

import vistas.VistaDarAltaProducto;

public class Dar_alta_producto extends VistaDarAltaProducto {
	public Administrar_productos _administrar_productos;
	
	public Dar_alta_producto() {
		
	}
	
	public void Alta_producto() {
		throw new UnsupportedOperationException();
	}

	public Administrar_productos get_administrar_productos() {
		return _administrar_productos;
	}

	public void set_administrar_productos(Administrar_productos _administrar_productos) {
		this._administrar_productos = _administrar_productos;
	}
}