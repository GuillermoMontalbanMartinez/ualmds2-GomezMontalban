package interfaz;

import org.orm.PersistentException;

import vistas.VistaOferta;

public class Oferta extends VistaOferta{
	public Ofertas _ofertas;
	public Mostrar_fecha_limite _mostrar_fecha_limite;
	public Producto _producto;
	
	public Oferta(String nombre, String descripcion, String precio, String foto, int id) {
		_producto = new Producto(nombre, descripcion, precio, foto, id);
		try {
			_producto.setUsuario(null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}