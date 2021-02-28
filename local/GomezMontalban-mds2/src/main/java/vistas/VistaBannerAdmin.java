package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-banner-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-banner-admin")
@JsModule("./src/vista-banner-admin.js")
public class VistaBannerAdmin extends PolymerTemplate<VistaBannerAdmin.VistaBannerAdminModel> {

    /**
     * Creates a new VistaBannerAdmin.
     */
    public VistaBannerAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBannerAdmin and vista-banner-admin
     */
    public interface VistaBannerAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
