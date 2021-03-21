package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-administrar-productos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar-productos")
@JsModule("./src/vista-administrar-productos.js")
public class VistaAdministrarProductos extends PolymerTemplate<VistaAdministrarProductos.VistaAdministrarProductosModel> {

    @Id("vaadinVerticalLayoutAdministrarProductos")
	private Element vaadinVerticalLayout;
	@Id("vaadinButtonAnadirProductos")
	private Button vaadinButton;
	@Id("vaadinButtonEliminarProducto")
	private Button vaadinButtonEliminarProducto;
	@Id("vaadinButtonAnadirProductos")
	private Button vaadinButtonAnadirProductos;
	@Id("vaadinVerticalLayoutAdministrarProductos")
	private Element vaadinVerticalLayoutAdministrarProductos;

	/**
     * Creates a new VistaAdministrarProductos.
     */
    public VistaAdministrarProductos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrarProductos and vista-administrar-productos
     */
    public interface VistaAdministrarProductosModel extends TemplateModel {
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

	public Button getVaadinButtonEliminarProducto() {
		return vaadinButtonEliminarProducto;
	}

	public void setVaadinButtonEliminarProducto(Button vaadinButtonEliminarProducto) {
		this.vaadinButtonEliminarProducto = vaadinButtonEliminarProducto;
	}

	public Button getVaadinButtonAnadirProductos() {
		return vaadinButtonAnadirProductos;
	}

	public void setVaadinButtonAnadirProductos(Button vaadinButtonAnadirProductos) {
		this.vaadinButtonAnadirProductos = vaadinButtonAnadirProductos;
	}

	public Element getVaadinVerticalLayoutAdministrarProductos() {
		return vaadinVerticalLayoutAdministrarProductos;
	}

	public void setVaadinVerticalLayoutAdministrarProductos(Element vaadinVerticalLayoutAdministrarProductos) {
		this.vaadinVerticalLayoutAdministrarProductos = vaadinVerticalLayoutAdministrarProductos;
	}
}
