package interfaz;

import vistas.VistaProducto;

public class Producto extends VistaProducto {
	public Oferta _oferta;
	public Productos _productos;
	public Ver_carácteristicas_del_producto _ver_carácteristicas_del_producto;
	
	public Producto(String nombre, String descripcion, String precio, String foto) {
		
		this.getTextNombre().setValue(nombre);
		this.getTextDescripcion().setValue(descripcion);
		this.getTextPrecio().setValue(precio);
		this.getIdFoto().setSrc(foto);
		
	}

	public void añadir_al_carrito() {
		throw new UnsupportedOperationException();
	}
}