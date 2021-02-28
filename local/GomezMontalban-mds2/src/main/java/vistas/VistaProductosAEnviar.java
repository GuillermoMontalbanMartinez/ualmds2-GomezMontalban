package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productos-a-enviar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos-a-enviar")
@JsModule("./src/vista-productos-a-enviar.js")
public class VistaProductosAEnviar extends PolymerTemplate<VistaProductosAEnviar.VistaProductosAEnviarModel> {

    /**
     * Creates a new VistaProductosAEnviar.
     */
    public VistaProductosAEnviar() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosAEnviar and vista-productos-a-enviar
     */
    public interface VistaProductosAEnviarModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
