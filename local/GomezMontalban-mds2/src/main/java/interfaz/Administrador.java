package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.webcomponent.WebComponentExporterTagExtractor;

import vistas.VistaAdministrador;

public class Administrador extends VistaAdministrador {
	public Banner_admin banner_admin;
	public Filtro_por_categoria filtro_por_categoria;
	public Productos_mas_vendidos_admin productos_mas_vendidos_admin;
	public Buscar_producto_admin buscar_producto_admin;
	public VerticalLayout layout_administrador;
	public VerticalLayout layout_cuerpo_administrador;

	
	public Administrador() {
		banner_admin = new Banner_admin();
		layout_administrador = this.getLayoutBannerAdmin().as(VerticalLayout.class);
		
		layout_administrador.removeAll();
		layout_administrador.add(banner_admin);
		
		layout_cuerpo_administrador = this.getLayoutcuerpoAdmin().as(VerticalLayout.class);

		banner_admin.getVaadinButtonAdministrarCategorias().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_categorias);
				layout_cuerpo_administrador.removeAll();
			}
		});
		
		banner_admin.getVaadinButtonAdministrarCuentas().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_cuentas);
				layout_cuerpo_administrador.removeAll();
			}
		});
		
		
		banner_admin.getVaadinButtonAdministrarOfertas().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_ofertas);
				layout_cuerpo_administrador.removeAll();
			}
		});
		
		banner_admin.getVaadinButtonAdministrarProductos().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_productos);
				layout_cuerpo_administrador.removeAll();
			}
		});
		
		banner_admin.getVaadinButtonCerrarSesión().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.cerrar_sesion_admin);
				layout_cuerpo_administrador.removeAll();
			}
		});
		
		banner_admin.getVaadinButtonListadoDeCompras().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.ver_listado_de_compras);
				layout_cuerpo_administrador.removeAll();
			}
		});
		
		banner_admin.getVaadinButtonPrincipal().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.add(banner_admin.administrador);
				
			}
		});
		
		banner_admin.getVaadinButtonCorreo().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.correo_admin);
				layout_cuerpo_administrador.removeAll();
			}
		});
		
		banner_admin.administrar_categorias.getVaadinButtonAceptarAlta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Categoria dada de alta");
			}
		});
		banner_admin.administrar_categorias.getVaadinButtonAceptarBaja().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Categoria dada de baja");
			}
		});
		
		banner_admin.administrar_categorias.getVaadinButtonCancelarAlta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin);
			}
		});
		
		banner_admin.administrar_categorias.getVaadinButtonCancelarBaja().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(new Administrador());
			}
		});
		
		banner_admin.cerrar_sesion_admin.getVaadinButtonCancelar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(layout_cuerpo_administrador);
			}
		});
		
		banner_admin.cerrar_sesion_admin.getVaadinButtonCerrarSesion().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				Notification.show("Sesión finalizada");
				layout_administrador.add(new Administrador());
			}
		});
		
		banner_admin.administrar_cuentas.getVaadinButtonAltaCuentaDeUsuario().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_cuentas._dar_alta_cuenta);
			}
		});
		
		banner_admin.administrar_cuentas.getVaadinButtonBajaCuentaUsuario().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_cuentas._dar_baja_cuenta);
			}
		});
		
		banner_admin.administrar_cuentas._dar_alta_cuenta.getVaadinButtonAceptar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				Notification.show("Dada de alta la cuenta");
			}
		});
		
		banner_admin.administrar_cuentas._dar_alta_cuenta.getVaadinButton().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_cuentas);
				Notification.show("Cancelado");
			}
		});
		
		banner_admin.administrar_cuentas._dar_baja_cuenta.getButtonAceptar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				Notification.show("Dada de baja la cuenta");
			}
		});
		
		banner_admin.administrar_cuentas._dar_baja_cuenta.getButtonCancelar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_cuentas);
				Notification.show("Cancelado");
			}
		});
		
		
	}
}