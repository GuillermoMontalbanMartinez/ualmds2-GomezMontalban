package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-modificar-datos-de-compra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar-datos-de-compra")
@JsModule("./src/vista-modificar-datos-de-compra.js")
public class VistaModificarDatosDeCompra extends PolymerTemplate<VistaModificarDatosDeCompra.VistaModificarDatosDeCompraModel> {

    /**
     * Creates a new VistaModificarDatosDeCompra.
     */
    public VistaModificarDatosDeCompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificarDatosDeCompra and vista-modificar-datos-de-compra
     */
    public interface VistaModificarDatosDeCompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
