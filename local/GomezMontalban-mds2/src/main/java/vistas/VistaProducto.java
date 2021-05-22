package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto")
@JsModule("./src/vista-producto.js")
public class VistaProducto extends PolymerTemplate<VistaProducto.VistaProductoModel> {


	@Id("idFoto")
	private Image idFoto;
	@Id("textDescripcion")
	private TextArea textDescripcion;
	@Id("buttonAgregarCarrito")
	private Button buttonAgregarCarrito;
	@Id("textPrecio")
	private TextField textPrecio;
	@Id("textNombre")
	private TextField textNombre;

	@Id("verCaracteristicas")
	private Button verCaracteristicas;

	/**
     * Creates a new VistaProducto.
     */
    public VistaProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProducto and vista-producto
     */
    public interface VistaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Image getIdFoto() {
		return idFoto;
	}

	public void setIdFoto(Image idFoto) {
		this.idFoto = idFoto;
	}

	public TextArea getTextDescripcion() {
		return textDescripcion;
	}

	public void setTextDescripcion(TextArea textDescripcion) {
		this.textDescripcion = textDescripcion;
	}

	public Button getButtonAgregarCarrito() {
		return buttonAgregarCarrito;
	}

	public void setButtonAgregarCarrito(Button buttonAgregarCarrito) {
		this.buttonAgregarCarrito = buttonAgregarCarrito;
	}

	public TextField getTextPrecio() {
		return textPrecio;
	}

	public void setTextPrecio(TextField textPrecio) {
		this.textPrecio = textPrecio;
	}

	public TextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(TextField textNombre) {
		this.textNombre = textNombre;
	}

	public Button getVerCaracteristicas() {
		return verCaracteristicas;
	}

	public void setVerCaracteristicas(Button verCaracteristicas) {
		this.verCaracteristicas = verCaracteristicas;
	}


}
