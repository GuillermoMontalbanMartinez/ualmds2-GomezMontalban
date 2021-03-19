package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-banner-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-banner-admin")
@JsModule("./src/vista-banner-admin.js")
public class VistaBannerAdmin extends PolymerTemplate<VistaBannerAdmin.VistaBannerAdminModel> {

    @Id("vaadinButtonAdministrarProductos")
	private Button vaadinButtonAdministrarProductos;
	@Id("vaadinButtonAdministrarOfertas")
	private Button vaadinButtonAdministrarOfertas;
	@Id("vaadinButtonAdministrarCuentas")
	private Button vaadinButtonAdministrarCuentas;
	@Id("vaadinButtonPrincipal")
	private Button vaadinButtonPrincipal;
	@Id("vaadinButtonListadoDeCompras")
	private Button vaadinButtonListadoDeCompras;
	@Id("vaadinButtonCerrarSesión")
	private Button vaadinButtonCerrarSesión;
	@Id("vaadinButtonAdministrarCategorias")
	private Button vaadinButtonAdministrarCategorias;
	@Id("vaadinVerticalLayoutBannerAdmin")
	private Element vaadinVerticalLayout;
	@Id("vaadinButtonCorreo")
	private Button vaadinButtonCorreo;

	/**
     * Creates a new VistaBannerAdmin.
     */
    public VistaBannerAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBannerAdmin and vista-banner-admin
     */
    public interface VistaBannerAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getVaadinButtonAdministrarProductos() {
		return vaadinButtonAdministrarProductos;
	}

	public void setVaadinButtonAdministrarProductos(Button vaadinButtonAdministrarProductos) {
		this.vaadinButtonAdministrarProductos = vaadinButtonAdministrarProductos;
	}

	public Button getVaadinButtonAdministrarOfertas() {
		return vaadinButtonAdministrarOfertas;
	}

	public void setVaadinButtonAdministrarOfertas(Button vaadinButtonAdministrarOfertas) {
		this.vaadinButtonAdministrarOfertas = vaadinButtonAdministrarOfertas;
	}

	public Button getVaadinButtonAdministrarCuentas() {
		return vaadinButtonAdministrarCuentas;
	}

	public void setVaadinButtonAdministrarCuentas(Button vaadinButtonAdministrarCuentas) {
		this.vaadinButtonAdministrarCuentas = vaadinButtonAdministrarCuentas;
	}

	public Button getVaadinButtonPrincipal() {
		return vaadinButtonPrincipal;
	}

	public void setVaadinButtonPrincipal(Button vaadinButtonPrincipal) {
		this.vaadinButtonPrincipal = vaadinButtonPrincipal;
	}

	public Button getVaadinButtonListadoDeCompras() {
		return vaadinButtonListadoDeCompras;
	}

	public void setVaadinButtonListadoDeCompras(Button vaadinButtonListadoDeCompras) {
		this.vaadinButtonListadoDeCompras = vaadinButtonListadoDeCompras;
	}

	public Button getVaadinButtonCerrarSesión() {
		return vaadinButtonCerrarSesión;
	}

	public void setVaadinButtonCerrarSesión(Button vaadinButtonCerrarSesión) {
		this.vaadinButtonCerrarSesión = vaadinButtonCerrarSesión;
	}

	public Button getVaadinButtonAdministrarCategorias() {
		return vaadinButtonAdministrarCategorias;
	}

	public void setVaadinButtonAdministrarCategorias(Button vaadinButtonAdministrarCategorias) {
		this.vaadinButtonAdministrarCategorias = vaadinButtonAdministrarCategorias;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getVaadinButtonCorreo() {
		return vaadinButtonCorreo;
	}

	public void setVaadinButtonCorreo(Button vaadinButtonCorreo) {
		this.vaadinButtonCorreo = vaadinButtonCorreo;
	}

}
