package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-productos-seleccionados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos-seleccionados")
@JsModule("./src/vista-productos-seleccionados.js")
public class VistaProductosSeleccionados extends PolymerTemplate<VistaProductosSeleccionados.VistaProductosSeleccionadosModel> {

    @Id("listaProductosSeleccionadosLAyout")
	private Element listaProductosSeleccionadosLAyout;

	/**
     * Creates a new VistaProductosSeleccionados.
     */
    public VistaProductosSeleccionados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosSeleccionados and vista-productos-seleccionados
     */
    public interface VistaProductosSeleccionadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getListaProductosSeleccionadosLAyout() {
		return listaProductosSeleccionadosLAyout;
	}

	public void setListaProductosSeleccionadosLAyout(Element listaProductosSeleccionadosLAyout) {
		this.listaProductosSeleccionadosLAyout = listaProductosSeleccionadosLAyout;
	}
}
