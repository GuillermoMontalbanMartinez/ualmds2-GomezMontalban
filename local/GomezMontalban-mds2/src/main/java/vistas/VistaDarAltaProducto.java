package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-dar-alta-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-alta-producto")
@JsModule("./src/vista-dar-alta-producto.js")
public class VistaDarAltaProducto extends PolymerTemplate<VistaDarAltaProducto.VistaDarAltaProductoModel> {

    /**
     * Creates a new VistaDarAltaProducto.
     */
    public VistaDarAltaProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarAltaProducto and vista-dar-alta-producto
     */
    public interface VistaDarAltaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
