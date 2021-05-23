package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-resenas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-resenas")
@JsModule("./src/vista-resenas.js")
public class VistaResenas extends PolymerTemplate<VistaResenas.VistaResenasModel> {

    /**
     * Creates a new VistaReseñas.
     */
    public VistaResenas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaReseñas and vista-resenas
     */
    public interface VistaResenasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
