package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrarCuentas;

public class Administrar_cuentas extends VistaAdministrarCuentas {
	public Banner_admin _banner_admin;
	public Dar_alta_cuenta _dar_alta_cuenta;
	public Dar_baja_cuenta _dar_baja_cuenta;
	public VerticalLayout layout_administrar_cuentas;
	public Button altaCuentas;
	public Button bajaCuentas;
	
	public Administrar_cuentas() {
		_dar_alta_cuenta = new Dar_alta_cuenta();
		_dar_baja_cuenta = new Dar_baja_cuenta();
	}
}