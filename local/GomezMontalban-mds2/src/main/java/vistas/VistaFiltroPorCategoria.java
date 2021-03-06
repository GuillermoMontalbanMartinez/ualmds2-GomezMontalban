package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-filtro-por-categoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-filtro-por-categoria")
@JsModule("./src/vista-filtro-por-categoria.js")
public class VistaFiltroPorCategoria extends PolymerTemplate<VistaFiltroPorCategoria.VistaFiltroPorCategoriaModel> {

    @Id("selectLayout")
	private Element selectLayout;

	/**
     * Creates a new VistaFiltroPorCategoria.
     */
    public VistaFiltroPorCategoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaFiltroPorCategoria and vista-filtro-por-categoria
     */
    public interface VistaFiltroPorCategoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getSelectLayout() {
		return selectLayout;
	}

	public void setSelectLayout(Element selectLayout) {
		this.selectLayout = selectLayout;
	}
}
