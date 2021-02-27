package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-compras-a-enviar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compras-a-enviar")
@JsModule("./src/vista-compras-a-enviar.js")
public class VistaComprasAEnviar extends PolymerTemplate<VistaComprasAEnviar.VistaComprasAEnviarModel> {

    /**
     * Creates a new VistaComprasAEnviar.
     */
    public VistaComprasAEnviar() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComprasAEnviar and vista-compras-a-enviar
     */
    public interface VistaComprasAEnviarModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
