package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-reseña template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-reseña")
@JsModule("./src/vista-reseña.js")
public class VistaReseña extends PolymerTemplate<VistaReseña.VistaReseñaModel> {

    /**
     * Creates a new VistaReseña.
     */
    public VistaReseña() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaReseña and vista-reseña
     */
    public interface VistaReseñaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
