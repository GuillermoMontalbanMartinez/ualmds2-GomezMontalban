package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrarCategorias;

public class Administrar_categorias extends VistaAdministrarCategorias {
	public Banner_admin banner_admin;
	public VerticalLayout layout_administrar_categorias;
	public Button cancelarAlta;
	public Button aceptarAlta;
	public Button cancelarBaja;
	public Button aceptarBaja;
	
	public Administrar_categorias() {
		layout_administrar_categorias = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cancelarAlta = this.getVaadinButtonCancelarAlta();
		cancelarAlta.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_categorias.removeAll();
				layout_administrar_categorias.add(new Administrar_categorias());
			}
		});
		
		cancelarBaja = this.getVaadinButtonCancelarBaja();
		cancelarBaja.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_categorias.removeAll();
				layout_administrar_categorias.add(new Administrar_categorias());
			}
		});
		
		aceptarBaja = this.getVaadinButtonAceptarBaja();
		aceptarBaja.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_categorias.removeAll();
//				layout_administrar_categorias.add(new );
			}
		});
		
		aceptarAlta = this.getVaadinButtonAceptarAlta();
		aceptarAlta.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_categorias.removeAll();
//				layout_administrar_categorias.add();
			}
		});
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