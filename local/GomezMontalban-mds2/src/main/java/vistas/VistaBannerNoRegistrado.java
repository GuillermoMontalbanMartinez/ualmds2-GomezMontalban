package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-banner-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-banner-no-registrado")
@JsModule("./src/vista-banner-no-registrado.js")
public class VistaBannerNoRegistrado extends PolymerTemplate<VistaBannerNoRegistrado.VistaBannerNoRegistradoModel> {

    /**
     * Creates a new VistaBannerNoRegistrado.
     */
    public VistaBannerNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBannerNoRegistrado and vista-banner-no-registrado
     */
    public interface VistaBannerNoRegistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
