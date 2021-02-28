package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-caracteristicas-del-producto-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-caracteristicas-del-producto-admin")
@JsModule("./src/vista-caracteristicas-del-producto-admin.js")
public class VistaCaracteristicasDelProductoAdmin extends PolymerTemplate<VistaCaracteristicasDelProductoAdmin.VistaCaracteristicasDelProductoAdminModel> {

    /**
     * Creates a new VistaCaracteristicasDelProductoAdmin.
     */
    public VistaCaracteristicasDelProductoAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCaracteristicasDelProductoAdmin and vista-caracteristicas-del-producto-admin
     */
    public interface VistaCaracteristicasDelProductoAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
