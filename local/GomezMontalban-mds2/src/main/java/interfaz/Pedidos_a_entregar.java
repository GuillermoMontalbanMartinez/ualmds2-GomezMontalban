package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import basededatos.BDPrincipal;
import basededatos.Compra_recibida;
import basededatos.Correo;
import vistas.VistaPedidosAEntregar;
import vistas.VistaProductoAEnviar;

public class Pedidos_a_entregar extends VistaPedidosAEntregar {
	public Pedidos_entregados pedidos_entregados;
	public VerticalLayout layout_pedidos_a_entregar;
	public VerticalLayout listaPedidosAEntregar;
	public ArrayList<Producto_a_enviar> pedidos = new ArrayList<Producto_a_enviar>();
	public Compra_recibida[] compraRecibida = null;


	public Pedidos_a_entregar() {
		layout_pedidos_a_entregar = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		listaPedidosAEntregar = this.getLayoutvistaProductosAEnviar().as(VerticalLayout.class);
	}

	public void cargar_pedidos_a_entregar() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		compraRecibida = bd.cargar_pedidos_a_entregar();
	}

	public void mostrar_pedidos_a_entregar() throws PersistentException {
		cargar_pedidos_a_entregar();
		for (Compra_recibida cr : compraRecibida) {
			Producto_a_enviar productoAEnviar = new Producto_a_enviar(cr.getORMID());
			pedidos.add(productoAEnviar);
			listaPedidosAEntregar.add(productoAEnviar);
		}

	}

	public void eliminar_pedidos_a_entregar() {
		listaPedidosAEntregar.removeAll();
		pedidos.clear();
	}

}