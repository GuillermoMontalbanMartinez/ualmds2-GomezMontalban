package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-compras-a-enviar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compras-a-enviar")
@JsModule("./src/vista-compras-a-enviar.js")
public class VistaComprasAEnviar extends PolymerTemplate<VistaComprasAEnviar.VistaComprasAEnviarModel> {

    @Id("vaadinVerticalLayoutComprasAEnviar")
	private Element vaadinVerticalLayout;


	public VistaComprasAEnviar() {
        
    }

 
    public interface VistaComprasAEnviarModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }


	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
    
    
}
