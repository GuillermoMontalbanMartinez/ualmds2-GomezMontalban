package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedidos-entregados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidos-entregados")
@JsModule("./src/vista-pedidos-entregados.js")
public class VistaPedidosEntregados extends PolymerTemplate<VistaPedidosEntregados.VistaPedidosEntregadosModel> {

    /**
     * Creates a new VistaPedidosEntregados.
     */
    public VistaPedidosEntregados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidosEntregados and vista-pedidos-entregados
     */
    public interface VistaPedidosEntregadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
