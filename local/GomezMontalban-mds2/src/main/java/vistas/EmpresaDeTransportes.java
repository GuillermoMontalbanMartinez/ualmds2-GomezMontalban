package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the empresa-de-transportes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("empresa-de-transportes")
@JsModule("./src/empresa-de-transportes.js")
public class EmpresaDeTransportes extends PolymerTemplate<EmpresaDeTransportes.EmpresaDeTransportesModel> {

    /**
     * Creates a new EmpresaDeTransportes.
     */
    public EmpresaDeTransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between EmpresaDeTransportes and empresa-de-transportes
     */
    public interface EmpresaDeTransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
