package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-categorias-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-categorias-admin")
@JsModule("./src/vista-categorias-admin.js")
public class VistaCategoriasAdmin extends PolymerTemplate<VistaCategoriasAdmin.VistaCategoriasAdminModel> {

    @Id("selectCategorias")
	private HorizontalLayout selectCategorias;

	/**
     * Creates a new VistaCategoriasAdmin.
     */
    public VistaCategoriasAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCategoriasAdmin and vista-categorias-admin
     */
    public interface VistaCategoriasAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
