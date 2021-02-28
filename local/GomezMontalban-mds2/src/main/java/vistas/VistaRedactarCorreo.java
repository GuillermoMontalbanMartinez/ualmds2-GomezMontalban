package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-redactar-correo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-redactar-correo")
@JsModule("./src/vista-redactar-correo.js")
public class VistaRedactarCorreo extends PolymerTemplate<VistaRedactarCorreo.VistaRedactarCorreoModel> {

    /**
     * Creates a new VistaRedactarCorreo.
     */
    public VistaRedactarCorreo() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRedactarCorreo and vista-redactar-correo
     */
    public interface VistaRedactarCorreoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
