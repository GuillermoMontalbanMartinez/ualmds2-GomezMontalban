package interfaz;

import interfaz.Productos_mas_vendidos;
import interfaz.Producto;

public class producto_mas_vendido extends Producto {
	public Productos_mas_vendidos _productos_mas_vendidos;

public  producto_mas_vendido(String nombre, String descripcion, String precio, String foto) {
		
		super(nombre, descripcion, precio, foto);
		
		
	}
	public Productos_mas_vendidos get_productos_mas_vendidos() {
		return _productos_mas_vendidos;
	}

	public void set_productos_mas_vendidos(Productos_mas_vendidos _productos_mas_vendidos) {
		this._productos_mas_vendidos = _productos_mas_vendidos;
	}
}