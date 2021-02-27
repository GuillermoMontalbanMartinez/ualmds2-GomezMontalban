package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the cibernauta-comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("cibernauta-comun")
@JsModule("./src/cibernauta-comun.js")
public class CibernautaComun extends PolymerTemplate<CibernautaComun.CibernautaComunModel> {

    /**
     * Creates a new CibernautaComun.
     */
    public CibernautaComun() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between CibernautaComun and cibernauta-comun
     */
    public interface CibernautaComunModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
