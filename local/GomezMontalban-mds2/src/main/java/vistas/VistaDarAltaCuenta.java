package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-dar-alta-cuenta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-alta-cuenta")
@JsModule("./src/vista-dar-alta-cuenta.js")
public class VistaDarAltaCuenta extends PolymerTemplate<VistaDarAltaCuenta.VistaDarAltaCuentaModel> {

    /**
     * Creates a new VistaDarAltaCuenta.
     */
    public VistaDarAltaCuenta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarAltaCuenta and vista-dar-alta-cuenta
     */
    public interface VistaDarAltaCuentaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
