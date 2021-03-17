package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import net.bytebuddy.asm.Advice.This;
import vistas.VistaBannerAdmin;

public class Banner_admin extends VistaBannerAdmin {
	public Administrador administrador;
	public Administrar_ofertas administrar_ofertas;
	public Administrar_productos administrar_productos;
	public Administrar_categorias administrar_categorias;
	public Administrar_cuentas administrar_cuentas;
	public Cerrar_sesion_admin cerrar_sesion_admin;
	public Correo_admin correo_admin;
	public Ver_listado_de_compras ver_listado_de_compras;
	public VerticalLayout layout_banner_admin;
	public VerticalLayout layout_administrador;
	public VerticalLayout layout_administrar_categorias;
	
	public Banner_admin() {
		administrador = new Administrador();
		administrar_ofertas = new Administrar_ofertas();
		administrar_productos = new Administrar_productos();
		administrar_categorias = new Administrar_categorias();
		administrar_cuentas = new Administrar_cuentas();
		cerrar_sesion_admin = new Cerrar_sesion_admin();
		correo_admin = new Correo_admin();
		ver_listado_de_compras = new Ver_listado_de_compras();
		
		layout_banner_admin = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout_administrador = this.administrador.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout_administrar_categorias = this.administrar_categorias.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		this.getVaadinButtonAdministrarCategorias().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso administración de categorías", 200, Position.BOTTOM_END);
				layout_banner_admin.removeAll();
				layout_banner_admin.add(administrar_categorias);
			}
		});
		
		
		
//		pedidos_a_entregar = new Pedidos_a_entregar();
//		pedidos_entregados = new Pedidos_entregados();
//		
//		layout_empresa_de_transportes = this.getVaadinVerticalLayout().as(VerticalLayout.class);
//		layout_pedidos_a_entregar = this.getVaadinVerticalLayout().as(VerticalLayout.class);
//		layout_pedidos_entregados = this.getVaadinVerticalLayoutPedidosEntregados().as(VerticalLayout.class);
//
//		
//		
//		this.getVaadinButtonPedidosAEntregar().addClickListener(new ComponentEventListener() {
//			public void onComponentEvent(ComponentEvent event) {
//				 Notification.show("Acceso a pedidos a entregar");
//				layout_empresa_de_transportes.removeAll();
//				layout_empresa_de_transportes.add(pedidos_a_entregar);
//			}
//		});
	}
}