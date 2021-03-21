package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-redactar-correo-administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-redactar-correo-administrador")
@JsModule("./src/vista-redactar-correo-administrador.js")
public class VistaRedactarCorreoAdministrador extends PolymerTemplate<VistaRedactarCorreoAdministrador.VistaRedactarCorreoAdministradorModel> {

    @Id("vaadinButtonAceptar")
	private Button vaadinButton;
	@Id("vaadinButtonAceptar")
	private Button vaadinButtonAceptar;
	@Id("vaadinVerticalLayoutRedactarCorreoAdministrador")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayoutRedactarCorreoAdministrador")
	private Element vaadinVerticalLayoutRedactarCorreoAdministrador;
	@Id("vaadinButtonCancelar")
	private Button vaadinButtonCancelar;

	/**
     * Creates a new VistaRedactarCorreoAdministrador.
     */
    public VistaRedactarCorreoAdministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRedactarCorreoAdministrador and vista-redactar-correo-administrador
     */
    public interface VistaRedactarCorreoAdministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Button getVaadinButtonAceptar() {
		return vaadinButtonAceptar;
	}

	public void setVaadinButtonAceptar(Button vaadinButtonAceptar) {
		this.vaadinButtonAceptar = vaadinButtonAceptar;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinVerticalLayoutRedactarCorreoAdministrador() {
		return vaadinVerticalLayoutRedactarCorreoAdministrador;
	}

	public void setVaadinVerticalLayoutRedactarCorreoAdministrador(
			Element vaadinVerticalLayoutRedactarCorreoAdministrador) {
		this.vaadinVerticalLayoutRedactarCorreoAdministrador = vaadinVerticalLayoutRedactarCorreoAdministrador;
	}

	public Button getVaadinButtonCancelar() {
		return vaadinButtonCancelar;
	}

	public void setVaadinButtonCancelar(Button vaadinButtonCancelar) {
		this.vaadinButtonCancelar = vaadinButtonCancelar;
	}
}
