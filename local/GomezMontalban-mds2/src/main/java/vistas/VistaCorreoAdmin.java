package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import vistas.VistaListaEmailsAdmin;

/**
 * A Designer generated component for the vista-correo-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-correo-admin")
@JsModule("./src/vista-correo-admin.js")
public class VistaCorreoAdmin extends PolymerTemplate<VistaCorreoAdmin.VistaCorreoAdminModel> {

    @Id("vaadinVerticalLayoutCorreoAdmin")
	private VerticalLayout vaadinVerticalLayout;
	@Id("vaadinButtonRedactarMensaje")
	private Button vaadinButton;
	@Id("vistaListaEmails")
	private VistaListaEmailsAdmin vistaListaEmails;

	/**
     * Creates a new VistaCorreoAdmin.
     */
    public VistaCorreoAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCorreoAdmin and vista-correo-admin
     */
    public interface VistaCorreoAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VerticalLayout getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(VerticalLayout vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public VistaListaEmailsAdmin getVistaListaEmails() {
		return vistaListaEmails;
	}

	public void setVistaListaEmails(VistaListaEmailsAdmin vistaListaEmails) {
		this.vistaListaEmails = vistaListaEmails;
	}
}
