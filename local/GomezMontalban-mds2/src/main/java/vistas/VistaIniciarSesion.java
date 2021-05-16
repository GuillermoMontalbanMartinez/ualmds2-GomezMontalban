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

   
	@Id("login")
	private Element login;
	@Id("vaadinVerticalLayout-de-la-imagen-inicio-de-sesion")
	private Element vaadinVerticalLayoutDeLaImagenInicioDeSesion;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vaadinVerticalLayout-registrarse-inicio-de-sesion")
	private Element vaadinVerticalLayoutRegistrarseInicioDeSesion;
	@Id("vaadinLoginForm-login-inicio-de-sesion")
	private LoginForm vaadinLoginFormLoginInicioDeSesion;
	@Id("botton-registro")
	private Button bottonRegistro;
	@Id("cancelarB")
	private Button cancelarB;
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



	


	public Element getLogin() {
		return login;
	}

	public void setLogin(Element login) {
		this.login = login;
	}

	public LoginForm getVaadinLoginFormLoginInicioDeSesion() {
		return vaadinLoginFormLoginInicioDeSesion;
	}

	public void setVaadinLoginFormLoginInicioDeSesion(LoginForm vaadinLoginFormLoginInicioDeSesion) {
		this.vaadinLoginFormLoginInicioDeSesion = vaadinLoginFormLoginInicioDeSesion;
	}

	public Button getBottonRegistro() {
		return bottonRegistro;
	}

	public void setBottonRegistro(Button bottonRegistro) {
		this.bottonRegistro = bottonRegistro;
	}

	public Button getCancelarB() {
		return cancelarB;
	}

	public void setCancelarB(Button cancelarB) {
		this.cancelarB = cancelarB;
	}
}
