package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productos-mas-vendidos-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos-mas-vendidos-admin")
@JsModule("./src/vista-productos-mas-vendidos-admin.js")
public class VistaProductosMasVendidosAdmin extends PolymerTemplate<VistaProductosMasVendidosAdmin.VistaProductosMasVendidosAdminModel> {

    /**
     * Creates a new VistaProductosMasVendidosAdmin.
     */
    public VistaProductosMasVendidosAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosMasVendidosAdmin and vista-productos-mas-vendidos-admin
     */
    public interface VistaProductosMasVendidosAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
