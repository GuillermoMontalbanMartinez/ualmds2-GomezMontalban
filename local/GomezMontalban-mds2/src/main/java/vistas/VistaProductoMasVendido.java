package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-producto-mas-vendido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-mas-vendido")
@JsModule("./src/vista-producto-mas-vendido.js")
public class VistaProductoMasVendido extends PolymerTemplate<VistaProductoMasVendido.VistaProductoMasVendidoModel> {

    /**
     * Creates a new VistaProductoMasVendido.
     */
    public VistaProductoMasVendido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoMasVendido and vista-producto-mas-vendido
     */
    public interface VistaProductoMasVendidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
