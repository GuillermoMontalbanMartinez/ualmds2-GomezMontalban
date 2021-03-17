package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrador;

public class Administrador extends VistaAdministrador {
	public Banner_admin banner_admin;
	public Filtro_por_categoria filtro_por_categoria;
	public Productos_mas_vendidos_admin productos_mas_vendidos_admin;
	public Buscar_producto_admin buscar_producto_admin;
	public VerticalLayout layout_administrador;
	
	public Administrador() {
		banner_admin = new Banner_admin();
		layout_administrador = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout_administrador.removeAll();
	}

	public Banner_admin getBanner_admin() {
		return banner_admin;
	}

	public void setBanner_admin(Banner_admin banner_admin) {
		this.banner_admin = banner_admin;
	}

	public Filtro_por_categoria getFiltro_por_categoria() {
		return filtro_por_categoria;
	}

	public void setFiltro_por_categoria(Filtro_por_categoria filtro_por_categoria) {
		this.filtro_por_categoria = filtro_por_categoria;
	}

	public Productos_mas_vendidos_admin getProductos_mas_vendidos_admin() {
		return productos_mas_vendidos_admin;
	}

	public void setProductos_mas_vendidos_admin(Productos_mas_vendidos_admin productos_mas_vendidos_admin) {
		this.productos_mas_vendidos_admin = productos_mas_vendidos_admin;
	}

	public Buscar_producto_admin getBuscar_producto_admin() {
		return buscar_producto_admin;
	}

	public void setBuscar_producto_admin(Buscar_producto_admin buscar_producto_admin) {
		this.buscar_producto_admin = buscar_producto_admin;
	}

	public VerticalLayout getLayout_administrador() {
		return layout_administrador;
	}

	public void setLayout_administrador(VerticalLayout layout_administrador) {
		this.layout_administrador = layout_administrador;
	}
}