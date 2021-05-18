package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-dar-de-baja-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-de-baja-usuario")
@JsModule("./src/vista-dar-de-baja-usuario.js")
public class VistaDarDeBajaUsuario extends PolymerTemplate<VistaDarDeBajaUsuario.VistaDarDeBajaUsuarioModel> {

    @Id("buttonConfirmarBajaUsuario")
	private Button buttonConfirmarBajaUsuario;
	@Id("buttonCancelarBajaUsuario")
	private Button buttonCancelarBajaUsuario;

	/**
     * Creates a new VistaDarDeBajaUsuario.
     */
    public VistaDarDeBajaUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarDeBajaUsuario and vista-dar-de-baja-usuario
     */
    public interface VistaDarDeBajaUsuarioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getButtonConfirmarBajaUsuario() {
		return buttonConfirmarBajaUsuario;
	}

	public void setButtonConfirmarBajaUsuario(Button buttonConfirmarBajaUsuario) {
		this.buttonConfirmarBajaUsuario = buttonConfirmarBajaUsuario;
	}

	public Button getButtonCancelarBajaUsuario() {
		return buttonCancelarBajaUsuario;
	}

	public void setButtonCancelarBajaUsuario(Button buttonCancelarBajaUsuario) {
		this.buttonCancelarBajaUsuario = buttonCancelarBajaUsuario;
	}
}
