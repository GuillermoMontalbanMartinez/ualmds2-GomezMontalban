package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administrar-cuentas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-cuentas")
@JsModule("./src/vista-administrar-cuentas.js")
public class VistaAdministrarCuentas extends PolymerTemplate<VistaAdministrarCuentas.VistaAdministrarCuentasModel> {

    /**
     * Creates a new VistaAdministrarCuentas.
     */
    public VistaAdministrarCuentas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarCuentas and vista-administrar-cuentas
     */
    public interface VistaAdministrarCuentasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
