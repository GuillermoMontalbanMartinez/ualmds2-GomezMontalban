package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-producto-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto-admin")
@JsModule("./src/vista-producto-admin.js")
public class VistaProductoAdmin extends PolymerTemplate<VistaProductoAdmin.VistaProductoAdminModel> {

    @Id("vistaProductoAdmin")
	private Element vistaProductoAdmin;
	@Id("textNombreProducto")
	private TextField textNombreProducto;
	@Id("textPrecio")
	private TextField textPrecio;
	@Id("textDescripcion")
	private TextArea textDescripcion;
	@Id("textImagen")
	private Image textImagen;
	@Id("buttonVerCaracteristicasDelProducto")
	private Button buttonVerCaracteristicasDelProducto;

	/**
     * Creates a new VistaProductoAdmin.
     */
    public VistaProductoAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductoAdmin and vista-producto-admin
     */
    public interface VistaProductoAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVistaProductoAdmin() {
		return vistaProductoAdmin;
	}

	public void setVistaProductoAdmin(Element vistaProductoAdmin) {
		this.vistaProductoAdmin = vistaProductoAdmin;
	}

	public TextField getTextNombreProducto() {
		return textNombreProducto;
	}

	public void setTextNombreProducto(TextField textNombreProducto) {
		this.textNombreProducto = textNombreProducto;
	}

	public TextField getTextPrecio() {
		return textPrecio;
	}

	public void setTextPrecio(TextField textPrecio) {
		this.textPrecio = textPrecio;
	}


	public TextArea getTextDescripcion() {
		return textDescripcion;
	}

	public void setTextDescripcion(TextArea textDescripcion) {
		this.textDescripcion = textDescripcion;
	}

	public Image getTextImagen() {
		return textImagen;
	}

	public void setTextImagen(Image textImagen) {
		this.textImagen = textImagen;
	}

	public Button getButtonVerCaracteristicasDelProducto() {
		return buttonVerCaracteristicasDelProducto;
	}

	public void setButtonVerCaracteristicasDelProducto(Button buttonVerCaracteristicasDelProducto) {
		this.buttonVerCaracteristicasDelProducto = buttonVerCaracteristicasDelProducto;
	}
}
