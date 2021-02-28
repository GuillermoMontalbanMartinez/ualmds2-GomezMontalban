package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productos-enviados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos-enviados")
@JsModule("./src/vista-productos-enviados.js")
public class VistaProductosEnviados extends PolymerTemplate<VistaProductosEnviados.VistaProductosEnviadosModel> {

    /**
     * Creates a new VistaProductosEnviados.
     */
    public VistaProductosEnviados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosEnviados and vista-productos-enviados
     */
    public interface VistaProductosEnviadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
