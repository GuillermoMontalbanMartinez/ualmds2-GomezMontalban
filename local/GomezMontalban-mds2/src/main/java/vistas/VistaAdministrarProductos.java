package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administrar-productos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-productos")
@JsModule("./src/vista-administrar-productos.js")
public class VistaAdministrarProductos extends PolymerTemplate<VistaAdministrarProductos.VistaAdministrarProductosModel> {

    /**
     * Creates a new VistaAdministrarProductos.
     */
    public VistaAdministrarProductos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarProductos and vista-administrar-productos
     */
    public interface VistaAdministrarProductosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
