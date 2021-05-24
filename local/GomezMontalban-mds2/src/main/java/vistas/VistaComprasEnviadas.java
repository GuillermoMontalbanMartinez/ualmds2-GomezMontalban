package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-compras-enviadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compras-enviadas")
@JsModule("./src/vista-compras-enviadas.js")
public class VistaComprasEnviadas extends PolymerTemplate<VistaComprasEnviadas.VistaComprasEnviadasModel> {

    @Id("vaadinVerticalLayoutComprasEnviadas")
	private Element vaadinVerticalLayout;
	@Id("boton_compras_a_enviar")
	private Button boton_compras_a_enviar;
	@Id("buttonInicio")
	private Button buttonInicio;
	@Id("vistaListadoDeComprasEnviadas")
	private Element vistaListadoDeComprasEnviadas;
	@Id("layoutVistaListadoDeComprasEnviadas")
	private Element layoutVistaListadoDeComprasEnviadas;
	/**
     * Creates a new VistaComprasEnviadas.
     */
    public VistaComprasEnviadas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComprasEnviadas and vista-compras-enviadas
     */
    public interface VistaComprasEnviadasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getBoton_compras_a_enviar() {
		return boton_compras_a_enviar;
	}

	public void setBoton_compras_a_enviar(Button boton_compras_a_enviar) {
		this.boton_compras_a_enviar = boton_compras_a_enviar;
	}

	public Button getButtonInicio() {
		return buttonInicio;
	}

	public void setButtonInicio(Button buttonInicio) {
		this.buttonInicio = buttonInicio;
	}

	public Element getVistaListadoDeComprasEnviadas() {
		return vistaListadoDeComprasEnviadas;
	}

	public void setVistaListadoDeComprasEnviadas(Element vistaListadoDeComprasEnviadas) {
		this.vistaListadoDeComprasEnviadas = vistaListadoDeComprasEnviadas;
	}

	public Element getLayoutVistaListadoDeComprasEnviadas() {
		return layoutVistaListadoDeComprasEnviadas;
	}

	public void setLayoutVistaListadoDeComprasEnviadas(Element layoutVistaListadoDeComprasEnviadas) {
		this.layoutVistaListadoDeComprasEnviadas = layoutVistaListadoDeComprasEnviadas;
	}


}
