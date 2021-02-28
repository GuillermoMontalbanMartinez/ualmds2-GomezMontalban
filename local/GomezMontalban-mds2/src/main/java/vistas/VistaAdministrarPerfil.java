package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-administrar-perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-perfil")
@JsModule("./src/vista-administrar-perfil.js")
public class VistaAdministrarPerfil extends PolymerTemplate<VistaAdministrarPerfil.VistaAdministrarPerfilModel> {

    /**
     * Creates a new VistaAdministrarPerfil.
     */
    public VistaAdministrarPerfil() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarPerfil and vista-administrar-perfil
     */
    public interface VistaAdministrarPerfilModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
