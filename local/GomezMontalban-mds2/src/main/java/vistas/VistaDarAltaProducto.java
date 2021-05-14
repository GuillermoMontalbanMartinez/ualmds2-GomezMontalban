package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

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
	@Id("textNombre")
	private TextField textNombre;
	@Id("textPrecio")
	private TextField textPrecio;

	@Id("textArea")
	private TextArea textArea;
	@Id("imgPrincipal")
	private Image imgPrincipal;
	@Id("im2")
	private Image im2;
	@Id("img3")
	private Image img3;
	@Id("img4")
	private Image img4;
	@Id("img5")
	private Image img5;
	@Id("uploadPrincipal")
	private Upload uploadPrincipal;
	@Id("upload4")
	private Upload upload4;
	@Id("upload5")
	private Upload upload5;
	@Id("upload2")
	private Upload upload2;
	@Id("upload3")
	private Upload upload3;
	@Id("textCategoria")
	private HorizontalLayout textCategoria;

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

	public TextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(TextField textNombre) {
		this.textNombre = textNombre;
	}

	public TextField getTextPrecio() {
		return textPrecio;
	}

	public void setTextPrecio(TextField textPrecio) {
		this.textPrecio = textPrecio;
	}



	public TextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(TextArea textArea) {
		this.textArea = textArea;
	}

	public Image getImgPrincipal() {
		return imgPrincipal;
	}

	public void setImgPrincipal(Image imgPrincipal) {
		this.imgPrincipal = imgPrincipal;
	}

	public Image getIm2() {
		return im2;
	}

	public void setIm2(Image im2) {
		this.im2 = im2;
	}

	public Image getImg3() {
		return img3;
	}

	public void setImg3(Image img3) {
		this.img3 = img3;
	}

	public Image getImg4() {
		return img4;
	}

	public void setImg4(Image img4) {
		this.img4 = img4;
	}

	public Image getImg5() {
		return img5;
	}

	public void setImg5(Image img5) {
		this.img5 = img5;
	}

	public Upload getUploadPrincipal() {
		return uploadPrincipal;
	}

	public void setUploadPrincipal(Upload uploadPrincipal) {
		this.uploadPrincipal = uploadPrincipal;
	}

	public Upload getUpload4() {
		return upload4;
	}

	public void setUpload4(Upload upload4) {
		this.upload4 = upload4;
	}

	public Upload getUpload5() {
		return upload5;
	}

	public void setUpload5(Upload upload5) {
		this.upload5 = upload5;
	}

	public Upload getUpload2() {
		return upload2;
	}

	public void setUpload2(Upload upload2) {
		this.upload2 = upload2;
	}

	public Upload getUpload3() {
		return upload3;
	}

	public void setUpload3(Upload upload3) {
		this.upload3 = upload3;
	}

	public HorizontalLayout getTextCategoria() {
		return textCategoria;
	}

	public void setTextCategoria(HorizontalLayout textCategoria) {
		this.textCategoria = textCategoria;
	}
}
