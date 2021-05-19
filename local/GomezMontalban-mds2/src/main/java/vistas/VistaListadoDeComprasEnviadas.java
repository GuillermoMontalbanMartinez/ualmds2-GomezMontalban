package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-listado-de-compras-enviadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listado-de-compras-enviadas")
@JsModule("./src/vista-listado-de-compras-enviadas.js")
public class VistaListadoDeComprasEnviadas extends PolymerTemplate<VistaListadoDeComprasEnviadas.VistaListadoDeComprasEnviadasModel> {

    @Id("verticalLayoutListadoDeComprasEnviadas")
	private Element verticalLayoutListadoDeComprasEnviadas;

	/**
     * Creates a new VistaListadoDeComprasEnviadas.
     */
    public VistaListadoDeComprasEnviadas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListadoDeComprasEnviadas and vista-listado-de-compras-enviadas
     */
    public interface VistaListadoDeComprasEnviadasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVerticalLayoutListadoDeComprasEnviadas() {
		return verticalLayoutListadoDeComprasEnviadas;
	}

	public void setVerticalLayoutListadoDeComprasEnviadas(Element verticalLayoutListadoDeComprasEnviadas) {
		this.verticalLayoutListadoDeComprasEnviadas = verticalLayoutListadoDeComprasEnviadas;
	}
}
