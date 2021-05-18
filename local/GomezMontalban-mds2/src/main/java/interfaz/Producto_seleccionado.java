package interfaz;

import vistas.VistaProductoSeleccionado;

public class Producto_seleccionado extends VistaProductoSeleccionado{
	public Productos_seleccionados _productos_seleccionados;

	public int idUsuario;
	public String nombre, descripcion, precio, foto;
	
	public  Producto_seleccionado(String nombre, String descripcion, String precio, String foto) {

		this.getNombreText().setValue(nombre);
		this.getDescripcionText().setValue(descripcion);
		this.getPrecioText().setValue(precio);
		this.getImagen().setSrc(foto);

		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.foto = foto;
	}
	public void aumentar_unidad_producto() {
		throw new UnsupportedOperationException();
	}

	public void decrementar_unidad_producto() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_producto() {
		throw new UnsupportedOperationException();
	}
}