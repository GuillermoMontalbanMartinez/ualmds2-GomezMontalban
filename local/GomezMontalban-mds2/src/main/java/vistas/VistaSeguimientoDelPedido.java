package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-seguimiento-del-pedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-seguimiento-del-pedido")
@JsModule("./src/vista-seguimiento-del-pedido.js")
public class VistaSeguimientoDelPedido extends PolymerTemplate<VistaSeguimientoDelPedido.VistaSeguimientoDelPedidoModel> {

    @Id("layoutPedidos")
	private Element layoutPedidos;

	/**
     * Creates a new VistaSeguimientoDelPedido.
     */
    public VistaSeguimientoDelPedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaSeguimientoDelPedido and vista-seguimiento-del-pedido
     */
    public interface VistaSeguimientoDelPedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getLayoutPedidos() {
		return layoutPedidos;
	}

	public void setLayoutPedidos(Element layoutPedidos) {
		this.layoutPedidos = layoutPedidos;
	}
}
