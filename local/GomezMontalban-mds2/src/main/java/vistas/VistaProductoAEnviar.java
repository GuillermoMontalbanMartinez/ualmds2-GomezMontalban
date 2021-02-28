package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-producto-a-enviar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-a-enviar")
@JsModule("./src/vista-producto-a-enviar.js")
public class VistaProductoAEnviar extends PolymerTemplate<VistaProductoAEnviar.VistaProductoAEnviarModel> {

    /**
     * Creates a new VistaProductoAEnviar.
     */
    public VistaProductoAEnviar() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoAEnviar and vista-producto-a-enviar
     */
    public interface VistaProductoAEnviarModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
