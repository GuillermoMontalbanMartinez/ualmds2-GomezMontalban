package interfaz;

import java.util.ArrayList;
import java.util.Optional;

import org.orm.PersistentException;

import com.example.test.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.server.webcomponent.WebComponentExporterTagExtractor;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Producto;
import vistas.VistaAdministrador;

public class Administrador extends VistaAdministrador {
	public Banner_admin banner_admin;
	public Filtro_por_categoria filtro_por_categoria;
	public Productos_mas_vendidos_admin productos_mas_vendidos_admin;
	public Buscar_producto_admin buscar_producto_admin;
	public VerticalLayout layout_administrador;
	public VerticalLayout layout_cuerpo_administrador;
	public Acceder_al_catalogo_admin catalogoAdmin;
	public Productos_mas_vendidos _productos_mas_vendidos = new Productos_mas_vendidos();
	public Producto[] producto_mas_vendido = null;
	ArrayList<interfaz.Producto_admin> vista_productos;

	Select<Categoria> select = new Select<Categoria>();
	String value = null;

	public Administrador() {
		vista_productos = new ArrayList<interfaz.Producto_admin>();
		banner_admin = new Banner_admin();
		layout_administrador = this.getLayoutBannerAdmin().as(VerticalLayout.class);
		layout_administrador.removeAll();
		layout_administrador.add(banner_admin);
		layout_cuerpo_administrador = this.getLayoutcuerpoAdmin().as(VerticalLayout.class);
		catalogoAdmin = new Acceder_al_catalogo_admin();
		filtro_por_categoria = new Filtro_por_categoria();

		try {

			mostrar_productos();

			select.setItemLabelGenerator(Categoria::getNombre);

			select.setItems(this.cargar_categoria());

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.getVistaFiltroCategoria().getSelectLayout().as(VerticalLayout.class).add(select);

		select.addValueChangeListener(event -> {
			if (event.getValue() != null) {
				value = event.getValue().getNombre().toString();
				try {
					eliminar_producto();
					mostrar_productos();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	
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
				layout_administrador.add(banner_admin.administrar_cuentas);	
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
				layout_administrador.add(banner_admin.administrar_cuentas);
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
		
		banner_admin.administrar_productos.getVaadinButtonAnadirProductos().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_productos._dar_alta_producto);
			}
		});
		
		banner_admin.administrar_productos.getVaadinButtonEliminarProducto().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_productos._dar_baja_producto);
			}
		});
		
		
		banner_admin.administrar_productos._dar_alta_producto.getButtonCancelar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_productos);
				Notification.show("Cancelado");
			}
		});
		
		banner_admin.administrar_productos._dar_baja_producto.getButtonAceptar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_productos);
				Notification.show("Dado de baja el producto");
			}
		});
		
		banner_admin.administrar_productos._dar_baja_producto.getButtonCancelar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_productos);
				Notification.show("Cancelado");
			}
		});
		
		// EMPIEZA OFERTAS
		
		banner_admin.administrar_ofertas.getVaadinButtonAgregarOfertas().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_ofertas._publicar_oferta);
			}
		});
		
		banner_admin.administrar_ofertas.getVaadinButtonEliminarOfertas().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_ofertas._eliminar_oferta);
			}
		});
		
		banner_admin.administrar_ofertas._publicar_oferta.getButtonPublicarOferta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_ofertas);
				Notification.show("Publicada la oferta del producto");
			}
		});
		
		banner_admin.administrar_ofertas._publicar_oferta.getButtonCancelar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_ofertas);
				Notification.show("Cancelado");
			}
		});
		

		banner_admin.administrar_ofertas._eliminar_oferta.getButtonEliminarOfertaProducto().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_ofertas);
				Notification.show("Eliminada la oferta del producto");
			}
		});
		
		banner_admin.administrar_ofertas._eliminar_oferta.getButtonCancelarOfertaProducto().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(banner_admin.administrar_ofertas);
				Notification.show("Cancelado");
			}
		});
		
		this.getVaadinButtonMostrarTodosLosProductos().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrador.removeAll();
				layout_cuerpo_administrador.removeAll();
				layout_administrador.add(banner_admin);
				layout_administrador.add(catalogoAdmin);
			}
		});
		
		for (Producto_admin p : catalogoAdmin.vista_productos) {

			
			
			p.getButtonVerCaracteristicasDelProducto().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {
					Ver_carácteristicas_del_producto v = new  Ver_carácteristicas_del_producto();
					layout_administrador.removeAll();
					layout_administrador.add(banner_admin);
					layout_administrador.add(p._caracteristicas_del_producto_admin);

				}
			});
		}
	}

	private void mostrar_productos() throws PersistentException {
		producto_mas_vendido = _productos_mas_vendidos.cargar_productos_mas_vendidos();
		int aux = 0;
		for (Producto p : producto_mas_vendido) {

			if (aux > 2) {
				break;
			} else {
				if (value != null) {
					if (p.getCategoria().getNombre().equals(value)) {
						interfaz.Producto_admin producto = new interfaz.Producto_admin(p.getNombre(),
								p.getDescripción(), String.valueOf(p.getPrecio()),
								p.tiene_fotos.toArray()[0].getLink_foto(), p.getORMID());
						this.getVistaProducto().getProductosLayout().as(VerticalLayout.class).add(producto);
						vista_productos.add(producto);
						aux++;

					}
				} else {
					interfaz.Producto_admin producto = new interfaz.Producto_admin(p.getNombre(), p.getDescripción(),
							String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto(), p.getORMID());

					this.getVistaProducto().getProductosLayout().as(VerticalLayout.class).add(producto);
					vista_productos.add(producto);
					aux++;

				}
			}

		}
		aux = 0;
	}

	public void eliminar_producto() {
		this.getVistaProducto().getProductosLayout().as(VerticalLayout.class).removeAll();
		vista_productos.clear();
	}

	public basededatos.Producto[] cargar_ofertas_producto() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_oferta_producto();
	}

	public Categoria[] cargar_categoria() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_categoria();
	}

}