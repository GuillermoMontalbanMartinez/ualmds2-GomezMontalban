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


	@Id("LayoutAdmin")
	private Element layoutAdmin;
	@Id("layoutBannerAdmin")
	private Element layoutBannerAdmin;
	@Id("LayoutcuerpoAdmin")
	private Element layoutcuerpoAdmin;
	@Id("ButtonMostrarTodosLosProductos")
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

	public Element getLayoutAdmin() {
		return layoutAdmin;
	}

	public void setLayoutAdmin(Element layoutAdmin) {
		this.layoutAdmin = layoutAdmin;
	}

	public Element getLayoutBannerAdmin() {
		return layoutBannerAdmin;
	}

	public void setLayoutBannerAdmin(Element layoutBannerAdmin) {
		this.layoutBannerAdmin = layoutBannerAdmin;
	}

	public Element getLayoutcuerpoAdmin() {
		return layoutcuerpoAdmin;
	}

	public void setLayoutcuerpoAdmin(Element layoutcuerpoAdmin) {
		this.layoutcuerpoAdmin = layoutcuerpoAdmin;
	}

	public Button getVaadinButtonMostrarTodosLosProductos() {
		return vaadinButtonMostrarTodosLosProductos;
	}

	public void setVaadinButtonMostrarTodosLosProductos(Button vaadinButtonMostrarTodosLosProductos) {
		this.vaadinButtonMostrarTodosLosProductos = vaadinButtonMostrarTodosLosProductos;
	}

	

}
