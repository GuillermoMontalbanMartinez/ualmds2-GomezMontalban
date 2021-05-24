package interfaz;

import java.awt.Component;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Compra_recibida;
import vistas.VistaEmpresaDeTransportes;

public class Empresa_de_transportes extends VistaEmpresaDeTransportes {
	public Pedidos_a_entregar pedidos_a_entregar;
	public Pedidos_entregados pedidos_entregados;
	public VerticalLayout layout_empresa_de_transportes;
	public VerticalLayout layout_pedidos_a_entregar;
	public VerticalLayout layout_pedidos_entregados;

	public Empresa_de_transportes() {
		pedidos_a_entregar = new Pedidos_a_entregar();
		pedidos_entregados = new Pedidos_entregados();
		layout_empresa_de_transportes = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		this.getVaadinButtonPedidosAEntregar().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a pedidos a entregar");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(pedidos_a_entregar);

				try {
					pedidos_a_entregar.eliminar_pedidos_a_entregar();
					pedidos_a_entregar.mostrar_pedidos_a_entregar();

					for (Producto_a_enviar cr : pedidos_a_entregar.pedidos) {
						try {
							cr.cargar_ficha_cliente();
							cr.fichaCliente.getTextCliente().setValue(cr.id);
							cr.fichaCliente.getTextCalle().setValue(cr.calle);
							cr.fichaCliente.getTextCodigoPostal().setValue(cr.codigoPostal);
							cr.fichaCliente.getTextLocalidad().setValue(cr.localidad);
							cr.fichaCliente.getTextNombre().setValue(cr.nombre);
							cr.fichaCliente.getTextPais().setValue(cr.pais);
							cr.fichaCliente.getTextPortal().setValue(cr.portal);
							cr.fichaCliente.getTextProvincia().setValue(cr.provincia);

							cr.fichaCliente.getButtonAtras().addClickListener(new ComponentEventListener() {
								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout_empresa_de_transportes.removeAll();
									layout_empresa_de_transportes.add(pedidos_entregados);
								}
							});
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						cr.getButtonFichaCliente().addClickListener(new ComponentEventListener() {
							@Override
							public void onComponentEvent(ComponentEvent event) {

								layout_empresa_de_transportes.removeAll();
								layout_empresa_de_transportes.add(cr.fichaCliente);

							}
						});

					}
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		});

		this.getVaadinButtonPedidosEntregados().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a pedidos entregados");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(pedidos_entregados);

				try {
					pedidos_entregados.eliminar_pedidos_entregados();
					pedidos_entregados.mostrar_pedidos_entregados();
					for (Producto_enviado cr : pedidos_entregados.enviados) {

						try {
							cr.cargar_ficha_cliente();
							cr.fichaCliente.getTextCliente().setValue(cr.id);
							cr.fichaCliente.getTextCalle().setValue(cr.calle);
							cr.fichaCliente.getTextCodigoPostal().setValue(cr.codigoPostal);
							cr.fichaCliente.getTextLocalidad().setValue(cr.localidad);
							cr.fichaCliente.getTextNombre().setValue(cr.nombre);
							cr.fichaCliente.getTextPais().setValue(cr.pais);
							cr.fichaCliente.getTextPortal().setValue(cr.portal);
							cr.fichaCliente.getTextProvincia().setValue(cr.provincia);

							cr.fichaCliente.getButtonAtras().addClickListener(new ComponentEventListener() {
								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout_empresa_de_transportes.removeAll();
									layout_empresa_de_transportes.add(pedidos_entregados);
								}
							});
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						cr.getButtonFichaCliente().addClickListener(new ComponentEventListener() {
							@Override
							public void onComponentEvent(ComponentEvent event) {
								layout_empresa_de_transportes.removeAll();
								layout_empresa_de_transportes.add(cr.fichaCliente);
							}
						});

					}
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		});

		pedidos_a_entregar.getVaadinButtonProductosEntregados().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a pedidos entregados");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(pedidos_entregados);
				try {
					pedidos_entregados.eliminar_pedidos_entregados();
					pedidos_entregados.mostrar_pedidos_entregados();

					for (Producto_enviado cr : pedidos_entregados.enviados) {

						try {
							cr.cargar_ficha_cliente();
							cr.fichaCliente.getTextCliente().setValue(cr.id);
							cr.fichaCliente.getTextCalle().setValue(cr.calle);
							cr.fichaCliente.getTextCodigoPostal().setValue(cr.codigoPostal);
							cr.fichaCliente.getTextLocalidad().setValue(cr.localidad);
							cr.fichaCliente.getTextNombre().setValue(cr.nombre);
							cr.fichaCliente.getTextPais().setValue(cr.pais);
							cr.fichaCliente.getTextPortal().setValue(cr.portal);
							cr.fichaCliente.getTextProvincia().setValue(cr.provincia);

							cr.fichaCliente.getButtonAtras().addClickListener(new ComponentEventListener() {
								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout_empresa_de_transportes.removeAll();
									layout_empresa_de_transportes.add(pedidos_entregados);
								}
							});
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						cr.getButtonFichaCliente().addClickListener(new ComponentEventListener() {
							@Override
							public void onComponentEvent(ComponentEvent event) {
								layout_empresa_de_transportes.removeAll();
								layout_empresa_de_transportes.add(cr.fichaCliente);
							}
						});

					}
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		});

		pedidos_entregados.getVaadinButtonPedidosAEntregar().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a pedidos a entregar");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(pedidos_a_entregar);

				try {
					pedidos_a_entregar.eliminar_pedidos_a_entregar();
					pedidos_a_entregar.mostrar_pedidos_a_entregar();

					for (Producto_a_enviar cr : pedidos_a_entregar.pedidos) {
						try {
							cr.cargar_ficha_cliente();
							cr.fichaCliente.getTextCliente().setValue(cr.id);
							cr.fichaCliente.getTextCalle().setValue(cr.calle);
							cr.fichaCliente.getTextCodigoPostal().setValue(cr.codigoPostal);
							cr.fichaCliente.getTextLocalidad().setValue(cr.localidad);
							cr.fichaCliente.getTextNombre().setValue(cr.nombre);
							cr.fichaCliente.getTextPais().setValue(cr.pais);
							cr.fichaCliente.getTextPortal().setValue(cr.portal);
							cr.fichaCliente.getTextProvincia().setValue(cr.provincia);

							cr.fichaCliente.getButtonAtras().addClickListener(new ComponentEventListener() {
								@Override
								public void onComponentEvent(ComponentEvent event) {
									layout_empresa_de_transportes.removeAll();
									layout_empresa_de_transportes.add(pedidos_entregados);
								}
							});
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						cr.getButtonFichaCliente().addClickListener(new ComponentEventListener() {
							@Override
							public void onComponentEvent(ComponentEvent event) {

								layout_empresa_de_transportes.removeAll();
								layout_empresa_de_transportes.add(cr.fichaCliente);

							}
						});

					}
				} catch (PersistentException e) {
					e.printStackTrace();
				}

			}
		});

	}

}