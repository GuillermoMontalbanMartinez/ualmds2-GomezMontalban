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
		_eliminar_oferta = new Eliminar_oferta();
		_publicar_oferta = new Publicar_oferta();
	}
}