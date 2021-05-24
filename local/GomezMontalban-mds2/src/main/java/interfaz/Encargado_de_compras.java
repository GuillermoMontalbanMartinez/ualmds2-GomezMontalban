package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEncargadoDeCompras;

public class Encargado_de_compras extends VistaEncargadoDeCompras {
	public Compras_enviadas compras_enviadas;
	public Compras_a_enviar compras_a_enviar;
	public VerticalLayout layoutEncargadoDeCompras;

	public Encargado_de_compras() {
		compras_enviadas = new Compras_enviadas();
		compras_a_enviar = new Compras_a_enviar();
		layoutEncargadoDeCompras = this.getLayout_encargado_de_compras().as(VerticalLayout.class);

		this.getButton_compras_enviadas().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a compras enviadas desde el principal");
				layoutEncargadoDeCompras.removeAll();
				layoutEncargadoDeCompras.add(compras_enviadas);

				try {
					compras_enviadas.mostrar_compras_enviadas();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		this.getButton_compras_a_enviar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a compras a enviar desde el principal");
				layoutEncargadoDeCompras.removeAll();
				layoutEncargadoDeCompras.add(compras_a_enviar);
				try {
					compras_a_enviar.mostrar_compras_a_enviar();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		this.compras_a_enviar.getBoton_compras_enviadas().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a compras enviadas desde el segundario");
				layoutEncargadoDeCompras.removeAll();
				layoutEncargadoDeCompras.add(compras_enviadas);
				try {
					compras_enviadas.eliminar_compras_enviadas();
					compras_enviadas.mostrar_compras_enviadas();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		this.compras_enviadas.getBoton_compras_a_enviar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a compras a enviar prueba prueba");
				layoutEncargadoDeCompras.removeAll();
				layoutEncargadoDeCompras.add(compras_a_enviar);

				try {

					compras_a_enviar.eliminar_compras_a_enviar();
					compras_a_enviar.mostrar_compras_a_enviar();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

	}
}