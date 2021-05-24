package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-productos-mas-vendidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos-mas-vendidos")
@JsModule("./src/vista-productos-mas-vendidos.js")
public class VistaProductosMasVendidos extends PolymerTemplate<VistaProductosMasVendidos.VistaProductosMasVendidosModel> {

    @Id("layoutProductos")
	private Element layoutProductos;
	@Id("selectLayout")
	private Element selectLayout;

	/**
     * Creates a new VistaProductosMasVendidos.
     */
    public VistaProductosMasVendidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosMasVendidos and vista-productos-mas-vendidos
     */
    public interface VistaProductosMasVendidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getLayoutProductos() {
		return layoutProductos;
	}

	public void setLayoutProductos(Element layoutProductos) {
		this.layoutProductos = layoutProductos;
	}

	public Element getSelectLayout() {
		return selectLayout;
	}

	public void setSelectLayout(Element selectLayout) {
		this.selectLayout = selectLayout;
	}
}
