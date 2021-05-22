package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import vistas.VistaProductosSeleccionados;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-carrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-carrito")
@JsModule("./src/vista-carrito.js")
public class VistaCarrito extends PolymerTemplate<VistaCarrito.VistaCarritoModel> {

    @Id("vistaProductosSeleccionados")
	private VistaProductosSeleccionados vistaProductosSeleccionados;
	@Id("comprarButton")
	private Button comprarButton;
	@Id("cambiarDatosButton")
	private Button cambiarDatosButton;

	/**
     * Creates a new VistaCarrito.
     */
    public VistaCarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCarrito and vista-carrito
     */
    public interface VistaCarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VistaProductosSeleccionados getVistaProductosSeleccionados() {
		return vistaProductosSeleccionados;
	}

	public void setVistaProductosSeleccionados(VistaProductosSeleccionados vistaProductosSeleccionados) {
		this.vistaProductosSeleccionados = vistaProductosSeleccionados;
	}

	public Button getComprarButton() {
		return comprarButton;
	}

	public void setComprarButton(Button comprarButton) {
		this.comprarButton = comprarButton;
	}

	public Button getCambiarDatosButton() {
		return cambiarDatosButton;
	}

	public void setCambiarDatosButton(Button cambiarDatosButton) {
		this.cambiarDatosButton = cambiarDatosButton;
	}
}
