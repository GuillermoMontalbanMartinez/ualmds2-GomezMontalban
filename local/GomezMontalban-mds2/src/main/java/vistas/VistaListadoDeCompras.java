package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-listado-de-compras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listado-de-compras")
@JsModule("./src/vista-listado-de-compras.js")
public class VistaListadoDeCompras extends PolymerTemplate<VistaListadoDeCompras.VistaListadoDeComprasModel> {

    /**
     * Creates a new VistaListadoDeCompras.
     */
    public VistaListadoDeCompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListadoDeCompras and vista-listado-de-compras
     */
    public interface VistaListadoDeComprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
