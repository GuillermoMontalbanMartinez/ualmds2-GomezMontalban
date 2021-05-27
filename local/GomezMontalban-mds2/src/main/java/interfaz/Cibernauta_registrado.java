package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.KeyDownEvent;
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
	private int id;

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
						try {
							_banner_registrado._administrar_perfil._ver_ultimas_compras.limpiar();
							_banner_registrado._administrar_perfil._ver_ultimas_compras.mostrar_productos_comprados();

						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						for (Producto_comprado_recientemente c : _banner_registrado._administrar_perfil._ver_ultimas_compras.compraInterfazList) {
							c.getReseñar().addClickListener(new ComponentEventListener() {

								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout.removeAll();
									layout.add(_banner_registrado);

									layout.add(c._escribir_resena);

								}
							});

							c.getVolverAComprar().addClickListener(new ComponentEventListener() {

								@Override
								public void onComponentEvent(ComponentEvent event) {
									try {
										c.volver_a_comprar();
									} catch (PersistentException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							});

							c.getReseñar().addClickListener(new ComponentEventListener() {

								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout.removeAll();
									layout.add(_banner_registrado);
									layout.add(c._escribir_resena);

								}
							});

							c._escribir_resena.getCancelarButton().addClickListener(new ComponentEventListener() {

								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout.removeAll();
									layout.add(_banner_registrado);
									try {
										_banner_registrado._administrar_perfil._ver_ultimas_compras
												.mostrar_productos_comprados();
										layout.add(_banner_registrado._administrar_perfil);
									} catch (PersistentException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
							});

							c._escribir_resena.getPublicarButton().addClickListener(new ComponentEventListener() {

								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout.removeAll();
									layout.add(_banner_registrado);
									try {
										_banner_registrado._administrar_perfil._ver_ultimas_compras
												.mostrar_productos_comprados();
										layout.add(_banner_registrado._administrar_perfil);
									} catch (PersistentException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
							});

						}
						layout.add(_banner_registrado._administrar_perfil._ver_ultimas_compras);
						layout.add(_banner_registrado._administrar_perfil._ver_ultimas_compras._productos_comprados_recientemente);

					}
				});

		_banner_registrado._administrar_perfil.getSeguimientoPedidos().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado);
				_banner_registrado._administrar_perfil._seguimiento_del_pedido.eliminar();
				try {
					_banner_registrado._administrar_perfil._seguimiento_del_pedido.mostrarCompras();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				layout.add(_banner_registrado._administrar_perfil._seguimiento_del_pedido);

				for (Pedido_encargado p : _banner_registrado._administrar_perfil._seguimiento_del_pedido.pedidos) {
					p.getButtonCancelar().addClickListener(new ComponentEventListener() {

						@Override
						public void onComponentEvent(ComponentEvent event) {
							try {
								p.cancelarPedido();
							} catch (PersistentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});
				}

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

			p.getVerCaracteristicas().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {
					layout.removeAll();
					layout.add(_banner_registrado);
					try {
						p.cargar_resenas();
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					layout.add(p._ver_carácteristicas_del_producto);

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

		_banner_registrado.getBuscardorTextField().addKeyDownListener(com.vaadin.flow.component.Key.ENTER,
				(ComponentEventListener<KeyDownEvent>) keyDownEvent -> {
					layout.removeAll();
					layout.add(_banner_registrado);
					catalogo.eliminar_producto();
					try {
						catalogo.buscarProducto(_banner_registrado.getBuscardorTextField().getValue());

						for (interfaz.Producto p : this.catalogo.vista_productos) {
							p.getButtonAgregarCarrito().addClickListener(new ComponentEventListener() {

								@Override
								public void onComponentEvent(ComponentEvent event) {
									try {
										p.añadir_al_carrito();
									} catch (PersistentException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									layout.removeAll();
									layout.add(_banner_registrado);
									catalogo.eliminar_producto();

								}
							});

							p.getVerCaracteristicas().addClickListener(new ComponentEventListener() {
								@Override
								public void onComponentEvent(ComponentEvent event) {
									Ver_carácteristicas_del_producto v = new Ver_carácteristicas_del_producto(p.idProducto);
									layout.removeAll();
									layout.add(_banner_registrado);
									try {
										p.cargar_resenas();
									} catch (PersistentException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									layout.add(p._ver_carácteristicas_del_producto);

								}
							});

							p._ver_carácteristicas_del_producto.getAnadirAlCarrito()
									.addClickListener(new ComponentEventListener() {

										@Override
										public void onComponentEvent(ComponentEvent event) {
											try {
												p.añadir_al_carrito();
											} catch (PersistentException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											layout.removeAll();
											layout.add(_banner_registrado);
											// layout.add(_buscar_producto);
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

		for (interfaz.Oferta o : this.ofertas) {
			o.getVerCaracteristicasButton().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {
					Ver_carácteristicas_del_producto v = new Ver_carácteristicas_del_producto(o._producto.idProducto);
					layout.removeAll();
					layout.add(_banner_registrado);
					try {
						o._producto.cargar_resenas();
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					layout.add(o._producto._ver_carácteristicas_del_producto);

				}
			});
		}

		
		try {
			mostrar_productos();
			
			
			for(Producto p : vista_productos) {
//				p.getButtonAgregarCarrito().addClickListener(new ComponentEventListener() {
//					@Override
//					public void onComponentEvent(ComponentEvent event) {
//						try {
//							p.añadir_al_carrito();
//						} catch (PersistentException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				});
				p.getVerCaracteristicas().addClickListener(new ComponentEventListener() {
					@Override
					public void onComponentEvent(ComponentEvent event) {
						layout.removeAll();
						layout.add(_banner_registrado);
						try {
							p.cargar_resenas();
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						layout.add(p._ver_carácteristicas_del_producto);

					}
				});
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setUsuario(String usuario) throws PersistentException {
		this.usuario = usuario;

		basededatos.Cibernauta_registrado[] cb = basededatos.Cibernauta_registradoDAO
				.listCibernauta_registradoByQuery(null, null);
		for (basededatos.Cibernauta_registrado c : cb) {
			if (c.getNombre().equals(usuario)) {
				id = c.getORMID();
			}
		}
		_banner_registrado._correo_usuario.setUsuario(id);
		_banner_registrado._correo_usuario._redactar_correo.setAutor(usuario);
		_banner_registrado._administrar_perfil._modificar_datos_personales.setUsuario(id);
		_banner_registrado._carrito_registrado.setUsuario(id);
		catalogo.setUsuario(usuario);
		_banner_registrado._administrar_perfil._dar_de_baja_usuario.setUsuario(id);
		_banner_registrado._administrar_perfil._ver_ultimas_compras.setUsuario(usuario);
		_banner_registrado._administrar_perfil._seguimiento_del_pedido.setUsuario(id);

		for (Oferta o : ofertas) {
			o._producto.setUsuario(usuario);
		}
		
		
		
		for(Producto p : vista_productos) {
			p.getButtonAgregarCarrito().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {
					try {
						p.setUsuario(usuario);
						p.añadir_al_carrito();
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}
	}

	public String getUsuario() {
		return this.usuario;
	}

}