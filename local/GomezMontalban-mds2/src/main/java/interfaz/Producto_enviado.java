package interfaz;

import vistas.VistaProductoEnviado;

public class Producto_enviado extends VistaProductoEnviado {
	public Productos_enviados _productos_enviados;
	
	public Producto_enviado(int idPedido) {
		this.getTextNumeroPedido().setValue(String.valueOf(idPedido));
	}
}