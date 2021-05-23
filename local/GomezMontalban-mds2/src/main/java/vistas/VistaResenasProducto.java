package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-resenas-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-resenas-producto")
@JsModule("./src/vista-resenas-producto.js")
public class VistaResenasProducto extends PolymerTemplate<VistaResenasProducto.VistaResenasProductoModel> {

    /**
     * Creates a new VistaResenasProducto.
     */
    public VistaResenasProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaResenasProducto and vista-resenas-producto
     */
    public interface VistaResenasProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
