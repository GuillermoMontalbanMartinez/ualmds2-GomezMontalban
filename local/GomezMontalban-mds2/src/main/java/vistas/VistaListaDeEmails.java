package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-lista-de-emails template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-de-emails")
@JsModule("./src/vista-lista-de-emails.js")
public class VistaListaDeEmails extends PolymerTemplate<VistaListaDeEmails.VistaListaDeEmailsModel> {

    @Id("writeADescription")
	private TextArea writeADescription;

	/**
     * Creates a new VistaListaDeEmails.
     */
    public VistaListaDeEmails() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListaDeEmails and vista-lista-de-emails
     */
    public interface VistaListaDeEmailsModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
