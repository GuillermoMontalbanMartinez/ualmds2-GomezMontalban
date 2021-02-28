package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-reseñas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-reseñas")
@JsModule("./src/vista-reseñas.js")
public class VistaReseñas extends PolymerTemplate<VistaReseñas.VistaReseñasModel> {

    /**
     * Creates a new VistaReseñas.
     */
    public VistaReseñas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaReseñas and vista-reseñas
     */
    public interface VistaReseñasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
