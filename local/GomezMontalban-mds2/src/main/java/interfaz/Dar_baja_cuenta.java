package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import vistas.VistaDarBajaCuenta;

public class Dar_baja_cuenta extends VistaDarBajaCuenta {
	public Administrar_cuentas _administrar_cuentas;
	String correo;
	BDPrincipal bd;
	int tipo;
	Select<String> select = new Select<>();
	String value="";
	
	public Dar_baja_cuenta() {
		 this.getButtonAceptar().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {
					try {
						Baja_cuenta();
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		 
		 select.setItems("Administrador", "Encargado de compras", "Empresa de transporte");
		 this.getLayoutSelect().add(select);
		 
		 select.addValueChangeListener(event -> {
			    if (event.getValue() != null) {
			    	value = event.getValue().toString();
			    } 
			});
	}
	public void Baja_cuenta() throws PersistentException {
		bd = new BDPrincipal();
		this.correo = this.getTextCorreo().getValue().toString();	
		
		
		if(value == "Administrador") tipo = 0;
		else if(value == "Empresa de transporte") tipo = 1;
		else if(value == "Encargado de compras") tipo = 2;
		else if(value == "Usuario registrado") tipo = 3;
		bd.Baja_cuenta(correo, tipo);
		
		
	}
}