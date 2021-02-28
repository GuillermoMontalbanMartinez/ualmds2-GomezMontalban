package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administrar-ofertas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-ofertas")
@JsModule("./src/vista-administrar-ofertas.js")
public class VistaAdministrarOfertas extends PolymerTemplate<VistaAdministrarOfertas.VistaAdministrarOfertasModel> {

    /**
     * Creates a new VistaAdministrarOfertas.
     */
    public VistaAdministrarOfertas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarOfertas and vista-administrar-ofertas
     */
    public interface VistaAdministrarOfertasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
