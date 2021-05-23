package interfaz;

import vistas.VistaResenaProducto;

public class Reseña extends VistaResenaProducto {

	public Reseña(String nombre, int valoracion, String comentario) {
		
		this.getNombreText().setValue(nombre);
		this.getContenidoText().setValue(comentario);
		this.getValoracionText().setValue(String.valueOf(valoracion));
	}

}