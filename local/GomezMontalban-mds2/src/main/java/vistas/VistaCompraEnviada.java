package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-compra-enviada template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compra-enviada")
@JsModule("./src/vista-compra-enviada.js")
public class VistaCompraEnviada extends PolymerTemplate<VistaCompraEnviada.VistaCompraEnviadaModel> {

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
	@Id("textDireccion")
	private TextField textDireccion;
	@Id("textNombreCliente")
	private TextField textNombreCliente;
	@Id("textNumeroPedido")
	private TextField textNumeroPedido;
	@Id("verticalLayoutCompraEnviada")
	private Element verticalLayoutCompraEnviada;
	/**
     * Creates a new VistaCompraEnviada.
     */
    public VistaCompraEnviada() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCompraEnviada and vista-compra-enviada
     */
    public interface VistaCompraEnviadaModel extends TemplateModel {
        // Add setters and getters for template properties here.
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

	public TextField getTextDireccion() {
		return textDireccion;
	}

	public void setTextDireccion(TextField textDireccion) {
		this.textDireccion = textDireccion;
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

	public Element getVerticalLayoutCompraEnviada() {
		return verticalLayoutCompraEnviada;
	}

	public void setVerticalLayoutCompraEnviada(Element verticalLayoutCompraEnviada) {
		this.verticalLayoutCompraEnviada = verticalLayoutCompraEnviada;
	}

	public TextField getTextPortal() {
		return textPortal;
	}

	public void setTextPortal(TextField textPortal) {
		this.textPortal = textPortal;
	}
}
