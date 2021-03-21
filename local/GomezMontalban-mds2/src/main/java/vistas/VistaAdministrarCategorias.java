package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-administrar-categorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-categorias")
@JsModule("./src/vista-administrar-categorias.js")
public class VistaAdministrarCategorias extends PolymerTemplate<VistaAdministrarCategorias.VistaAdministrarCategoriasModel> {

    @Id("vaadinVerticalLayoutAdministrarCategorias")
	private Element vaadinVerticalLayout;
	@Id("vaadinButtonCancelarAlta")
	private Button vaadinButton;
	@Id("vaadinButtonAceptarBaja")
	private Button vaadinButtonAceptarBaja;
	@Id("vaadinButtonCancelarBaja")
	private Button vaadinButtonCancelarBaja;
	@Id("vaadinButtonCancelarAlta")
	private Button vaadinButtonCancelarAlta;
	@Id("vaadinButtonAceptarAlta")
	private Button vaadinButtonAceptarAlta;

	/**
     * Creates a new VistaAdministrarCategorias.
     */
    public VistaAdministrarCategorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarCategorias and vista-administrar-categorias
     */
    public interface VistaAdministrarCategoriasModel extends TemplateModel {
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

	public Button getVaadinButtonAceptarBaja() {
		return vaadinButtonAceptarBaja;
	}

	public void setVaadinButtonAceptarBaja(Button vaadinButtonAceptarBaja) {
		this.vaadinButtonAceptarBaja = vaadinButtonAceptarBaja;
	}

	public Button getVaadinButtonCancelarBaja() {
		return vaadinButtonCancelarBaja;
	}

	public void setVaadinButtonCancelarBaja(Button vaadinButtonCancelarBaja) {
		this.vaadinButtonCancelarBaja = vaadinButtonCancelarBaja;
	}

	public Button getVaadinButtonCancelarAlta() {
		return vaadinButtonCancelarAlta;
	}

	public void setVaadinButtonCancelarAlta(Button vaadinButtonCancelarAlta) {
		this.vaadinButtonCancelarAlta = vaadinButtonCancelarAlta;
	}

	public Button getVaadinButtonAceptarAlta() {
		return vaadinButtonAceptarAlta;
	}

	public void setVaadinButtonAceptarAlta(Button vaadinButtonAceptarAlta) {
		this.vaadinButtonAceptarAlta = vaadinButtonAceptarAlta;
	}
}
