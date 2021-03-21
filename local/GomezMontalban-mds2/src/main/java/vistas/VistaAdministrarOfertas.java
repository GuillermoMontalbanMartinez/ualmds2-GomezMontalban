package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-administrar-ofertas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-ofertas")
@JsModule("./src/vista-administrar-ofertas.js")
public class VistaAdministrarOfertas extends PolymerTemplate<VistaAdministrarOfertas.VistaAdministrarOfertasModel> {

    @Id("vaadinVerticalLayoutAdministrarOfertas")
	private Element vaadinVerticalLayout;
	@Id("vaadinButtonAgregarOfertas")
	private Button vaadinButton;
	@Id("vaadinButtonEliminarOfertas")
	private Button vaadinButtonEliminarOfertas;
	@Id("vaadinButtonAgregarOfertas")
	private Button vaadinButtonAgregarOfertas;
	@Id("vaadinVerticalLayoutAdministrarOfertas")
	private Element vaadinVerticalLayoutAdministrarOfertas;

	/**
     * Creates a new VistaAdministrarOfertas.
     */
    public VistaAdministrarOfertas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarOfertas and vista-administrar-ofertas
     */
    public interface VistaAdministrarOfertasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Button getVaadinButtonEliminarOfertas() {
		return vaadinButtonEliminarOfertas;
	}

	public void setVaadinButtonEliminarOfertas(Button vaadinButtonEliminarOfertas) {
		this.vaadinButtonEliminarOfertas = vaadinButtonEliminarOfertas;
	}

	public Button getVaadinButtonAgregarOfertas() {
		return vaadinButtonAgregarOfertas;
	}

	public void setVaadinButtonAgregarOfertas(Button vaadinButtonAgregarOfertas) {
		this.vaadinButtonAgregarOfertas = vaadinButtonAgregarOfertas;
	}

	public Element getVaadinVerticalLayoutAdministrarOfertas() {
		return vaadinVerticalLayoutAdministrarOfertas;
	}

	public void setVaadinVerticalLayoutAdministrarOfertas(Element vaadinVerticalLayoutAdministrarOfertas) {
		this.vaadinVerticalLayoutAdministrarOfertas = vaadinVerticalLayoutAdministrarOfertas;
	}
}
