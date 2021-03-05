package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-encargado-de-compras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargado-de-compras")
@JsModule("./src/vista-encargado-de-compras.js")
public class VistaEncargadoDeCompras extends PolymerTemplate<VistaEncargadoDeCompras.VistaEncargadoDeComprasModel> {

    /**
     * Creates a new VistaEncargadoDeCompras.
     */
    public VistaEncargadoDeCompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadoDeCompras and vista-encargado-de-compras
     */
    public interface VistaEncargadoDeComprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
