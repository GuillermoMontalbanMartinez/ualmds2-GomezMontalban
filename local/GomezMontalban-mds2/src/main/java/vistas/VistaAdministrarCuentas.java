package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-administrar-cuentas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-cuentas")
@JsModule("./src/vista-administrar-cuentas.js")
public class VistaAdministrarCuentas extends PolymerTemplate<VistaAdministrarCuentas.VistaAdministrarCuentasModel> {

    @Id("vaadinVerticalLayoutAdministrarCuentasDeUsuario")
	private Element vaadinVerticalLayout;
	@Id("vaadinButtonAltaCuentaDeUsuario")
	private Button vaadinButton;
	@Id("vaadinButtonBajaCuentaUsuario")
	private Button vaadinButtonBajaCuentaUsuario;
	@Id("vaadinButtonAltaCuentaDeUsuario")
	private Button vaadinButtonAltaCuentaDeUsuario;
	@Id("vaadinVerticalLayoutAdministrarCuentasDeUsuario")
	private Element vaadinVerticalLayoutAdministrarCuentasDeUsuario;

	/**
     * Creates a new VistaAdministrarCuentas.
     */
    public VistaAdministrarCuentas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarCuentas and vista-administrar-cuentas
     */
    public interface VistaAdministrarCuentasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Button getVaadinButtonBajaCuentaUsuario() {
		return vaadinButtonBajaCuentaUsuario;
	}

	public void setVaadinButtonBajaCuentaUsuario(Button vaadinButtonBajaCuentaUsuario) {
		this.vaadinButtonBajaCuentaUsuario = vaadinButtonBajaCuentaUsuario;
	}

	public Button getVaadinButtonAltaCuentaDeUsuario() {
		return vaadinButtonAltaCuentaDeUsuario;
	}

	public void setVaadinButtonAltaCuentaDeUsuario(Button vaadinButtonAltaCuentaDeUsuario) {
		this.vaadinButtonAltaCuentaDeUsuario = vaadinButtonAltaCuentaDeUsuario;
	}

	public Element getVaadinVerticalLayoutAdministrarCuentasDeUsuario() {
		return vaadinVerticalLayoutAdministrarCuentasDeUsuario;
	}

	public void setVaadinVerticalLayoutAdministrarCuentasDeUsuario(
			Element vaadinVerticalLayoutAdministrarCuentasDeUsuario) {
		this.vaadinVerticalLayoutAdministrarCuentasDeUsuario = vaadinVerticalLayoutAdministrarCuentasDeUsuario;
	}
}
