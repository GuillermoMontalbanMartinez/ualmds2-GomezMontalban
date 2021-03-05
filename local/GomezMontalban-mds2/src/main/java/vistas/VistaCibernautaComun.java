package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-cibernauta-comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cibernauta-comun")
@JsModule("./src/vista-cibernauta-comun.js")
public class VistaCibernautaComun extends PolymerTemplate<VistaCibernautaComun.VistaCibernautaComunModel> {

    /**
     * Creates a new VistaCibernautaComun.
     */
    public VistaCibernautaComun() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCibernautaComun and vista-cibernauta-comun
     */
    public interface VistaCibernautaComunModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
