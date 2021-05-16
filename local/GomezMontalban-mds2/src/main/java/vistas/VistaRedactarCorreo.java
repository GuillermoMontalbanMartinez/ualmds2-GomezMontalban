package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-redactar-correo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-redactar-correo")
@JsModule("./src/vista-redactar-correo.js")
public class VistaRedactarCorreo extends PolymerTemplate<VistaRedactarCorreo.VistaRedactarCorreoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinButton")
	private Button enviar;
	@Id("vaadinButton1")
	private Button cancelar;
	@Id("cuerpoText")
	private TextArea cuerpoText;
	@Id("destinatarioText")
	private TextField destinatarioText;
	@Id("asuntoText")
	private TextField asuntoText;
	/**
     * Creates a new VistaRedactarCorreo.
     */
    public VistaRedactarCorreo() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRedactarCorreo and vista-redactar-correo
     */
    public interface VistaRedactarCorreoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getEnviar() {
		return enviar;
	}

	public void setEnviar(Button enviar) {
		this.enviar = enviar;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}

	public TextArea getCuerpoText() {
		return cuerpoText;
	}

	public void setCuerpoText(TextArea cuerpoText) {
		this.cuerpoText = cuerpoText;
	}

	public TextField getDestinatarioText() {
		return destinatarioText;
	}

	public void setDestinatarioText(TextField destinatarioText) {
		this.destinatarioText = destinatarioText;
	}

	public TextField getAsuntoText() {
		return asuntoText;
	}

	public void setAsuntoText(TextField asuntoText) {
		this.asuntoText = asuntoText;
	}
}
