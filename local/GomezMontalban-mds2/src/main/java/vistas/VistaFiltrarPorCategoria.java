package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-filtrar-por-categoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-filtrar-por-categoria")
@JsModule("./src/vista-filtrar-por-categoria.js")
public class VistaFiltrarPorCategoria extends PolymerTemplate<VistaFiltrarPorCategoria.VistaFiltrarPorCategoriaModel> {

    /**
     * Creates a new VistaFiltrarPorCategoria.
     */
    public VistaFiltrarPorCategoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaFiltrarPorCategoria and vista-filtrar-por-categoria
     */
    public interface VistaFiltrarPorCategoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
