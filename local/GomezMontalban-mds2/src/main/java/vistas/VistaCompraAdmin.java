package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-compra-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compra-admin")
@JsModule("./src/vista-compra-admin.js")
public class VistaCompraAdmin extends PolymerTemplate<VistaCompraAdmin.VistaCompraAdminModel> {

    /**
     * Creates a new VistaCompraAdmin.
     */
    public VistaCompraAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCompraAdmin and vista-compra-admin
     */
    public interface VistaCompraAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
