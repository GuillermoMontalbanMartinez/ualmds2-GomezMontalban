package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Compra_recibida;
import vistas.VistaPedidosEntregados;

public class Pedidos_entregados extends VistaPedidosEntregados {
	public Pedidos_a_entregar pedidos_a_entregar;
	public VerticalLayout layout_pedidos_entregados;
	public VerticalLayout listaPedidosEntregados;
	public ArrayList<Producto_enviado> enviados = new ArrayList<Producto_enviado>();
	public basededatos.Compra_enviada[] comprasEnviadas;

	public Pedidos_entregados() {
		layout_pedidos_entregados = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		listaPedidosEntregados = this.getLayoutVistaProductosEnviados().as(VerticalLayout.class);
	}

	public void cargar_pedidos_entregados() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		comprasEnviadas = bd.cargar_pedidos_entregados();
	}

	public void mostrar_pedidos_entregados() throws PersistentException {
		cargar_pedidos_entregados();
		for (basededatos.Compra_enviada ce : comprasEnviadas) {
			Producto_enviado productoEnviado = new Producto_enviado(ce.getORMID());
			enviados.add(productoEnviado);
			listaPedidosEntregados.add(productoEnviado);
		}
	}

	public void eliminar_pedidos_entregados() {
		listaPedidosEntregados.removeAll();
		enviados.clear();
	}

}