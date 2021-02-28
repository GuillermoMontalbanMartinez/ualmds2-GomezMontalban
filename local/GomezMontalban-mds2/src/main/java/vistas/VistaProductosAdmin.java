package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productos-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos-admin")
@JsModule("./src/vista-productos-admin.js")
public class VistaProductosAdmin extends PolymerTemplate<VistaProductosAdmin.VistaProductosAdminModel> {

    /**
     * Creates a new VistaProductosAdmin.
     */
    public VistaProductosAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosAdmin and vista-productos-admin
     */
    public interface VistaProductosAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
