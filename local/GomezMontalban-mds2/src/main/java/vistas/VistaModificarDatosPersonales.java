package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-modificar-datos-personales template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar-datos-personales")
@JsModule("./src/vista-modificar-datos-personales.js")
public class VistaModificarDatosPersonales extends PolymerTemplate<VistaModificarDatosPersonales.VistaModificarDatosPersonalesModel> {

    /**
     * Creates a new VistaModificarDatosPersonales.
     */
    public VistaModificarDatosPersonales() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificarDatosPersonales and vista-modificar-datos-personales
     */
    public interface VistaModificarDatosPersonalesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
