package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-compra-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compra-admin")
@JsModule("./src/vista-compra-admin.js")
public class VistaCompraAdmin extends PolymerTemplate<VistaCompraAdmin.VistaCompraAdminModel> {

    @Id("textIdProducto")
	private TextField textIdProducto;
	@Id("layoutCompraAdmin")
	private Element layoutCompraAdmin;
	@Id("textEstadoCompra")
	private TextField textEstadoCompra;
	@Id("buttonDatosDeEnvio")
	private Button buttonDatosDeEnvio;
	@Id("textIdUsuario")
	private TextField textIdUsuario;

	/**
     * Creates a new VistaCompraAdmin.
     */
    public VistaCompraAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCompraAdmin and vista-compra-admin
     */
    public interface VistaCompraAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getTextIdProducto() {
		return textIdProducto;
	}

	public void setTextIdProducto(TextField textIdProducto) {
		this.textIdProducto = textIdProducto;
	}

	public Element getLayoutCompraAdmin() {
		return layoutCompraAdmin;
	}

	public void setLayoutCompraAdmin(Element layoutCompraAdmin) {
		this.layoutCompraAdmin = layoutCompraAdmin;
	}

	public TextField getTextEstadoCompra() {
		return textEstadoCompra;
	}

	public void setTextEstadoCompra(TextField textEstadoCompra) {
		this.textEstadoCompra = textEstadoCompra;
	}

	public Button getButtonDatosDeEnvio() {
		return buttonDatosDeEnvio;
	}

	public void setButtonDatosDeEnvio(Button buttonDatosDeEnvio) {
		this.buttonDatosDeEnvio = buttonDatosDeEnvio;
	}

	public TextField getTextIdUsuario() {
		return textIdUsuario;
	}

	public void setTextIdUsuario(TextField textIdUsuario) {
		this.textIdUsuario = textIdUsuario;
	}
}
