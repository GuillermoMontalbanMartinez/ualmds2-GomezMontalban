package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-ver-publicidad template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-publicidad")
@JsModule("./src/vista-ver-publicidad.js")
public class VistaVerPublicidad extends PolymerTemplate<VistaVerPublicidad.VistaVerPublicidadModel> {

    /**
     * Creates a new VistaVerPublicidad.
     */
    public VistaVerPublicidad() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerPublicidad and vista-ver-publicidad
     */
    public interface VistaVerPublicidadModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
