package interfaz;

import org.orm.PersistentException;
import org.springframework.boot.autoconfigure.BackgroundPreinitializer;

import basededatos.BDPrincipal;
import vistas.VistaSeguimientoDelPedido;

public class Seguimiento_del_pedido extends VistaSeguimientoDelPedido {
	public Administrar_perfil _administrar_perfil;
	public Pedidos_encargados _pedidos_encargados;
	public int idUsuario;
	public basededatos.Compra[] compras;
	
	public Seguimiento_del_pedido() {
		try {
			compras = this.cargar_seguimiento_de_pedido(idUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public basededatos.Compra[] cargar_seguimiento_de_pedido(int idUsuario) throws PersistentException {
		
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_seguimiento_de_pedido(idUsuario);
	}
 }