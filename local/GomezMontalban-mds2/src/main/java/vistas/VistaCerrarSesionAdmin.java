package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-cerrar-sesion-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cerrar-sesion-admin")
@JsModule("./src/vista-cerrar-sesion-admin.js")
public class VistaCerrarSesionAdmin extends PolymerTemplate<VistaCerrarSesionAdmin.VistaCerrarSesionAdminModel> {

    @Id("vaadinButtonCerrarSesion")
	private Button vaadinButton;
	@Id("vaadinButtonCancelar")
	private Button vaadinButtonCancelar;
	@Id("vaadinButtonCerrarSesion")
	private Button vaadinButtonCerrarSesion;
	@Id("vaadinVerticalLayoutCerrarSesión")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayoutCerrarSesión")
	private Element vaadinVerticalLayoutCerrarSesión;

	/**
     * Creates a new VistaCerrarSesionAdmin.
     */
    public VistaCerrarSesionAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCerrarSesionAdmin and vista-cerrar-sesion-admin
     */
    public interface VistaCerrarSesionAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getVaadinButtonCancelar() {
		return vaadinButtonCancelar;
	}

	public void setVaadinButtonCancelar(Button vaadinButtonCancelar) {
		this.vaadinButtonCancelar = vaadinButtonCancelar;
	}

	public Button getVaadinButtonCerrarSesion() {
		return vaadinButtonCerrarSesion;
	}

	public void setVaadinButtonCerrarSesion(Button vaadinButtonCerrarSesion) {
		this.vaadinButtonCerrarSesion = vaadinButtonCerrarSesion;
	}

	public Element getVaadinVerticalLayoutCerrarSesión() {
		return vaadinVerticalLayoutCerrarSesión;
	}

	public void setVaadinVerticalLayoutCerrarSesión(Element vaadinVerticalLayoutCerrarSesión) {
		this.vaadinVerticalLayoutCerrarSesión = vaadinVerticalLayoutCerrarSesión;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
}
