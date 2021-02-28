package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-pedidos-encargados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidos-encargados")
@JsModule("./src/vista-pedidos-encargados.js")
public class VistaPedidosEncargados extends PolymerTemplate<VistaPedidosEncargados.VistaPedidosEncargadosModel> {

    /**
     * Creates a new VistaPedidosEncargados.
     */
    public VistaPedidosEncargados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidosEncargados and vista-pedidos-encargados
     */
    public interface VistaPedidosEncargadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
