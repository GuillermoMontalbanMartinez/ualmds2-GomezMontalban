package interfaz;

import org.orm.PersistentException;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.ui.Button;

import basededatos.BDPrincipal;
import vistas.VistaDarAltaCuenta;

public class Dar_alta_cuenta extends VistaDarAltaCuenta {
	public Administrar_cuentas _administrar_cuentas;
	public BDPrincipal ad ;
	String nombre;	
	String contrasena;
	String correo;
	String apellidos;

	public Dar_alta_cuenta() {	
		 
		 
		 
		 this.getVaadinButtonAceptar().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {
					try {
						Alta_cuenta();
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
	}
	public void Alta_cuenta() throws PersistentException { 
		ad = new BDPrincipal();	
		nombre = this.getTextNombre().getValue().toString();
		contrasena = this.getTextContrasena().getValue().toString();
		correo = this.getTextCorreo().getValue().toString();
		apellidos = this.getTextApellidos().getValue().toString();
		
		ad.Alta_cuenta(nombre, apellidos, contrasena, 0, correo);

	}
}