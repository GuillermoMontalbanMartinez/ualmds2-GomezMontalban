package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-buscar-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar-producto")
@JsModule("./src/vista-buscar-producto.js")
public class VistaBuscarProducto extends PolymerTemplate<VistaBuscarProducto.VistaBuscarProductoModel> {

    /**
     * Creates a new VistaBuscarProducto.
     */
    public VistaBuscarProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscarProducto and vista-buscar-producto
     */
    public interface VistaBuscarProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
