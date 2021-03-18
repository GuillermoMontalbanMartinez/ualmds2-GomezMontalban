package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrador;

public class Administrador extends VistaAdministrador {
	public Banner_admin banner_admin;
	public Filtro_por_categoria filtro_por_categoria;
	public Productos_mas_vendidos_admin productos_mas_vendidos_admin;
	public Buscar_producto_admin buscar_producto_admin;
	public VerticalLayout layout_administrador;
	public VerticalLayout layout_banner_administrador;
	
	public Administrador() {
//		this.layout_administrador = this.getVaadinVerticalLayoutAdministrador();
//		banner_admin = new Banner_admin();
//		layout_banner_administrador = this.getVistaBannerAdmin();
//		layout_banner_administrador.add(banner_admin);
		layout_administrador = this.getVaadinVerticalLayoutAdministrador().as(VerticalLayout.class);
		banner_admin = new Banner_admin();
//		layout_banner_administrador = this.layout_banner_administrador;
		layout_banner_administrador.add(banner_admin);
		
		banner_admin.getVaadinButtonAdministrarCategorias().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin.administrar_categorias);
			}
		});
	}
}