package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-dar-baja-cuenta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-baja-cuenta")
@JsModule("./src/vista-dar-baja-cuenta.js")
public class VistaDarBajaCuenta extends PolymerTemplate<VistaDarBajaCuenta.VistaDarBajaCuentaModel> {

    @Id("vaadinVerticalLayoutDarDeBajaCuentaDeUsuario")
	private Element vaadinVerticalLayout;
	@Id("buttonCancelar")
	private Button buttonCancelar;
	@Id("buttonAceptar")
	private Button buttonAceptar;
	@Id("text-correo")
	private TextField textCorreo;
	@Id("layout-select")
	private HorizontalLayout layoutSelect;

	/**
     * Creates a new VistaDarBajaCuenta.
     */
    public VistaDarBajaCuenta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarBajaCuenta and vista-dar-baja-cuenta
     */
    public interface VistaDarBajaCuentaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(Button buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}

	public Button getButtonAceptar() {
		return buttonAceptar;
	}

	public void setButtonAceptar(Button buttonAceptar) {
		this.buttonAceptar = buttonAceptar;
	}

	public TextField getTextCorreo() {
		return textCorreo;
	}

	public void setTextCorreo(TextField textCorreo) {
		this.textCorreo = textCorreo;
	}

	public HorizontalLayout getLayoutSelect() {
		return layoutSelect;
	}

	public void setLayoutSelect(HorizontalLayout layoutSelect) {
		this.layoutSelect = layoutSelect;
	}
}
