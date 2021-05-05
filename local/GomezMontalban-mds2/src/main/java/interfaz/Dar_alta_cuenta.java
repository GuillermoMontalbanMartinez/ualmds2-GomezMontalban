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
import com.vaadin.flow.component.select.Select;
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
	int tipo;
	Select<String> select = new Select<>();
	 String value="";

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
		 
		 select.setItems("Administrador", "Encargado de compras", "Empresa de transporte", "Usuario registrado");
		 this.getLayoutSelect().add(select);
		 
		 select.addValueChangeListener(event -> {
			    if (event.getValue() != null) {
			    	value = event.getValue().toString();
			    } 
			});
		
		
	}
	public void Alta_cuenta() throws PersistentException { 
		ad = new BDPrincipal();	
		nombre = this.getTextNombre().getValue().toString();
		contrasena = this.getTextContrasena().getValue().toString();
		correo = this.getTextCorreo().getValue().toString();
		apellidos = this.getTextApellidos().getValue().toString();
		
		
		
		        
		if(value == "Administrador") tipo = 0;
		else if(value == "Empresa de transporte") tipo = 1;
		else if(value == "Encargado de compras") tipo = 2;
		else if(value == "Usuario registrado") tipo = 3;
		
		
		ad.Alta_cuenta(nombre, correo, contrasena, tipo, apellidos );

	}
}