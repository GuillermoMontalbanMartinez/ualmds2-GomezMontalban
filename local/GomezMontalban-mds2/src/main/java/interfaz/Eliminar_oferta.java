package interfaz;

import vistas.VistaEliminarOferta;

public class Eliminar_oferta extends VistaEliminarOferta {
	public Administrar_ofertas _administrar_ofertas;
	
	public Eliminar_oferta() {
		
	}

	public void Baja_oferta() {
		throw new UnsupportedOperationException();
	}

	public Administrar_ofertas get_administrar_ofertas() {
		return _administrar_ofertas;
	}

	public void set_administrar_ofertas(Administrar_ofertas _administrar_ofertas) {
		this._administrar_ofertas = _administrar_ofertas;
	}
}