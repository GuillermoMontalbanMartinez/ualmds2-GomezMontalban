package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-contestar-email-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contestar-email-admin")
@JsModule("./src/vista-contestar-email-admin.js")
public class VistaContestarEmailAdmin extends PolymerTemplate<VistaContestarEmailAdmin.VistaContestarEmailAdminModel> {

    /**
     * Creates a new VistaContestarEmailAdmin.
     */
    public VistaContestarEmailAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaContestarEmailAdmin and vista-contestar-email-admin
     */
    public interface VistaContestarEmailAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
