package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-banner-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-banner-no-registrado")
@JsModule("./src/vista-banner-no-registrado.js")
public class VistaBannerNoRegistrado extends PolymerTemplate<VistaBannerNoRegistrado.VistaBannerNoRegistradoModel> {

    @Id("vaadinButton")
	private Button vaadinButton;
	@Id("getPrincipal")
	private Button getPrincipal;

	/**
     * Creates a new VistaBannerNoRegistrado.
     */
    public VistaBannerNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBannerNoRegistrado and vista-banner-no-registrado
     */
    public interface VistaBannerNoRegistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Button getGetPrincipal() {
		return getPrincipal;
	}

	public void setGetPrincipal(Button getPrincipal) {
		this.getPrincipal = getPrincipal;
	}
}
