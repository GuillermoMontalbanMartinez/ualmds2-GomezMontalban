package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-dar-alta-cuenta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-alta-cuenta")
@JsModule("./src/vista-dar-alta-cuenta.js")
public class VistaDarAltaCuenta extends PolymerTemplate<VistaDarAltaCuenta.VistaDarAltaCuentaModel> {

    @Id("vaadinVerticalLayoutDarAltaCuenta")
	private Element vaadinVerticalLayout;
	@Id("vaadinButtonCancelar")
	private Button vaadinButton;
	@Id("vaadinButtonAceptar")
	private Button vaadinButtonAceptar;
	@Id("text-nombre")
	private TextField textNombre;
	@Id("text-correo")
	private TextField textCorreo;
	@Id("text-contrasena")
	private TextField textContrasena;
	@Id("vaadin-select")
	private Select vaadinSelect;
	/**
     * Creates a new VistaDarAltaCuenta.
     */
    public VistaDarAltaCuenta() {
        // You can initialise any data required for the connected UI components here.
    	
    }

    /**
     * This model binds properties between VistaDarAltaCuenta and vista-dar-alta-cuenta
     */
    public interface VistaDarAltaCuentaModel extends TemplateModel {
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

	public Button getVaadinButtonAceptar() {
		return vaadinButtonAceptar;
	}

	public void setVaadinButtonAceptar(Button vaadinButtonAceptar) {
		this.vaadinButtonAceptar = vaadinButtonAceptar;
	}

	public TextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(TextField textNombre) {
		this.textNombre = textNombre;
	}

	public TextField getTextCorreo() {
		return textCorreo;
	}

	public void setTextCorreo(TextField textCorreo) {
		this.textCorreo = textCorreo;
	}

	public TextField getTextContrasena() {
		return textContrasena;
	}

	public void setTextContrasena(TextField textContrasena) {
		this.textContrasena = textContrasena;
	}

	public Select getVaadinSelect() {
		return vaadinSelect;
	}

	public void setVaadinSelect(Select vaadinSelect) {
		this.vaadinSelect = vaadinSelect;
	}

}
