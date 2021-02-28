package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-acceder-catalogo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-acceder-catalogo")
@JsModule("./src/vista-acceder-catalogo.js")
public class VistaAccederCatalogo extends PolymerTemplate<VistaAccederCatalogo.VistaAccederCatalogoModel> {

    /**
     * Creates a new VistaAccederCatalogo.
     */
    public VistaAccederCatalogo() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAccederCatalogo and vista-acceder-catalogo
     */
    public interface VistaAccederCatalogoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
