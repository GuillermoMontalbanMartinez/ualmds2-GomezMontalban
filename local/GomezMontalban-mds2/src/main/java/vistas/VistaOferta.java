package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-oferta")
@JsModule("./src/vista-oferta.js")
public class VistaOferta extends PolymerTemplate<VistaOferta.VistaOfertaModel> {

    @Id("imagen")
	private Image imagen;
	@Id("nombreText")
	private TextField nombreText;
	@Id("fechaLimiteText")
	private TextField fechaLimiteText;
	@Id("precioAnteriorText")
	private TextField precioAnteriorText;
	@Id("PrecioNuevoText")
	private TextField precioNuevoText;
	@Id("verCaracteristicasButton")
	private Button verCaracteristicasButton;

	/**
     * Creates a new VistaOferta.
     */
    public VistaOferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOferta and vista-oferta
     */
    public interface VistaOfertaModel extends TemplateModel {
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

	public TextField getFechaLimiteText() {
		return fechaLimiteText;
	}

	public void setFechaLimiteText(TextField fechaLimiteText) {
		this.fechaLimiteText = fechaLimiteText;
	}

	public TextField getPrecioAnteriorText() {
		return precioAnteriorText;
	}

	public void setPrecioAnteriorText(TextField precioAnteriorText) {
		this.precioAnteriorText = precioAnteriorText;
	}

	public TextField getPrecioNuevoText() {
		return precioNuevoText;
	}

	public void setPrecioNuevoText(TextField precioNuevoText) {
		this.precioNuevoText = precioNuevoText;
	}

	public Button getVerCaracteristicasButton() {
		return verCaracteristicasButton;
	}

	public void setVerCaracteristicasButton(Button verCaracteristicasButton) {
		this.verCaracteristicasButton = verCaracteristicasButton;
	}
}
