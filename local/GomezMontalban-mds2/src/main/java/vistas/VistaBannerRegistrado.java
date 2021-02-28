package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-banner-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-banner-registrado")
@JsModule("./src/vista-banner-registrado.js")
public class VistaBannerRegistrado extends PolymerTemplate<VistaBannerRegistrado.VistaBannerRegistradoModel> {

    /**
     * Creates a new VistaBannerRegistrado.
     */
    public VistaBannerRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBannerRegistrado and vista-banner-registrado
     */
    public interface VistaBannerRegistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
