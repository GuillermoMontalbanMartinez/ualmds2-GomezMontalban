package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-ver-ultimas-compras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-ultimas-compras")
@JsModule("./src/vista-ver-ultimas-compras.js")
public class VistaVerUltimasCompras extends PolymerTemplate<VistaVerUltimasCompras.VistaVerUltimasComprasModel> {

    /**
     * Creates a new VistaVerUltimasCompras.
     */
    public VistaVerUltimasCompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerUltimasCompras and vista-ver-ultimas-compras
     */
    public interface VistaVerUltimasComprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
