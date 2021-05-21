package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * A Designer generated component for the vista-reseña template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-reseña")
@JsModule("./src/vista-reseña.js")
public class VistaReseña extends PolymerTemplate<VistaReseña.VistaReseñaModel> {

    @Id("verticalLayoutResena")
	private Element verticalLayoutResena;
	@Id("textValorarionMedia")
	private TextField textValorarionMedia;
	@Id("textDescripcionResena")
	private TextArea textDescripcionResena;

	/**
     * Creates a new VistaReseña.
     */
    public VistaReseña() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaReseña and vista-reseña
     */
    public interface VistaReseñaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVerticalLayoutResena() {
		return verticalLayoutResena;
	}

	public void setVerticalLayoutResena(Element verticalLayoutResena) {
		this.verticalLayoutResena = verticalLayoutResena;
	}

	public TextField getTextValorarionMedia() {
		return textValorarionMedia;
	}

	public void setTextValorarionMedia(TextField textValorarionMedia) {
		this.textValorarionMedia = textValorarionMedia;
	}

	public TextArea getTextDescripcionResena() {
		return textDescripcionResena;
	}

	public void setTextDescripcionResena(TextArea textDescripcionResena) {
		this.textDescripcionResena = textDescripcionResena;
	}
}
