package interfaz;

import java.util.ArrayList;

import org.hibernate.mapping.Array;
import org.orm.PersistentException;
import org.springframework.boot.autoconfigure.BackgroundPreinitializer;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaSeguimientoDelPedido;

public class Seguimiento_del_pedido extends VistaSeguimientoDelPedido {
	public Administrar_perfil _administrar_perfil;
	public Pedidos_encargados _pedidos_encargados;
	public int idUsuario;
	public basededatos.Compra[] compras;
	public ArrayList<Pedido_encargado> pedidos = new ArrayList<Pedido_encargado>();
	// public VerticalLayout layout =
	// this.getLayoutPedidos().as(VerticalLayout.class);

	public Seguimiento_del_pedido() {
//		layout=this.getLayoutPedidos().as(VerticalLayout.class);
		_pedidos_encargados = new Pedidos_encargados();
		this.getLayoutPedidos().as(VerticalLayout.class).add(_pedidos_encargados);

	}

	public basededatos.Compra[] cargar_seguimiento_de_pedido(int idUsuario) throws PersistentException {

		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_seguimiento_de_pedido(idUsuario);
	}

	public void mostrarCompras() throws PersistentException {

		compras = this.cargar_seguimiento_de_pedido(idUsuario);
		for (basededatos.Compra c : compras) {
			if (c.getEstado_compra() != 0) {
				int estado = c.getEstado_compra();

				Pedido_encargado p = new Pedido_encargado(
						c.getTiene_item().getEsta_asociado_a_un_producto().getNombre(),
						c.getTiene_item().getEsta_asociado_a_un_producto().getDescripción(),
						c.getTiene_item().getCantidad(),
						c.getTiene_item().getEsta_asociado_a_un_producto().tiene_fotos.toArray()[0].getLink_foto(),
						c.getTiene_item().getEsta_asociado_a_un_producto().getORMID());

				switch (estado) {
				case 1:
					p.getTextEstadoDelPedido().setValue("Pedido confirmado");
					break;
				case 2:
					p.getTextEstadoDelPedido().setValue("Pedido en envio");
					break;
				case 3:
					p.getTextEstadoDelPedido().setValue("Pedido entregado");
					break;

				default:
					p.getTextEstadoDelPedido().setValue("Ha ocurrido un error :(");
					break;
				}

				_pedidos_encargados.getLayoutPedidoEncargado().as(VerticalLayout.class).add(p);
				pedidos.add(p);
			}
		}
	}

	public void eliminar() {
		_pedidos_encargados.getLayoutPedidoEncargado().as(VerticalLayout.class).removeAll();
		pedidos.clear();
	}

	public void setUsuario(int id) {
		this.idUsuario = id;
	}
}