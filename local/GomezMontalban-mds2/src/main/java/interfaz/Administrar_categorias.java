package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrarCategorias;

public class Administrar_categorias extends VistaAdministrarCategorias {
	public Banner_admin banner_admin;
	public VerticalLayout layout_administrar_categorias;
	
	public Administrar_categorias() {
		layout_administrar_categorias = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	}

	public void Alta_categoria() {
		throw new UnsupportedOperationException();
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