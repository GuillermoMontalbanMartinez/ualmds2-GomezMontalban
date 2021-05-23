package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-pedido-encargado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedido-encargado")
@JsModule("./src/vista-pedido-encargado.js")
public class VistaPedidoEncargado extends PolymerTemplate<VistaPedidoEncargado.VistaPedidoEncargadoModel> {

    @Id("textDescripcion")
	private TextArea textDescripcion;
	@Id("textEstadoDelPedido")
	private TextField textEstadoDelPedido;
	@Id("buttonCancelar")
	private Button buttonCancelar;
	@Id("imagen")
	private Image imagen;

	/**
     * Creates a new VistaPedidoEncargado.
     */
    public VistaPedidoEncargado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedidoEncargado and vista-pedido-encargado
     */
    public interface VistaPedidoEncargadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextArea getTextDescripcion() {
		return textDescripcion;
	}

	public void setTextDescripcion(TextArea textDescripcion) {
		this.textDescripcion = textDescripcion;
	}

	public TextField getTextEstadoDelPedido() {
		return textEstadoDelPedido;
	}

	public void setTextEstadoDelPedido(TextField textEstadoDelPedido) {
		this.textEstadoDelPedido = textEstadoDelPedido;
	}

	public Button getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(Button buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
}
