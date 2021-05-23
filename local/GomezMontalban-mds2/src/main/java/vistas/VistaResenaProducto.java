package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * A Designer generated component for the vista-resena-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-resena-producto")
@JsModule("./src/vista-resena-producto.js")
public class VistaResenaProducto extends PolymerTemplate<VistaResenaProducto.VistaResenaProductoModel> {

    @Id("nombreText")
	private TextField nombreText;
	@Id("valoracionText")
	private TextField valoracionText;
	@Id("contenidoText")
	private TextArea contenidoText;

	/**
     * Creates a new VistaResenaProducto.
     */
    public VistaResenaProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaResenaProducto and vista-resena-producto
     */
    public interface VistaResenaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getNombreText() {
		return nombreText;
	}

	public void setNombreText(TextField nombreText) {
		this.nombreText = nombreText;
	}

	public TextField getValoracionText() {
		return valoracionText;
	}

	public void setValoracionText(TextField valoracionText) {
		this.valoracionText = valoracionText;
	}

	public TextArea getContenidoText() {
		return contenidoText;
	}

	public void setContenidoText(TextArea contenidoText) {
		this.contenidoText = contenidoText;
	}
}
