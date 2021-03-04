package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-escribir-reseña template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-escribir-reseña")
@JsModule("./src/vista-escribir-reseña.js")
public class VistaEscribirReseña extends PolymerTemplate<VistaEscribirReseña.VistaEscribirReseñaModel> {

    /**
     * Creates a new VistaEscribirReseña.
     */
    public VistaEscribirReseña() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEscribirReseña and vista-escribir-reseña
     */
    public interface VistaEscribirReseñaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
