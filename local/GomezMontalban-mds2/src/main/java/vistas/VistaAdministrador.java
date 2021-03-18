package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrador")
@JsModule("./src/vista-administrador.js")
public class VistaAdministrador extends PolymerTemplate<VistaAdministrador.VistaAdministradorModel> {

    @Id("vaadinVerticalLayoutAdministrador")
	private Element vaadinVerticalLayoutAdministrador;
	@Id("vistaBannerAdmin")
	private Element vistaBannerAdmin;
	@Id("vaadinButtonMostrarTodosLosProductos")
	private Button vaadinButtonMostrarTodosLosProductos;

	/**
     * Creates a new VistaAdministrador.
     */
    public VistaAdministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrador and vista-administrador
     */
    public interface VistaAdministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayoutAdministrador() {
		return vaadinVerticalLayoutAdministrador;
	}

	public void setVaadinVerticalLayoutAdministrador(Element vaadinVerticalLayoutAdministrador) {
		this.vaadinVerticalLayoutAdministrador = vaadinVerticalLayoutAdministrador;
	}

	public Element getVistaBannerAdmin() {
		return vistaBannerAdmin;
	}

	public void setVistaBannerAdmin(Element vistaBannerAdmin) {
		this.vistaBannerAdmin = vistaBannerAdmin;
	}

	public Button getVaadinButtonMostrarTodosLosProductos() {
		return vaadinButtonMostrarTodosLosProductos;
	}

	public void setVaadinButtonMostrarTodosLosProductos(Button vaadinButtonMostrarTodosLosProductos) {
		this.vaadinButtonMostrarTodosLosProductos = vaadinButtonMostrarTodosLosProductos;
	}


}
