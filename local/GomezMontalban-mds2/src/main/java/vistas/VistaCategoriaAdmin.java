package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-categoria-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-categoria-admin")
@JsModule("./src/vista-categoria-admin.js")
public class VistaCategoriaAdmin extends PolymerTemplate<VistaCategoriaAdmin.VistaCategoriaAdminModel> {

    /**
     * Creates a new VistaCategoriaAdmin.
     */
    public VistaCategoriaAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCategoriaAdmin and vista-categoria-admin
     */
    public interface VistaCategoriaAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
