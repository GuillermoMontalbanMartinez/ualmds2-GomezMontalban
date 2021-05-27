package interfaz;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import vistas.VistaProductoCompradoRecientemente;

public class Producto_comprado_recientemente extends VistaProductoCompradoRecientemente {
	public Productos_comprados_recientemente _productos_comprados_recientemente;
	public Escribir_reseña _escribir_resena;

	int idProducto;
	int idUsuario;
	
	
	
	
	public void volver_a_comprar() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		bd.volver_a_comprar(idProducto, idUsuario);
	}
	
	public void setIds(int idProducto, int idUsuario) {
		this.idProducto = idProducto;
		this.idUsuario = idUsuario;
		
		_escribir_resena = new Escribir_reseña(idProducto, idUsuario);

	}
	
	
}