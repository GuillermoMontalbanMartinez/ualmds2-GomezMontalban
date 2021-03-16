package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPedidosEntregados;

public class Pedidos_entregados extends VistaPedidosEntregados {
	public Encargado_de_compras _encargado_de_compras;
	public Productos_enviados _productos_enviados;
	public Pedidos_a_entregar pedidos_a_entregar;
	public VerticalLayout layout_pedidos_entregados;
	
	public Pedidos_entregados() {
		pedidos_a_entregar = new Pedidos_a_entregar();
		
	}
}