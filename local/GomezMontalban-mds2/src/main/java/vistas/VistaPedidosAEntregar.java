package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import vistas.VistaProductosAEnviar;

/**
 * A Designer generated component for the vista-pedidos-a-entregar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidos-a-entregar")
@JsModule("./src/vista-pedidos-a-entregar.js")
public class VistaPedidosAEntregar extends PolymerTemplate<VistaPedidosAEntregar.VistaPedidosAEntregarModel> {

    @Id("vaadinVerticalLayoutPedidosAEntregar")
	private Element vaadinVerticalLayout;
	@Id("vaadinButtonProductosEntregados")
	private Button vaadinButtonProductosEntregados;
	@Id("vaadinButtonProductosAEntregar")
	private Button vaadinButtonProductosAEntregar;
	@Id("vistaListaProductosAEnviar")
	private VistaProductosAEnviar vistaListaProductosAEnviar;
	@Id("buttonInicioPedidosAEntregar")
	private Button buttonInicio;
	@Id("layoutvistaProductosAEnviar")
	private Element layoutvistaProductosAEnviar;

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



	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getVaadinButtonProductosEntregados() {
		return vaadinButtonProductosEntregados;
	}

	public void setVaadinButtonProductosEntregados(Button vaadinButtonProductosEntregados) {
		this.vaadinButtonProductosEntregados = vaadinButtonProductosEntregados;
	}

	public Button getVaadinButtonProductosAEntregar() {
		return vaadinButtonProductosAEntregar;
	}

	public void setVaadinButtonProductosAEntregar(Button vaadinButtonProductosAEntregar) {
		this.vaadinButtonProductosAEntregar = vaadinButtonProductosAEntregar;
	}

	public VistaProductosAEnviar getVistaListaProductosAEnviar() {
		return vistaListaProductosAEnviar;
	}

	public void setVistaListaProductosAEnviar(VistaProductosAEnviar vistaListaProductosAEnviar) {
		this.vistaListaProductosAEnviar = vistaListaProductosAEnviar;
	}

	public Button getButtonInicio() {
		return buttonInicio;
	}

	public void setButtonInicio(Button buttonInicio) {
		this.buttonInicio = buttonInicio;
	}

	public Element getLayoutvistaProductosAEnviar() {
		return layoutvistaProductosAEnviar;
	}

	public void setLayoutvistaProductosAEnviar(Element layoutvistaProductosAEnviar) {
		this.layoutvistaProductosAEnviar = layoutvistaProductosAEnviar;
	}


}
