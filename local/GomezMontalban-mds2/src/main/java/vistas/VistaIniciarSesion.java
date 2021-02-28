package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-iniciar-sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar-sesion")
@JsModule("./src/vista-iniciar-sesion.js")
public class VistaIniciarSesion extends PolymerTemplate<VistaIniciarSesion.VistaIniciarSesionModel> {

    /**
     * Creates a new VistaIniciarSesion.
     */
    public VistaIniciarSesion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaIniciarSesion and vista-iniciar-sesion
     */
    public interface VistaIniciarSesionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
