package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-productos-comprados-recientemente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos-comprados-recientemente")
@JsModule("./src/vista-productos-comprados-recientemente.js")
public class VistaProductosCompradosRecientemente extends PolymerTemplate<VistaProductosCompradosRecientemente.VistaProductosCompradosRecientementeModel> {

    @Id("productosCompradosLayout")
	private Element productosCompradosLayout;

	/**
     * Creates a new VistaProductosCompradosRecientemente.
     */
    public VistaProductosCompradosRecientemente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosCompradosRecientemente and vista-productos-comprados-recientemente
     */
    public interface VistaProductosCompradosRecientementeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getProductosCompradosLayout() {
		return productosCompradosLayout;
	}

	public void setProductosCompradosLayout(Element productosCompradosLayout) {
		this.productosCompradosLayout = productosCompradosLayout;
	}
}
