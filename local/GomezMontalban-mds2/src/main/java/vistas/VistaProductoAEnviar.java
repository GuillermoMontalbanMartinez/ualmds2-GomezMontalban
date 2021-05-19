package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import vistas.VistaVerFicha;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-producto-a-enviar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-a-enviar")
@JsModule("./src/vista-producto-a-enviar.js")
public class VistaProductoAEnviar extends PolymerTemplate<VistaProductoAEnviar.VistaProductoAEnviarModel> {

    @Id("textNumeroPedidoProductoAEnviar")
	private TextField textNumeroPedidoProductoAEnviar;
	@Id("buttonFichaCliente")
	private Button buttonFichaCliente;
	@Id("buttonEntregado")
	private Button buttonEntregado;
	@Id("verticalLayoutProductoAEnviar")
	private Element verticalLayoutProductoAEnviar;

	/**
     * Creates a new VistaProductoAEnviar.
     */
    public VistaProductoAEnviar() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoAEnviar and vista-producto-a-enviar
     */
    public interface VistaProductoAEnviarModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getTextNumeroPedidoProductoAEnviar() {
		return textNumeroPedidoProductoAEnviar;
	}

	public void setTextNumeroPedidoProductoAEnviar(TextField textNumeroPedidoProductoAEnviar) {
		this.textNumeroPedidoProductoAEnviar = textNumeroPedidoProductoAEnviar;
	}

	public Button getButtonFichaCliente() {
		return buttonFichaCliente;
	}

	public void setButtonFichaCliente(Button buttonFichaCliente) {
		this.buttonFichaCliente = buttonFichaCliente;
	}

	public Button getButtonEntregado() {
		return buttonEntregado;
	}

	public void setButtonEntregado(Button buttonEntregado) {
		this.buttonEntregado = buttonEntregado;
	}

	public Element getVerticalLayoutProductoAEnviar() {
		return verticalLayoutProductoAEnviar;
	}

	public void setVerticalLayoutProductoAEnviar(Element verticalLayoutProductoAEnviar) {
		this.verticalLayoutProductoAEnviar = verticalLayoutProductoAEnviar;
	}
}
