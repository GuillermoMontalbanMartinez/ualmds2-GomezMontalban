package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-mostrar-fecha-limite template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mostrar-fecha-limite")
@JsModule("./src/vista-mostrar-fecha-limite.js")
public class VistaMostrarFechaLimite extends PolymerTemplate<VistaMostrarFechaLimite.VistaMostrarFechaLimiteModel> {

    /**
     * Creates a new VistaMostrarFechaLimite.
     */
    public VistaMostrarFechaLimite() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMostrarFechaLimite and vista-mostrar-fecha-limite
     */
    public interface VistaMostrarFechaLimiteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
