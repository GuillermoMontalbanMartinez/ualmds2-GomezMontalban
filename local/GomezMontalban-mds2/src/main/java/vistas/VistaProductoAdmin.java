package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-producto-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-admin")
@JsModule("./src/vista-producto-admin.js")
public class VistaProductoAdmin extends PolymerTemplate<VistaProductoAdmin.VistaProductoAdminModel> {

    /**
     * Creates a new VistaProductoAdmin.
     */
    public VistaProductoAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoAdmin and vista-producto-admin
     */
    public interface VistaProductoAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
