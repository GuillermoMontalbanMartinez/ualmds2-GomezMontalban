package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-encargado-de-compras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargado-de-compras")
@JsModule("./src/vista-encargado-de-compras.js")
public class VistaEncargadoDeCompras extends PolymerTemplate<VistaEncargadoDeCompras.VistaEncargadoDeComprasModel> {

    @Id("layout_encargado_de_compras")
	private Element layout_encargado_de_compras;
	@Id("button_compras_enviadas")
	private Button button_compras_enviadas;
	@Id("button_compras_a_enviar")
	private Button button_compras_a_enviar;
	@Id("buttonCerrarSesion")
	private Button buttonCerrarSesion;

	/**
     * Creates a new VistaEncargadoDeCompras.
     */
    public VistaEncargadoDeCompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadoDeCompras and vista-encargado-de-compras
     */
    public interface VistaEncargadoDeComprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getLayout_encargado_de_compras() {
		return layout_encargado_de_compras;
	}

	public void setLayout_encargado_de_compras(Element layout_encargado_de_compras) {
		this.layout_encargado_de_compras = layout_encargado_de_compras;
	}

	public Button getButton_compras_enviadas() {
		return button_compras_enviadas;
	}

	public void setButton_compras_enviadas(Button button_compras_enviadas) {
		this.button_compras_enviadas = button_compras_enviadas;
	}

	public Button getButton_compras_a_enviar() {
		return button_compras_a_enviar;
	}

	public void setButton_compras_a_enviar(Button button_compras_a_enviar) {
		this.button_compras_a_enviar = button_compras_a_enviar;
	}

	public Button getButtonCerrarSesion() {
		return buttonCerrarSesion;
	}

	public void setButtonCerrarSesion(Button buttonCerrarSesion) {
		this.buttonCerrarSesion = buttonCerrarSesion;
	}
}
