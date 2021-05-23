package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cibernauta_registrado extends Cibernauta_común {
	public Banner_registrado _banner_registrado;
	public HorizontalLayout banner;
	public VerticalLayout layout;
	private String usuario;
	Acceder_al_catalogo catalogo;
	public Producto producto;

	public Cibernauta_registrado() {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		_banner_registrado = new Banner_registrado();
		banner = this.getBanner();
		banner.add(_banner_registrado);

		catalogo = new Acceder_al_catalogo();

		_banner_registrado.getCorreo().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado);
				layout.add(_banner_registrado._correo_usuario);
				try {
					_banner_registrado._correo_usuario.eliminar_correos();

					_banner_registrado._correo_usuario.mostra_correos();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				for (Email email : _banner_registrado._correo_usuario.emails) {

					email.getVerButton().addClickListener(t -> {
						layout.remove(_banner_registrado._correo_usuario);
						layout.add(email._ver_email);
						if (email.getVaadinTextField().getValue().equals("Administrador")) {
							email._ver_email.getResponderButton().setEnabled(false);
						}
					});

					email._ver_email.getAtrasButton().addClickListener(new ComponentEventListener() {

						@Override
						public void onComponentEvent(ComponentEvent event) {
							layout.remove(email._ver_email);
							layout.add(_banner_registrado._correo_usuario);

						}
					});

					email._ver_email.getResponderButton().addClickListener(new ComponentEventListener() {

						@Override
						public void onComponentEvent(ComponentEvent event) {
							layout.remove(email._ver_email);
							layout.add(_banner_registrado._correo_usuario._redactar_correo);
							_banner_registrado._correo_usuario._redactar_correo.getDestinatarioText()
									.setValue(email.getVaadinTextField().getValue().toString());
							_banner_registrado._correo_usuario._redactar_correo.getAsuntoText()
									.setValue("RE: " + email.getAsuntoText().getValue().toString());
						}

					});

				}

			}
		});

		_banner_registrado._correo_usuario.getRedactarButton().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.remove(_banner_registrado._correo_usuario);
				layout.add(_banner_registrado._correo_usuario._redactar_correo);

			}

		});

		_banner_registrado.getPerfil().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado);

				layout.add(_banner_registrado._administrar_perfil);

			}
		});

		_banner_registrado._administrar_perfil.getUltimasComprasRealizadas()
				.addClickListener(new ComponentEventListener() {

					@Override
					public void onComponentEvent(ComponentEvent event) {
						layout.removeAll();
						layout.add(_banner_registrado);

						layout.add(_banner_registrado._administrar_perfil._ver_ultimas_compras);

					}
				});

		_banner_registrado._administrar_perfil.getSeguimientoPedidos().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado);

				layout.add(_banner_registrado._administrar_perfil._seguimiento_del_pedido);

			}
		});

		_banner_registrado._administrar_perfil.getModificarDatosPersonales()
				.addClickListener(new ComponentEventListener() {

					@Override
					public void onComponentEvent(ComponentEvent event) {
						layout.removeAll();
						layout.add(_banner_registrado);

						layout.add(_banner_registrado._administrar_perfil._modificar_datos_personales);

					}
				});

		_banner_registrado._administrar_perfil.getModificarDatosPersonales()
				.addClickListener(new ComponentEventListener() {

					@Override
					public void onComponentEvent(ComponentEvent event) {
						layout.removeAll();
						layout.add(_banner_registrado);

						layout.add(_banner_registrado._administrar_perfil._modificar_datos_personales);

					}
				});

		_banner_registrado._administrar_perfil.getDarBajaCuenta().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("prueba");
				layout.removeAll();
				layout.add(_banner_registrado);

				layout.add(_banner_registrado._administrar_perfil._dar_de_baja_usuario);

			}
		});

		_banner_registrado._administrar_perfil.getCerrarSesion().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado);

				layout.add(_banner_registrado._administrar_perfil._cerrar_sesion);

			}
		});

		_banner_registrado._administrar_perfil._cerrar_sesion.getCancelarBoton()
				.addClickListener(new ComponentEventListener() {

					@Override
					public void onComponentEvent(ComponentEvent event) {
						layout.removeAll();
						layout.add(_banner_registrado);

						layout.add(_banner_registrado._administrar_perfil);

					}
				});

		this.getMostrarProductos().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado);
				layout.add(catalogo);

			}
		});

		this._banner_registrado.getCarritoButton().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {

				_banner_registrado._carrito_registrado.eliminar_productos();

				try {
					_banner_registrado._carrito_registrado.mostrar_productos();
				} catch (PersistentException e) {
					e.printStackTrace();
				}
				layout.removeAll();
				layout.add(_banner_registrado);
				layout.add(_banner_registrado._carrito_registrado);

			}
		});

		this._banner_registrado._correo_usuario._redactar_correo.getCancelar()
				.addClickListener(new ComponentEventListener() {

					@Override
					public void onComponentEvent(ComponentEvent event) {
						layout.remove(_banner_registrado._correo_usuario._redactar_correo);
						layout.add(_banner_registrado._correo_usuario);

					}
				});

		this._banner_registrado._correo_usuario._redactar_correo.getEnviar()
				.addClickListener(new ComponentEventListener() {

					@Override
					public void onComponentEvent(ComponentEvent event) {
						layout.remove(_banner_registrado._correo_usuario._redactar_correo);
						layout.add(_banner_registrado._correo_usuario);

					}
				});

		for (Producto p : catalogo.vista_productos) {

			p.getButtonAgregarCarrito().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {
					try {
						p.añadir_al_carrito();
					} catch (PersistentException e) {
						e.printStackTrace();
					}
				}
			});

		}

		this._banner_registrado._administrar_perfil._modificar_datos_personales.getButtonCancelar()
				.addClickListener(new ComponentEventListener() {
					@Override
					public void onComponentEvent(ComponentEvent event) {
						layout.remove(_banner_registrado._administrar_perfil._modificar_datos_personales);
						layout.add(_banner_registrado._administrar_perfil);
					}
				});

		this._banner_registrado._administrar_perfil._dar_de_baja_usuario.getButtonCancelarBajaUsuario()
				.addClickListener(new ComponentEventListener() {
					@Override
					public void onComponentEvent(ComponentEvent event) {
						layout.remove(_banner_registrado._administrar_perfil._dar_de_baja_usuario);
						layout.add(_banner_registrado._administrar_perfil);
					}
				});

//		// No da de baja al usuario
//		this._banner_registrado._administrar_perfil._dar_de_baja_usuario.getButtonConfirmarBajaUsuario()
//				.addClickListener(new ComponentEventListener() {
//					@Override
//					public void onComponentEvent(ComponentEvent event) {
//						Notification.show("prueba 2");
//						// layout.remove(_banner_registrado._administrar_perfil._dar_de_baja_usuario);
//						// layout.add(_banner_registrado._administrar_perfil);
//					}
//				});
		
		// this._banner_registrado._carrito_registrado._modificar_datos_personales.getb

		
		
	}

	public void setUsuario(String usuario) throws PersistentException {
		this.usuario = usuario;
		_banner_registrado._correo_usuario.setUsuario(usuario);
		_banner_registrado._correo_usuario._redactar_correo.setAutor(usuario);
		_banner_registrado._administrar_perfil._modificar_datos_personales.setUsuario(usuario);
		_banner_registrado._carrito_registrado.setUsuario(usuario);
		catalogo.setUsuario(usuario);
		_banner_registrado._administrar_perfil._dar_de_baja_usuario.setUsuario(usuario);

	}

	public String getUsuario() {
		return this.usuario;
	}

}