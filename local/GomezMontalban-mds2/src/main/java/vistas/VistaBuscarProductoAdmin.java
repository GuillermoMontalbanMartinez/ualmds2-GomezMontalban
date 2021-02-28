package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-buscar-producto-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar-producto-admin")
@JsModule("./src/vista-buscar-producto-admin.js")
public class VistaBuscarProductoAdmin extends PolymerTemplate<VistaBuscarProductoAdmin.VistaBuscarProductoAdminModel> {

    /**
     * Creates a new VistaBuscarProductoAdmin.
     */
    public VistaBuscarProductoAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscarProductoAdmin and vista-buscar-producto-admin
     */
    public interface VistaBuscarProductoAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
