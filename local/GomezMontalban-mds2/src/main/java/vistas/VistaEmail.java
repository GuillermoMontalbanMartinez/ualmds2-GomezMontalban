package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-email template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-email")
@JsModule("./src/vista-email.js")
public class VistaEmail extends PolymerTemplate<VistaEmail.VistaEmailModel> {

    /**
     * Creates a new VistaEmail.
     */
    public VistaEmail() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmail and vista-email
     */
    public interface VistaEmailModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
