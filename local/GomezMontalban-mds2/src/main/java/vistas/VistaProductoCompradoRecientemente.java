package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * A Designer generated component for the vista-producto-comprado-recientemente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-comprado-recientemente")
@JsModule("./src/vista-producto-comprado-recientemente.js")
public class VistaProductoCompradoRecientemente extends PolymerTemplate<VistaProductoCompradoRecientemente.VistaProductoCompradoRecientementeModel> {

    @Id("nombreText")
	private TextField nombreText;
	@Id("imagen")
	private Image imagen;
	@Id("volverAComprar")
	private Button volverAComprar;
	@Id("Reseñar")
	private Button reseñar;
	@Id("precioText")
	private TextField precioText;
	@Id("cuerpoText")
	private TextArea cuerpoText;

	/**
     * Creates a new VistaProductoCompradoRecientemente.
     */
    public VistaProductoCompradoRecientemente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoCompradoRecientemente and vista-producto-comprado-recientemente
     */
    public interface VistaProductoCompradoRecientementeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getNombreText() {
		return nombreText;
	}

	public void setNombreText(TextField nombreText) {
		this.nombreText = nombreText;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public Button getVolverAComprar() {
		return volverAComprar;
	}

	public void setVolverAComprar(Button volverAComprar) {
		this.volverAComprar = volverAComprar;
	}

	public Button getReseñar() {
		return reseñar;
	}

	public void setReseñar(Button reseñar) {
		this.reseñar = reseñar;
	}

	public TextField getPrecioText() {
		return precioText;
	}

	public void setPrecioText(TextField precioText) {
		this.precioText = precioText;
	}

	public TextArea getCuerpoText() {
		return cuerpoText;
	}

	public void setCuerpoText(TextArea cuerpoText) {
		this.cuerpoText = cuerpoText;
	}
}
