package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

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
}
