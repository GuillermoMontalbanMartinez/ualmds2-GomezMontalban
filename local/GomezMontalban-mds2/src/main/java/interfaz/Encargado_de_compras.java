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
	public Compras_enviadas _compras_enviadas;
	public Compras_a_enviar _compras_a_enviar;
	public VerticalLayout layout;
	
	
	public Encargado_de_compras() {
		_compras_enviadas = new Compras_enviadas();
		_compras_a_enviar = new Compras_a_enviar();
		layout = this.getLayout_encargado_de_compras().as(VerticalLayout.class);
		
		this.getButton_compras_enviadas().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a  compras enviadas");
//				layout.removeAll();
				layout.add(_compras_enviadas);
				
				try {
					_compras_enviadas.eliminar_compras_enviadas();
					_compras_enviadas.mostrar_compras_enviadas();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		this.getButton_compras_a_enviar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a compras a enviar");
//				layout.removeAll();
				layout.add(_compras_a_enviar);
				try {
					_compras_a_enviar.eliminar_compras_a_enviar();
					_compras_a_enviar.mostrar_compras_a_enviar();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
				
		this._compras_a_enviar.getBoton_compras_enviadas().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Compras_a_enviar _compras_a_enviar = new Compras_a_enviar();
				layout.removeAll();
				layout.add(_compras_enviadas);
			}
		});
		
		this._compras_enviadas.getBoton_compras_a_enviar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a compras a enviar prueba prueba");
				Compras_enviadas comprasEnviadas = new Compras_enviadas();
				layout.removeAll();
				layout.add(_compras_a_enviar);
			}
		});
		
		
		
		
	}
}