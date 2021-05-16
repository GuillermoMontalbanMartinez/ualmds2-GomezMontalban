package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-correo-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-correo-usuario")
@JsModule("./src/vista-correo-usuario.js")
public class VistaCorreoUsuario extends PolymerTemplate<VistaCorreoUsuario.VistaCorreoUsuarioModel> {

    @Id("layout")
	private HorizontalLayout layout;
	@Id("layoutEmails")
	private Element layoutEmails;
	@Id("redactarButton")
	private Button redactarButton;
	
	public Element getLayoutEmails() {
		return layoutEmails;
	}

	public void setLayoutEmails(Element layoutEmails) {
		this.layoutEmails = layoutEmails;
	}

	/**
     * Creates a new VistaCorreoUsuario.
     */
    public VistaCorreoUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCorreoUsuario and vista-correo-usuario
     */
    public interface VistaCorreoUsuarioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getLayout() {
		return layout;
	}

	public void setLayout(HorizontalLayout layout) {
		this.layout = layout;
	}

	public Button getRedactarButton() {
		return redactarButton;
	}

	public void setRedactarButton(Button redactarButton) {
		this.redactarButton = redactarButton;
	}

	

	

}
