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
//	public VerticalLayout layout_banner_admin;
//	public VerticalLayout layout_administrador;
//	public VerticalLayout layout_administrar_categorias;
	
	public Banner_admin() {
		administrar_categorias = new Administrar_categorias();

	}
}