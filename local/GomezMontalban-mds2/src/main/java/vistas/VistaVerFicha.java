package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-ver-ficha template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-ficha")
@JsModule("./src/vista-ver-ficha.js")
public class VistaVerFicha extends PolymerTemplate<VistaVerFicha.VistaVerFichaModel> {

    /**
     * Creates a new VistaVerFicha.
     */
    public VistaVerFicha() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerFicha and vista-ver-ficha
     */
    public interface VistaVerFichaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
