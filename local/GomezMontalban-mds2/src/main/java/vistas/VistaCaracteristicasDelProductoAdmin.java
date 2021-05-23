package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-caracteristicas-del-producto-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-caracteristicas-del-producto-admin")
@JsModule("./src/vista-caracteristicas-del-producto-admin.js")
public class VistaCaracteristicasDelProductoAdmin extends PolymerTemplate<VistaCaracteristicasDelProductoAdmin.VistaCaracteristicasDelProductoAdminModel> {

    @Id("nombreText")
	private TextField nombreText;
	@Id("foto")
	private Image foto;
	@Id("foto1")
	private Image foto1;
	@Id("foto2")
	private Image foto2;
	@Id("foto3")
	private Image foto3;
	@Id("foto4")
	private Image foto4;
	@Id("valoracionText")
	private TextField valoracionText;
	@Id("descripcionText")
	private TextArea descripcionText;
	@Id("precioText")
	private TextField precioText;
	@Id("layoutResenas")
	private Element layoutResenas;
	/**
     * Creates a new VistaCaracteristicasDelProductoAdmin.
     */
    public VistaCaracteristicasDelProductoAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCaracteristicasDelProductoAdmin and vista-caracteristicas-del-producto-admin
     */
    public interface VistaCaracteristicasDelProductoAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getNombreText() {
		return nombreText;
	}

	public void setNombreText(TextField nombreText) {
		this.nombreText = nombreText;
	}

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
	}

	public Image getFoto1() {
		return foto1;
	}

	public void setFoto1(Image foto1) {
		this.foto1 = foto1;
	}

	public Image getFoto2() {
		return foto2;
	}

	public void setFoto2(Image foto2) {
		this.foto2 = foto2;
	}

	public Image getFoto3() {
		return foto3;
	}

	public void setFoto3(Image foto3) {
		this.foto3 = foto3;
	}

	public Image getFoto4() {
		return foto4;
	}

	public void setFoto4(Image foto4) {
		this.foto4 = foto4;
	}

	public TextField getValoracionText() {
		return valoracionText;
	}

	public void setValoracionText(TextField valoracionText) {
		this.valoracionText = valoracionText;
	}

	public TextArea getDescripcionText() {
		return descripcionText;
	}

	public void setDescripcionText(TextArea descripcionText) {
		this.descripcionText = descripcionText;
	}

	public TextField getPrecioText() {
		return precioText;
	}

	public void setPrecioText(TextField precioText) {
		this.precioText = precioText;
	}

	public Element getLayoutResenas() {
		return layoutResenas;
	}

	public void setLayoutResenas(Element layoutResenas) {
		this.layoutResenas = layoutResenas;
	}

	
}
