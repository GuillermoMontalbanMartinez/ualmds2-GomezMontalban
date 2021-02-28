package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-cerrar-sesion-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cerrar-sesion-admin")
@JsModule("./src/vista-cerrar-sesion-admin.js")
public class VistaCerrarSesionAdmin extends PolymerTemplate<VistaCerrarSesionAdmin.VistaCerrarSesionAdminModel> {

    /**
     * Creates a new VistaCerrarSesionAdmin.
     */
    public VistaCerrarSesionAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCerrarSesionAdmin and vista-cerrar-sesion-admin
     */
    public interface VistaCerrarSesionAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
