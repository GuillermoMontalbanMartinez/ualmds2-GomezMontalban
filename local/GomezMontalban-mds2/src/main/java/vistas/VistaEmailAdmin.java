package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-email-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-email-admin")
@JsModule("./src/vista-email-admin.js")
public class VistaEmailAdmin extends PolymerTemplate<VistaEmailAdmin.VistaEmailAdminModel> {

    /**
     * Creates a new VistaEmailAdmin.
     */
    public VistaEmailAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmailAdmin and vista-email-admin
     */
    public interface VistaEmailAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
