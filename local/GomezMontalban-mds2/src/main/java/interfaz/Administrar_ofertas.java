package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrarOfertas;

public class Administrar_ofertas extends VistaAdministrarOfertas {
	public Banner_admin _banner_admin;
	public Eliminar_oferta _eliminar_oferta;
	public Publicar_oferta _publicar_oferta;
	public VerticalLayout layout_administrar_ofertas;
	public Button agregarOfertas;
	public Button eliminarOfertas;
	
	public Administrar_ofertas() {
		layout_administrar_ofertas = this.getVaadinVerticalLayoutAdministrarOfertas().as(VerticalLayout.class);
		agregarOfertas = this.getVaadinButtonAgregarOfertas();
		agregarOfertas.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_ofertas.removeAll();
//				layout_administrar_ofertas.add(new Aña);
			}
		});
		eliminarOfertas = this.getVaadinButtonAgregarOfertas();
		eliminarOfertas.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_ofertas.removeAll();
//				layout_administrar_ofertas.add(new Eliminar_oferta());
			}
		});
	}
}