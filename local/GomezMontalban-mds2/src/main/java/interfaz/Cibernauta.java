package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasValue.ValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.KeyDownEvent;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import vistas.VistaBuscarProducto;

public class Cibernauta extends Cibernauta_común {
	public Banner_no_registrado _banner_no_registrado;
	public HorizontalLayout banner;
	public VerticalLayout layout;
	public Acceder_al_catalogo catalogo;
	public Iniciar_sesion inicio_sesion;
	public Registro registro;

	public Cibernauta() {
		super();
		_banner_no_registrado = new Banner_no_registrado();
		banner = this.getBanner();
		banner.add(_banner_no_registrado);
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		inicio_sesion = new Iniciar_sesion();
		catalogo = new Acceder_al_catalogo();
		try {
			catalogo.setUsuario("");
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		_banner_no_registrado.getVaadinButton().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {

				// layout.setVisible(false);
				layout.removeAll();
				layout.add(_banner_no_registrado);
				layout.add(inicio_sesion);
				catalogo.eliminar_producto();

			}
		});

		inicio_sesion.getBottonRegistro().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_no_registrado);
				layout.add(inicio_sesion._registro);

			}
		});

		this.getMostrarProductos().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_no_registrado);
				layout.add(catalogo);

			}
		});

		inicio_sesion._registro.getButtonCancelar().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.remove(inicio_sesion._registro);
				layout.add(inicio_sesion);

			}
		});

		for (interfaz.Producto p : this.catalogo.vista_productos) {
			p.getButtonAgregarCarrito().addClickListener(new ComponentEventListener() {

				@Override
				public void onComponentEvent(ComponentEvent event) {
					layout.removeAll();
					layout.add(_banner_no_registrado);
					layout.add(inicio_sesion);
					catalogo.eliminar_producto();

				}
			});

			p.getVerCaracteristicas().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {
					Ver_carácteristicas_del_producto v = new Ver_carácteristicas_del_producto();
					layout.removeAll();
					layout.add(_banner_no_registrado);
					layout.add(p._ver_carácteristicas_del_producto);

				}
			});

		}

		_banner_no_registrado.getBuscadorTextField().addKeyDownListener(com.vaadin.flow.component.Key.ENTER,
				(ComponentEventListener<KeyDownEvent>) keyDownEvent -> {
					System.out.println(_banner_no_registrado.getBuscadorTextField().getValue());
					layout.removeAll();
					layout.add(_banner_no_registrado);
					catalogo.eliminar_producto();
					try {
						catalogo.buscarProducto(_banner_no_registrado.getBuscadorTextField().getValue());

						for (interfaz.Producto p : this.catalogo.vista_productos) {
							p.getButtonAgregarCarrito().addClickListener(new ComponentEventListener() {

								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout.removeAll();
									layout.add(_banner_no_registrado);
									layout.add(inicio_sesion);
									catalogo.eliminar_producto();

								}
							});

							p.getVerCaracteristicas().addClickListener(new ComponentEventListener() {
								@Override
								public void onComponentEvent(ComponentEvent event) {
									Ver_carácteristicas_del_producto v = new Ver_carácteristicas_del_producto();
									layout.removeAll();
									layout.add(_banner_no_registrado);
									layout.add(p._ver_carácteristicas_del_producto);

								}
							});
							
							
							p._ver_carácteristicas_del_producto.getAnadirAlCarrito().addClickListener(new ComponentEventListener() {

								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout.removeAll();
									layout.add(_banner_no_registrado);
									layout.add(inicio_sesion);
									catalogo.eliminar_producto();

								}
							});
							
						}

					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					layout.add(catalogo);
				});

	}

}