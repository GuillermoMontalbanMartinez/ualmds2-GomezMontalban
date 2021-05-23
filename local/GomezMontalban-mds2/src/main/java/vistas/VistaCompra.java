package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-compra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compra")
@JsModule("./src/vista-compra.js")
public class VistaCompra extends PolymerTemplate<VistaCompra.VistaCompraModel> {

    @Id("buttonEnviado")
	private Button buttonEnviado;
	@Id("textCodigoPostal")
	private TextField textCodigoPostal;
	@Id("textProvincia")
	private TextField textProvincia;
	@Id("textPortal")
	private TextField textPortal;
	@Id("textCalle")
	private TextField textCalle;
	@Id("textLocalidad")
	private TextField textLocalidad;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("textNombreCliente")
	private TextField textNombreCliente;
	@Id("textNumeroPedido")
	private TextField textNumeroPedido;
	@Id("layoutCompra")
	private Element layoutCompra;

	/**
     * Creates a new VistaCompra.
     */
    public VistaCompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCompra and vista-compra
     */
    public interface VistaCompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getButtonEnviado() {
		return buttonEnviado;
	}

	public void setButtonEnviado(Button buttonEnviado) {
		this.buttonEnviado = buttonEnviado;
	}

	public TextField getTextCodigoPostal() {
		return textCodigoPostal;
	}

	public void setTextCodigoPostal(TextField textCodigoPostal) {
		this.textCodigoPostal = textCodigoPostal;
	}

	public TextField getTextProvincia() {
		return textProvincia;
	}

	public void setTextProvincia(TextField textProvincia) {
		this.textProvincia = textProvincia;
	}

	public TextField getTextPortal() {
		return textPortal;
	}

	public void setTextPortal(TextField textPortal) {
		this.textPortal = textPortal;
	}

	public TextField getTextCalle() {
		return textCalle;
	}

	public void setTextCalle(TextField textCalle) {
		this.textCalle = textCalle;
	}

	public TextField getTextLocalidad() {
		return textLocalidad;
	}

	public void setTextLocalidad(TextField textLocalidad) {
		this.textLocalidad = textLocalidad;
	}

	public TextField getVaadinTextField() {
		return vaadinTextField;
	}

	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}

	public TextField getTextNombreCliente() {
		return textNombreCliente;
	}

	public void setTextNombreCliente(TextField textNombreCliente) {
		this.textNombreCliente = textNombreCliente;
	}

	public TextField getTextNumeroPedido() {
		return textNumeroPedido;
	}

	public void setTextNumeroPedido(TextField textNumeroPedido) {
		this.textNumeroPedido = textNumeroPedido;
	}

	public Element getLayoutCompra() {
		return layoutCompra;
	}

	public void setLayoutCompra(Element layoutCompra) {
		this.layoutCompra = layoutCompra;
	}
}
