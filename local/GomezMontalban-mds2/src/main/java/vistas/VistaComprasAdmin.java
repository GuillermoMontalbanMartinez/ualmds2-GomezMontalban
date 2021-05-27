package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-compras-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compras-admin")
@JsModule("./src/vista-compras-admin.js")
public class VistaComprasAdmin extends PolymerTemplate<VistaComprasAdmin.VistaComprasAdminModel> {

    @Id("vistaComprasAdmin")
	private Element vistaComprasAdmin;

	/**
     * Creates a new VistaComprasAdmin.
     */
    public VistaComprasAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComprasAdmin and vista-compras-admin
     */
    public interface VistaComprasAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVistaComprasAdmin() {
		return vistaComprasAdmin;
	}

	public void setVistaComprasAdmin(Element vistaComprasAdmin) {
		this.vistaComprasAdmin = vistaComprasAdmin;
	}
}
