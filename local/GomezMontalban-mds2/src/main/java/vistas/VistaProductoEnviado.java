package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-producto-enviado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-enviado")
@JsModule("./src/vista-producto-enviado.js")
public class VistaProductoEnviado extends PolymerTemplate<VistaProductoEnviado.VistaProductoEnviadoModel> {

    /**
     * Creates a new VistaProductoEnviado.
     */
    public VistaProductoEnviado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoEnviado and vista-producto-enviado
     */
    public interface VistaProductoEnviadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
