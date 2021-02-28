package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-producto-comprado-recientemente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-comprado-recientemente")
@JsModule("./src/vista-producto-comprado-recientemente.js")
public class VistaProductoCompradoRecientemente extends PolymerTemplate<VistaProductoCompradoRecientemente.VistaProductoCompradoRecientementeModel> {

    /**
     * Creates a new VistaProductoCompradoRecientemente.
     */
    public VistaProductoCompradoRecientemente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoCompradoRecientemente and vista-producto-comprado-recientemente
     */
    public interface VistaProductoCompradoRecientementeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
