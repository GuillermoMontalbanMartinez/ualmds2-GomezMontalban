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
		layout_administrar_cuentas = this.getVaadinVerticalLayoutAdministrarCuentasDeUsuario().as(VerticalLayout.class);
		altaCuentas = this.getVaadinButtonAltaCuentaDeUsuario();
		altaCuentas.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_cuentas.removeAll();
//				layout_administrar_cuentas.add(new Dar_alta_cuenta());
			}
		});
		
		bajaCuentas.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_cuentas.removeAll();
//				layout_administrar_cuentas.add(new Dar_baja_cuenta());
			}
		});
	}
}