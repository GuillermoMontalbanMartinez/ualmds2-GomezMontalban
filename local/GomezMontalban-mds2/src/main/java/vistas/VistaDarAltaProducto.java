package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-dar-alta-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-alta-producto")
@JsModule("./src/vista-dar-alta-producto.js")
public class VistaDarAltaProducto extends PolymerTemplate<VistaDarAltaProducto.VistaDarAltaProductoModel> {

    @Id("ButtonCancelar")
	private Button buttonCancelar;
	@Id("ButtonAceptar")
	private Button buttonAceptar;
	@Id("vaadinVerticalLayoutAltaProducto")
	private Element vaadinVerticalLayoutAltaProducto;

	/**
     * Creates a new VistaDarAltaProducto.
     */
    public VistaDarAltaProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarAltaProducto and vista-dar-alta-producto
     */
    public interface VistaDarAltaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(Button buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}

	public Button getButtonAceptar() {
		return buttonAceptar;
	}

	public void setButtonAceptar(Button buttonAceptar) {
		this.buttonAceptar = buttonAceptar;
	}

	public Element getVaadinVerticalLayoutAltaProducto() {
		return vaadinVerticalLayoutAltaProducto;
	}

	public void setVaadinVerticalLayoutAltaProducto(Element vaadinVerticalLayoutAltaProducto) {
		this.vaadinVerticalLayoutAltaProducto = vaadinVerticalLayoutAltaProducto;
	}
}
