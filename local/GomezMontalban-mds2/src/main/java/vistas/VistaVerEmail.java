package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver-email template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-email")
@JsModule("./src/vista-ver-email.js")
public class VistaVerEmail extends PolymerTemplate<VistaVerEmail.VistaVerEmailModel> {

    @Id("autorText")
	private TextField autorText;
	@Id("AsuntoText")
	private TextField asuntoText;
	@Id("CuerpoText")
	private TextArea cuerpoText;
	@Id("AtrasButton")
	private Button atrasButton;
	@Id("responderButton")
	private Button responderButton;

	/**
     * Creates a new VistaVerEmail.
     */
    public VistaVerEmail() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerEmail and vista-ver-email
     */
    public interface VistaVerEmailModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getAutorText() {
		return autorText;
	}

	public void setAutorText(TextField autorText) {
		this.autorText = autorText;
	}

	public TextField getAsuntoText() {
		return asuntoText;
	}

	public void setAsuntoText(TextField asuntoText) {
		this.asuntoText = asuntoText;
	}

	public TextArea getCuerpoText() {
		return cuerpoText;
	}

	public void setCuerpoText(TextArea cuerpoText) {
		this.cuerpoText = cuerpoText;
	}

	public Button getAtrasButton() {
		return atrasButton;
	}

	public void setAtrasButton(Button atrasButton) {
		this.atrasButton = atrasButton;
	}

	public Button getResponderButton() {
		return responderButton;
	}

	public void setResponderButton(Button responderButton) {
		this.responderButton = responderButton;
	}
}
