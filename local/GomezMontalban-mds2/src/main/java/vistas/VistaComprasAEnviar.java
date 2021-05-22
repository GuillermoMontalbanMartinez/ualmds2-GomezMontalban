package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

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
	@Id("boton_compras_a_enviar")
	private Button boton_compras_a_enviar;
	@Id("boton_compras_enviadas")
	private Button boton_compras_enviadas;

	@Id("buttonInicio")
	private Button buttonInicio;


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


	public Button getBoton_compras_enviadas() {
		return boton_compras_enviadas;
	}


	public void setBoton_compras_enviadas(Button boton_compras_enviadas) {
		this.boton_compras_enviadas = boton_compras_enviadas;
	}


	public Button getBoton_compras_a_enviar() {
		return boton_compras_a_enviar;
	}


	public void setBoton_compras_a_enviar(Button boton_compras_a_enviar) {
		this.boton_compras_a_enviar = boton_compras_a_enviar;
	}


	public Button getButtonInicio() {
		return buttonInicio;
	}


	public void setButtonInicio(Button buttonInicio) {
		this.buttonInicio = buttonInicio;
	}


    
}
