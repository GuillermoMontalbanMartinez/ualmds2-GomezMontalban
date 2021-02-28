package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-compra-enviada template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compra-enviada")
@JsModule("./src/vista-compra-enviada.js")
public class VistaCompraEnviada extends PolymerTemplate<VistaCompraEnviada.VistaCompraEnviadaModel> {

    /**
     * Creates a new VistaCompraEnviada.
     */
    public VistaCompraEnviada() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCompraEnviada and vista-compra-enviada
     */
    public interface VistaCompraEnviadaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
