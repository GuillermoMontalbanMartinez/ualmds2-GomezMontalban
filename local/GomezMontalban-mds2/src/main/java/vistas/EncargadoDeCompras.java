package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the encargado-de-compras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("encargado-de-compras")
@JsModule("./src/encargado-de-compras.js")
public class EncargadoDeCompras extends PolymerTemplate<EncargadoDeCompras.EncargadoDeComprasModel> {

    /**
     * Creates a new EncargadoDeCompras.
     */
    public EncargadoDeCompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between EncargadoDeCompras and encargado-de-compras
     */
    public interface EncargadoDeComprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
