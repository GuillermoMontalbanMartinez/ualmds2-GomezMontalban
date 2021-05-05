package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-cerrar-sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cerrar-sesion")
@JsModule("./src/vista-cerrar-sesion.js")
public class VistaCerrarSesion extends PolymerTemplate<VistaCerrarSesion.VistaCerrarSesionModel> {

    @Id("cerrarSesionBoton")
	private Button cerrarSesionBoton;
	@Id("cancelarBoton")
	private Button cancelarBoton;

	/**
     * Creates a new VistaCerrarSesion.
     */
    public VistaCerrarSesion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCerrarSesion and vista-cerrar-sesion
     */
    public interface VistaCerrarSesionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getCerrarSesionBoton() {
		return cerrarSesionBoton;
	}

	public void setCerrarSesionBoton(Button cerrarSesionBoton) {
		this.cerrarSesionBoton = cerrarSesionBoton;
	}

	public Button getCancelarBoton() {
		return cancelarBoton;
	}

	public void setCancelarBoton(Button cancelarBoton) {
		this.cancelarBoton = cancelarBoton;
	}
}
