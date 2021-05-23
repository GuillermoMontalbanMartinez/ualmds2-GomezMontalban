package interfaz;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import vistas.VistaProductoCompradoRecientemente;

public class Producto_comprado_recientemente extends VistaProductoCompradoRecientemente {
	public Productos_comprados_recientemente _productos_comprados_recientemente;
	public Escribir_reseña _escribir_resena = new Escribir_reseña();

	int idProducto;
	int idUsuario;
	
	
	public void volver_a_comprar() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		bd.volver_a_comprar(idProducto, idUsuario);
	}
	
	public void setIdProducto(int id) {
		this.idProducto = id;
		_escribir_resena.setIdProducto(idProducto);


	}
	
	public void setIdUsuario(int id) {

		this.idUsuario = id;
		_escribir_resena.setIdUsuario(idUsuario);


	}
}