package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-banner-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-banner-registrado")
@JsModule("./src/vista-banner-registrado.js")
public class VistaBannerRegistrado extends PolymerTemplate<VistaBannerRegistrado.VistaBannerRegistradoModel> {

    @Id("Perfil")
	private Button perfil;
	@Id("Correo")
	private Button correo;

	/**
     * Creates a new VistaBannerRegistrado.
     */
    public VistaBannerRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBannerRegistrado and vista-banner-registrado
     */
    public interface VistaBannerRegistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getPerfil() {
		return perfil;
	}

	public void setPerfil(Button perfil) {
		this.perfil = perfil;
	}

	public Button getCorreo() {
		return correo;
	}

	public void setCorreo(Button correo) {
		this.correo = correo;
	}
}
