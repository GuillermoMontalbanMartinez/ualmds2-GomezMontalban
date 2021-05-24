package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;
import vistas.VistaProductosEnviados;

/**
 * A Designer generated component for the vista-pedidos-entregados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidos-entregados")
@JsModule("./src/vista-pedidos-entregados.js")
public class VistaPedidosEntregados extends PolymerTemplate<VistaPedidosEntregados.VistaPedidosEntregadosModel> {

//    @Id("vaadinButtonPedidosEntregados")
//	private Button vaadinButton1;
	@Id("vaadinVerticalLayoutPedidosEntregados")
	private Element vaadinVerticalLayout;
	@Id("vaadinButtonPedidosAEntregar")
	private Button vaadinButtonPedidosAEntregar;
	@Id("vistaListaProductosEnviados")
	private VistaProductosEnviados vistaListaProductosEnviados;
	@Id("buttonInicioPedidosEntregados")
	private Button buttonInicioPedidosEntregados;
	@Id("layoutVistaProductosEnviados")
	private Element layoutVistaProductosEnviados;
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


	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getVaadinButtonPedidosAEntregar() {
		return vaadinButtonPedidosAEntregar;
	}

	public void setVaadinButtonPedidosAEntregar(Button vaadinButtonPedidosAEntregar) {
		this.vaadinButtonPedidosAEntregar = vaadinButtonPedidosAEntregar;
	}

	public VistaProductosEnviados getVistaListaProductosEnviados() {
		return vistaListaProductosEnviados;
	}

	public void setVistaListaProductosEnviados(VistaProductosEnviados vistaListaProductosEnviados) {
		this.vistaListaProductosEnviados = vistaListaProductosEnviados;
	}


	public Button getButtonInicioPedidosEntregados() {
		return buttonInicioPedidosEntregados;
	}

	public void setButtonInicioPedidosEntregados(Button buttonInicioPedidosEntregados) {
		this.buttonInicioPedidosEntregados = buttonInicioPedidosEntregados;
	}

	public Element getLayoutVistaProductosEnviados() {
		return layoutVistaProductosEnviados;
	}

	public void setLayoutVistaProductosEnviados(Element layoutVistaProductosEnviados) {
		this.layoutVistaProductosEnviados = layoutVistaProductosEnviados;
	}
}
