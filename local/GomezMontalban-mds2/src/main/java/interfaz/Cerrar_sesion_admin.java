package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCerrarSesionAdmin;

public class Cerrar_sesion_admin extends VistaCerrarSesionAdmin {
	public Banner_admin banner_admin;
	public Button cancelar;
	public VerticalLayout layout_cerrar_sesion;

	
	public Cerrar_sesion_admin() {
		layout_cerrar_sesion = this.getVaadinVerticalLayoutCerrarSesión().as(VerticalLayout.class);
		cancelar = this.getVaadinButtonCancelar();
		cancelar.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_cerrar_sesion.removeAll();
				layout_cerrar_sesion.add(new Cibernauta());
			}
		});
	}

	public void confirmar_cierre_sesion_admin() {
		throw new UnsupportedOperationException();
	}
}