package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-dar-baja-cuenta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-baja-cuenta")
@JsModule("./src/vista-dar-baja-cuenta.js")
public class VistaDarBajaCuenta extends PolymerTemplate<VistaDarBajaCuenta.VistaDarBajaCuentaModel> {

    /**
     * Creates a new VistaDarBajaCuenta.
     */
    public VistaDarBajaCuenta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarBajaCuenta and vista-dar-baja-cuenta
     */
    public interface VistaDarBajaCuentaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
