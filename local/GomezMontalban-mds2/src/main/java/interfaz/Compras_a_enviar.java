package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaComprasAEnviar;

public class Compras_a_enviar extends VistaComprasAEnviar {
	public Empresa_de_transportes _empresa_de_transportes;
	public Listado_de_compras _listado_de_compras;
	public VerticalLayout layout_compras_a_enviar;
	public VerticalLayout layout_empresa_de_transportes;
	public VerticalLayout layout_listado_de_compras;
	
	public Compras_a_enviar() {
		_empresa_de_transportes = new Empresa_de_transportes();
		_listado_de_compras = new Listado_de_compras();
	}
}