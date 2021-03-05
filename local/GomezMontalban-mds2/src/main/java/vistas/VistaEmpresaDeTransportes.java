package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-empresa-de-transportes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empresa-de-transportes")
@JsModule("./src/vista-empresa-de-transportes.js")
public class VistaEmpresaDeTransportes extends PolymerTemplate<VistaEmpresaDeTransportes.VistaEmpresaDeTransportesModel> {

    /**
     * Creates a new VistaEmpresaDeTransportes.
     */
    public VistaEmpresaDeTransportes() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpresaDeTransportes and vista-empresa-de-transportes
     */
    public interface VistaEmpresaDeTransportesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
