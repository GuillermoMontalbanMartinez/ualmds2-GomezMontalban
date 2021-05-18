package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * A Designer generated component for the vista-producto-seleccionado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-seleccionado")
@JsModule("./src/vista-producto-seleccionado.js")
public class VistaProductoSeleccionado extends PolymerTemplate<VistaProductoSeleccionado.VistaProductoSeleccionadoModel> {

    @Id("imagen")
	private Image imagen;
	@Id("nombreText")
	private TextField nombreText;
	@Id("descripcionText")
	private TextArea descripcionText;
	@Id("quitarButton")
	private Button quitarButton;
	@Id("restarUnidadButton")
	private Button restarUnidadButton;
	@Id("sumarUnidadButton")
	private Button sumarUnidadButton;
	@Id("cantidadText")
	private TextField cantidadText;
	@Id("precioText")
	private TextField precioText;

	/**
     * Creates a new VistaProductoSeleccionado.
     */
    public VistaProductoSeleccionado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoSeleccionado and vista-producto-seleccionado
     */
    public interface VistaProductoSeleccionadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public TextField getNombreText() {
		return nombreText;
	}

	public void setNombreText(TextField nombreText) {
		this.nombreText = nombreText;
	}

	public TextArea getDescripcionText() {
		return descripcionText;
	}

	public void setDescripcionText(TextArea descripcionText) {
		this.descripcionText = descripcionText;
	}

	public Button getQuitarButton() {
		return quitarButton;
	}

	public void setQuitarButton(Button quitarButton) {
		this.quitarButton = quitarButton;
	}

	public Button getRestarUnidadButton() {
		return restarUnidadButton;
	}

	public void setRestarUnidadButton(Button restarUnidadButton) {
		this.restarUnidadButton = restarUnidadButton;
	}

	public Button getSumarUnidadButton() {
		return sumarUnidadButton;
	}

	public void setSumarUnidadButton(Button sumarUnidadButton) {
		this.sumarUnidadButton = sumarUnidadButton;
	}

	public TextField getPrecioText() {
		return precioText;
	}

	public void setPrecioText(TextField precioText) {
		this.precioText = precioText;
	}


	public TextField getCantidadText() {
		return cantidadText;
	}

	public void setCantidadText(TextField cantidadText) {
		this.cantidadText = cantidadText;
	}
}
