package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-dar-baja-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-baja-producto")
@JsModule("./src/vista-dar-baja-producto.js")
public class VistaDarBajaProducto extends PolymerTemplate<VistaDarBajaProducto.VistaDarBajaProductoModel> {

    @Id("ButtonAceptar")
	private Button buttonAceptar;
	@Id("ButtonCancelar")
	private Button buttonCancelar;
	@Id("VaadinVerticalLayoutDarBajaProducto")
	private Element vaadinVerticalLayoutDarBajaProducto;
//	@Id("textIdProductoEliminarProducto")
//	private HorizontalLayout textIdProductoEliminarProducto;
	@Id("textNombreProductoEliminarProducto")
	private HorizontalLayout textNombreProductoEliminarProducto;
	/**
     * Creates a new VistaDarBajaProducto.
     */
    public VistaDarBajaProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarBajaProducto and vista-dar-baja-producto
     */
    public interface VistaDarBajaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getButtonAceptar() {
		return buttonAceptar;
	}

	public void setButtonAceptar(Button buttonAceptar) {
		this.buttonAceptar = buttonAceptar;
	}

	public Button getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(Button buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}

	public Element getVaadinVerticalLayoutDarBajaProducto() {
		return vaadinVerticalLayoutDarBajaProducto;
	}

	public void setVaadinVerticalLayoutDarBajaProducto(Element vaadinVerticalLayoutDarBajaProducto) {
		this.vaadinVerticalLayoutDarBajaProducto = vaadinVerticalLayoutDarBajaProducto;
	}


	public HorizontalLayout getTextNombreProductoEliminarProducto() {
		return textNombreProductoEliminarProducto;
	}

	public void setTextNombreProductoEliminarProducto(HorizontalLayout textNombreProductoEliminarProducto) {
		this.textNombreProductoEliminarProducto = textNombreProductoEliminarProducto;
	}

//	public HorizontalLayout getTextIdProductoEliminarProducto() {
//		return textIdProductoEliminarProducto;
//	}
//
//	public void setTextIdProductoEliminarProducto(HorizontalLayout textIdProductoEliminarProducto) {
//		this.textIdProductoEliminarProducto = textIdProductoEliminarProducto;
//	}
}
