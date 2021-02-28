package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-publicar-oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicar-oferta")
@JsModule("./src/vista-publicar-oferta.js")
public class VistaPublicarOferta extends PolymerTemplate<VistaPublicarOferta.VistaPublicarOfertaModel> {

    /**
     * Creates a new VistaPublicarOferta.
     */
    public VistaPublicarOferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPublicarOferta and vista-publicar-oferta
     */
    public interface VistaPublicarOfertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
