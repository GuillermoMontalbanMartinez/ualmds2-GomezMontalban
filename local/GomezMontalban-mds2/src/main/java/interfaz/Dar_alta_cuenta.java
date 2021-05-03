package interfaz;

import org.orm.PersistentException;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.ui.Button;

import basededatos.BDPrincipal;
import vistas.VistaDarAltaCuenta;

public class Dar_alta_cuenta extends VistaDarAltaCuenta {
	public Administrar_cuentas _administrar_cuentas;
	public BDPrincipal ad ;
	

	public Dar_alta_cuenta() {	
		
	}
	
	
	public void Alta_cuenta() throws PersistentException { 
		ad = new BDPrincipal();	
		String nombre = this.getTextNombre().getValue();
		System.out.println(nombre);
		String contrasena =this.getTextContrasena().getValue();
		String correo =this.getTextCorreo().getValue();
		this.getTextNombre().setValue("FFFFF");
		Notification.show(contrasena);
		Notification.show(nombre);
		Notification.show(correo);

		//ad.Alta_cuenta(nombre, "gomez", contrasena, 0, correo);

	}
}