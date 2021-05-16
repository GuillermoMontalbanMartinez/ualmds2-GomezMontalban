package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-email template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-email")
@JsModule("./src/vista-email.js")
public class VistaEmail extends PolymerTemplate<VistaEmail.VistaEmailModel> {

    @Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("asuntoText")
	private TextField asuntoText;
	
	@Id("VerButton")
	private Button verButton;

	/**
     * Creates a new VistaEmail.
     */
    public VistaEmail() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmail and vista-email
     */
    public interface VistaEmailModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	

	public TextField getVaadinTextField() {
		return vaadinTextField;
	}

	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}

	public TextField getAsuntoText() {
		return asuntoText;
	}

	public void setAsuntoText(TextField asuntoText) {
		this.asuntoText = asuntoText;
	}


	public Button getVerButton() {
		return verButton;
	}

	public void setVerButton(Button verButton) {
		this.verButton = verButton;
	}

	
}
