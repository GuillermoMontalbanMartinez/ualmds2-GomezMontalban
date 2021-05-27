package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-lista-emails-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-emails-admin")
@JsModule("./src/vista-lista-emails-admin.js")
public class VistaListaEmailsAdmin extends PolymerTemplate<VistaListaEmailsAdmin.VistaListaEmailsAdminModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaListaEmailsAdmin.
     */
    public VistaListaEmailsAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListaEmailsAdmin and vista-lista-emails-admin
     */
    public interface VistaListaEmailsAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
}
