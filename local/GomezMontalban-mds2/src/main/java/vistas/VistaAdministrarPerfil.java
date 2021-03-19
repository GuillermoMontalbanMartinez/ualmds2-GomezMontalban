package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-administrar-perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-perfil")
@JsModule("./src/vista-administrar-perfil.js")
public class VistaAdministrarPerfil extends PolymerTemplate<VistaAdministrarPerfil.VistaAdministrarPerfilModel> {

    @Id("ultimasComprasRealizadas")
	private Button ultimasComprasRealizadas;
	@Id("SeguimientoPedidos")
	private Button seguimientoPedidos;
	@Id("modificarDatosPersonales")
	private Button modificarDatosPersonales;
	@Id("darBajaCuenta")
	private Button darBajaCuenta;
	@Id("CerrarSesion")
	private Button cerrarSesion;

	/**
     * Creates a new VistaAdministrarPerfil.
     */
    public VistaAdministrarPerfil() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarPerfil and vista-administrar-perfil
     */
    public interface VistaAdministrarPerfilModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getUltimasComprasRealizadas() {
		return ultimasComprasRealizadas;
	}

	public void setUltimasComprasRealizadas(Button ultimasComprasRealizadas) {
		this.ultimasComprasRealizadas = ultimasComprasRealizadas;
	}

	public Button getSeguimientoPedidos() {
		return seguimientoPedidos;
	}

	public void setSeguimientoPedidos(Button seguimientoPedidos) {
		this.seguimientoPedidos = seguimientoPedidos;
	}

	public Button getModificarDatosPersonales() {
		return modificarDatosPersonales;
	}

	public void setModificarDatosPersonales(Button modificarDatosPersonales) {
		this.modificarDatosPersonales = modificarDatosPersonales;
	}

	public Button getDarBajaCuenta() {
		return darBajaCuenta;
	}

	public void setDarBajaCuenta(Button darBajaCuenta) {
		this.darBajaCuenta = darBajaCuenta;
	}

	public Button getCerrarSesion() {
		return cerrarSesion;
	}

	public void setCerrarSesion(Button cerrarSesion) {
		this.cerrarSesion = cerrarSesion;
	}
}
