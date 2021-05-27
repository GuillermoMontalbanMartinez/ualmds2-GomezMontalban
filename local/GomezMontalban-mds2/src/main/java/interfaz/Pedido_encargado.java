package interfaz;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import vistas.VistaPedidoEncargado;

public class Pedido_encargado extends VistaPedidoEncargado{
	public Pedidos_encargados _pedidos_encargados;
	public int idCompra;
	
	public Pedido_encargado(String nombre, String descripción, int cantidad, String link_foto, int id) {
		this.idCompra = id;
		this.getNombreText().setValue(nombre);
		this.getTextDescripcion().setValue(descripción);
		this.getCantidadText().setValue(String.valueOf(cantidad));
		this.getImagen().setSrc(link_foto);

		
	}

	public void cancelarPedido() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		bd.cancelarPedido(idCompra);
	}
}