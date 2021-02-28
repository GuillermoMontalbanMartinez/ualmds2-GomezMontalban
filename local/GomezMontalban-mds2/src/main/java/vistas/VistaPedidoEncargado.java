package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedido-encargado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedido-encargado")
@JsModule("./src/vista-pedido-encargado.js")
public class VistaPedidoEncargado extends PolymerTemplate<VistaPedidoEncargado.VistaPedidoEncargadoModel> {

    /**
     * Creates a new VistaPedidoEncargado.
     */
    public VistaPedidoEncargado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidoEncargado and vista-pedido-encargado
     */
    public interface VistaPedidoEncargadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
