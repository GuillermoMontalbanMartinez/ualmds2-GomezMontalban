package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administrar-categorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-categorias")
@JsModule("./src/vista-administrar-categorias.js")
public class VistaAdministrarCategorias extends PolymerTemplate<VistaAdministrarCategorias.VistaAdministrarCategoriasModel> {

    /**
     * Creates a new VistaAdministrarCategorias.
     */
    public VistaAdministrarCategorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarCategorias and vista-administrar-categorias
     */
    public interface VistaAdministrarCategoriasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
