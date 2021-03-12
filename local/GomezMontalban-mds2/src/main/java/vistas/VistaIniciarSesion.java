package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-iniciar-sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar-sesion")
@JsModule("./src/vista-iniciar-sesion.js")
public class VistaIniciarSesion extends PolymerTemplate<VistaIniciarSesion.VistaIniciarSesionModel> {

    @Id("boton-registrarse-inicio-de-sesion")
	private Button vaadinButton;
	@Id("vaadinVerticalLayout-registrarse-inicio-de-sesion")
	private Element vaadinVerticalLayout;
	@Id("img-login")
	private Image img;
	@Id("vaadinLoginForm-login-inicio-de-sesion")
	private LoginForm vaadinLoginFormLoginInicioDeSesion;
	/**
     * Creates a new VistaIniciarSesion.
     */
    public VistaIniciarSesion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaIniciarSesion and vista-iniciar-sesion
     */
    public interface VistaIniciarSesionModel extends TemplateModel {
        // Add setters and getters for template properties here.
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

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public LoginForm getVaadinLoginFormLoginInicioDeSesion() {
		return vaadinLoginFormLoginInicioDeSesion;
	}

	public void setVaadinLoginFormLoginInicioDeSesion(LoginForm vaadinLoginFormLoginInicioDeSesion) {
		this.vaadinLoginFormLoginInicioDeSesion = vaadinLoginFormLoginInicioDeSesion;
	}
}
