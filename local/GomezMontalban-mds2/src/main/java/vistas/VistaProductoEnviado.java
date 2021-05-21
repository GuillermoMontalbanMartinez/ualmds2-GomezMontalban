package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-producto-enviado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-enviado")
@JsModule("./src/vista-producto-enviado.js")
public class VistaProductoEnviado extends PolymerTemplate<VistaProductoEnviado.VistaProductoEnviadoModel> {

    @Id("buttonFichaCliente")
	private Button buttonFichaCliente;
	@Id("verticalLayoutProductoEnviado")
	private Element verticalLayoutProductoEnviado;
	@Id("textNumeroPedido")
	private TextField textNumeroPedido;

	/**
     * Creates a new VistaProductoEnviado.
     */
    public VistaProductoEnviado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoEnviado and vista-producto-enviado
     */
    public interface VistaProductoEnviadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getButtonFichaCliente() {
		return buttonFichaCliente;
	}

	public void setButtonFichaCliente(Button buttonFichaCliente) {
		this.buttonFichaCliente = buttonFichaCliente;
	}

	public Element getVerticalLayoutProductoEnviado() {
		return verticalLayoutProductoEnviado;
	}

	public void setVerticalLayoutProductoEnviado(Element verticalLayoutProductoEnviado) {
		this.verticalLayoutProductoEnviado = verticalLayoutProductoEnviado;
	}

	public TextField getTextNumeroPedido() {
		return textNumeroPedido;
	}

	public void setTextNumeroPedido(TextField textNumeroPedido) {
		this.textNumeroPedido = textNumeroPedido;
	}
}
