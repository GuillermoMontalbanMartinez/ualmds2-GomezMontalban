package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-productos-comprados-recientemente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos-comprados-recientemente")
@JsModule("./src/vista-productos-comprados-recientemente.js")
public class VistaProductosCompradosRecientemente extends PolymerTemplate<VistaProductosCompradosRecientemente.VistaProductosCompradosRecientementeModel> {

    /**
     * Creates a new VistaProductosCompradosRecientemente.
     */
    public VistaProductosCompradosRecientemente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductosCompradosRecientemente and vista-productos-comprados-recientemente
     */
    public interface VistaProductosCompradosRecientementeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
