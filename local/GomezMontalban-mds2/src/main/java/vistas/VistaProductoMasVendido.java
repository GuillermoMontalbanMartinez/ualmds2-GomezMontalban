package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-producto-mas-vendido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-mas-vendido")
@JsModule("./src/vista-producto-mas-vendido.js")
public class VistaProductoMasVendido extends PolymerTemplate<VistaProductoMasVendido.VistaProductoMasVendidoModel> {

 
	@Id("textNombre")
	private TextField textNombre;
	@Id("imagen")
	private Image imagen;
	@Id("textDescripcion")
	private TextArea textDescripcion;
	@Id("textPrecio")
	private TextField textPrecio;
	@Id("anadirAlCarrito")
	private Button anadirAlCarrito;
	@Id("verCaracteristicas")
	private Button verCaracteristicas;

	/**
     * Creates a new VistaProductoMasVendido.
     */
    public VistaProductoMasVendido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoMasVendido and vista-producto-mas-vendido
     */
    public interface VistaProductoMasVendidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(TextField textNombre) {
		this.textNombre = textNombre;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public TextArea getTextDescripcion() {
		return textDescripcion;
	}

	public void setTextDescripcion(TextArea textDescripcion) {
		this.textDescripcion = textDescripcion;
	}

	public TextField getTextPrecio() {
		return textPrecio;
	}

	public void setTextPrecio(TextField textPrecio) {
		this.textPrecio = textPrecio;
	}

	public Button getAnadirAlCarrito() {
		return anadirAlCarrito;
	}

	public void setAnadirAlCarrito(Button anadirAlCarrito) {
		this.anadirAlCarrito = anadirAlCarrito;
	}

	public Button getVerCaracteristicas() {
		return verCaracteristicas;
	}

	public void setVerCaracteristicas(Button verCaracteristicas) {
		this.verCaracteristicas = verCaracteristicas;
	}
}
