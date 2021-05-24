package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver-ficha template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-ficha")
@JsModule("./src/vista-ver-ficha.js")
public class VistaVerFicha extends PolymerTemplate<VistaVerFicha.VistaVerFichaModel> {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public TextField getTextCliente() {
		return textCliente;
	}

	public void setTextCliente(TextField textCliente) {
		this.textCliente = textCliente;
	}

	public TextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(TextField textNombre) {
		this.textNombre = textNombre;
	}

	public TextField getTextCalle() {
		return textCalle;
	}

	public void setTextCalle(TextField textCalle) {
		this.textCalle = textCalle;
	}

	public TextField getTextLocalidad() {
		return textLocalidad;
	}

	public void setTextLocalidad(TextField textLocalidad) {
		this.textLocalidad = textLocalidad;
	}

	public TextField getTextPais() {
		return textPais;
	}

	public void setTextPais(TextField textPais) {
		this.textPais = textPais;
	}

	public TextField getTextPortal() {
		return textPortal;
	}

	public void setTextPortal(TextField textPortal) {
		this.textPortal = textPortal;
	}

	public TextField getTextProvincia() {
		return textProvincia;
	}

	public void setTextProvincia(TextField textProvincia) {
		this.textProvincia = textProvincia;
	}

	public TextField getTextCodigoPostal() {
		return textCodigoPostal;
	}

	public void setTextCodigoPostal(TextField textCodigoPostal) {
		this.textCodigoPostal = textCodigoPostal;
	}

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("textCliente")
	private TextField textCliente;
	@Id("textNombre")
	private TextField textNombre;
	@Id("textCalle")
	private TextField textCalle;
	@Id("textLocalidad")
	private TextField textLocalidad;
	@Id("textPais")
	private TextField textPais;
	@Id("textPortal")
	private TextField textPortal;
	@Id("textProvincia")
	private TextField textProvincia;
	@Id("textCodigoPostal")
	private TextField textCodigoPostal;
	@Id("buttonAtras")
	private Button buttonAtras;

	/**
     * Creates a new VistaVerFicha.
     */
    public VistaVerFicha() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerFicha and vista-ver-ficha
     */
    public interface VistaVerFichaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getButtonAtras() {
		return buttonAtras;
	}

	public void setButtonAtras(Button buttonAtras) {
		this.buttonAtras = buttonAtras;
	}
}
