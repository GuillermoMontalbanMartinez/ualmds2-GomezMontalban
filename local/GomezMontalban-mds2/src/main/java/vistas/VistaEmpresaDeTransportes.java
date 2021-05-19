package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-empresa-de-transportes")
@JsModule("./src/vista-empresa-de-transportes.js")
public class VistaEmpresaDeTransportes extends PolymerTemplate<VistaEmpresaDeTransportes.VistaEmpresaDeTransportesModel> {

    @Id("vaadinButtonPedidosEntregados")
	private Button vaadinButtonPedidosEntregados;
	@Id("vaadinButtonPedidosAEntregar")
	private Button vaadinButtonPedidosAEntregar;
	@Id("vaadinVerticalLayoutEmpresaDeTransportes")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaEmpresaDeTransportes.
     */
    public VistaEmpresaDeTransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpresaDeTransportes and vista-empresa-de-transportes
     */
    public interface VistaEmpresaDeTransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

//	public Element getVaadinVerticalLayoutPedidosEntregar() {
//		return vaadinVerticalLayoutPedidosEntregar;
//	}
//
//	public void setVaadinVerticalLayoutPedidosEntregar(Element vaadinVerticalLayoutPedidosEntregar) {
//		this.vaadinVerticalLayoutPedidosEntregar = vaadinVerticalLayoutPedidosEntregar;
//	}
//
//	public Element getVaadinVerticalLayoutPedidosEntregados() {
//		return vaadinVerticalLayoutPedidosEntregados;
//	}
//
//	public void setVaadinVerticalLayoutPedidosEntregados(Element vaadinVerticalLayoutPedidosEntregados) {
//		this.vaadinVerticalLayoutPedidosEntregados = vaadinVerticalLayoutPedidosEntregados;
//	}

	public Button getVaadinButtonPedidosAEntregar() {
		return vaadinButtonPedidosAEntregar;
	}

	public void setVaadinButtonPedidosAEntregar(Button vaadinButtonPedidosAEntregar) {
		this.vaadinButtonPedidosAEntregar = vaadinButtonPedidosAEntregar;
	}

	public Button getVaadinButtonPedidosEntregados() {
		return vaadinButtonPedidosEntregados;
	}

	public void setVaadinButtonPedidosEntregados(Button vaadinButtonPedidosEntregados) {
		this.vaadinButtonPedidosEntregados = vaadinButtonPedidosEntregados;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


}
