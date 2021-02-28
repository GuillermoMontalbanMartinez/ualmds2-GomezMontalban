package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-datos-de-envio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-datos-de-envio")
@JsModule("./src/vista-datos-de-envio.js")
public class VistaDatosDeEnvio extends PolymerTemplate<VistaDatosDeEnvio.VistaDatosDeEnvioModel> {

    /**
     * Creates a new VistaDatosDeEnvio.
     */
    public VistaDatosDeEnvio() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDatosDeEnvio and vista-datos-de-envio
     */
    public interface VistaDatosDeEnvioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
