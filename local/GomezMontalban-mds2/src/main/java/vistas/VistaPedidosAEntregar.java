package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedidos-a-entregar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidos-a-entregar")
@JsModule("./src/vista-pedidos-a-entregar.js")
public class VistaPedidosAEntregar extends PolymerTemplate<VistaPedidosAEntregar.VistaPedidosAEntregarModel> {

    /**
     * Creates a new VistaPedidosAEntregar.
     */
    public VistaPedidosAEntregar() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidosAEntregar and vista-pedidos-a-entregar
     */
    public interface VistaPedidosAEntregarModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
