package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-dar-baja-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-baja-producto")
@JsModule("./src/vista-dar-baja-producto.js")
public class VistaDarBajaProducto extends PolymerTemplate<VistaDarBajaProducto.VistaDarBajaProductoModel> {

    /**
     * Creates a new VistaDarBajaProducto.
     */
    public VistaDarBajaProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarBajaProducto and vista-dar-baja-producto
     */
    public interface VistaDarBajaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
