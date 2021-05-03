package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaAdministrarCategorias;

public class Administrar_categorias extends VistaAdministrarCategorias {
	public Banner_admin banner_admin;
	public BDPrincipal bd;
	public String nombreCategoria;
	
	public Administrar_categorias() {
		this.getVaadinButtonAceptarAlta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Alta_categoria();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public void Alta_categoria() throws PersistentException {
		bd = new BDPrincipal();
		nombreCategoria = this.getTextCategoria().getValue().toString();
		bd.alta_categorias(nombreCategoria);
		
	}

	public void Baja_categoria() {
		throw new UnsupportedOperationException();
	}

	public Banner_admin get_banner_admin() {
		return banner_admin;
	}

	public void set_banner_admin(Banner_admin _banner_admin) {
		this.banner_admin = _banner_admin;
	}
}