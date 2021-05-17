package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import vistas.VistaModificarDatosDeCompra;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-modificar-datos-personales template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar-datos-personales")
@JsModule("./src/vista-modificar-datos-personales.js")
public class VistaModificarDatosPersonales extends PolymerTemplate<VistaModificarDatosPersonales.VistaModificarDatosPersonalesModel> {

    @Id("textApellidos")
	private TextField textApellidos;
	@Id("textNombreDeUsuario")
	private TextField textNombreDeUsuario;
	@Id("textCorreo")
	private TextField textCorreo;
	@Id("textPassword")
	private TextField textPassword;
	@Id("textRepeatPassword")
	private TextField textRepeatPassword;
	@Id("textTelefono")
	private TextField textTelefono;
	@Id("textLocalidad")
	private TextField textLocalidad;
	@Id("textPais")
	private TextField textPais;
	@Id("textCalle")
	private TextField textCalle;
	@Id("textProvincia")
	private TextField textProvincia;
	@Id("textPortal")
	private TextField textPortal;
	@Id("textCogidoPostal")
	private TextField textCogidoPostal;
	@Id("buttonCancelar")
	private Button buttonCancelar;
	@Id("textGuardarCambios")
	private Button textGuardarCambios;
	@Id("vistaDatosDePago")
	private VistaModificarDatosDeCompra vistaDatosDePago;
	@Id("uploader")
	private Upload uploader;
	@Id("imagen")
	private Image imagen;

	/**
     * Creates a new VistaModificarDatosPersonales.
     */
    public VistaModificarDatosPersonales() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificarDatosPersonales and vista-modificar-datos-personales
     */
    public interface VistaModificarDatosPersonalesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getTextApellidos() {
		return textApellidos;
	}

	public void setTextApellidos(TextField textApellidos) {
		this.textApellidos = textApellidos;
	}

	public TextField getTextNombreDeUsuario() {
		return textNombreDeUsuario;
	}

	public void setTextNombreDeUsuario(TextField textNombreDeUsuario) {
		this.textNombreDeUsuario = textNombreDeUsuario;
	}

	public TextField getTextCorreo() {
		return textCorreo;
	}

	public void setTextCorreo(TextField textCorreo) {
		this.textCorreo = textCorreo;
	}

	public TextField getTextPassword() {
		return textPassword;
	}

	public void setTextPassword(TextField textPassword) {
		this.textPassword = textPassword;
	}

	public TextField getTextRepeatPassword() {
		return textRepeatPassword;
	}

	public void setTextRepeatPassword(TextField textRepeatPassword) {
		this.textRepeatPassword = textRepeatPassword;
	}

	public TextField getTextTelefono() {
		return textTelefono;
	}

	public void setTextTelefono(TextField textTelefono) {
		this.textTelefono = textTelefono;
	}

	public TextField getTextLocalidad() {
		return textLocalidad;
	}

	public void setTextLocalidad(TextField textLocalidad) {
		this.textLocalidad = textLocalidad;
	}

	public TextField getTextPais() {
		return textPais;
	}

	public void setTextPais(TextField textPais) {
		this.textPais = textPais;
	}

	public TextField getTextCalle() {
		return textCalle;
	}

	public void setTextCalle(TextField textCalle) {
		this.textCalle = textCalle;
	}

	public TextField getTextProvincia() {
		return textProvincia;
	}

	public void setTextProvincia(TextField textProvincia) {
		this.textProvincia = textProvincia;
	}

	public TextField getTextPortal() {
		return textPortal;
	}

	public void setTextPortal(TextField textPortal) {
		this.textPortal = textPortal;
	}

	public TextField getTextCogidoPostal() {
		return textCogidoPostal;
	}

	public void setTextCogidoPostal(TextField textCogidoPostal) {
		this.textCogidoPostal = textCogidoPostal;
	}

	public Button getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(Button buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}

	public Button getTextGuardarCambios() {
		return textGuardarCambios;
	}

	public void setTextGuardarCambios(Button textGuardarCambios) {
		this.textGuardarCambios = textGuardarCambios;
	}

	public VistaModificarDatosDeCompra getVistaDatosDePago() {
		return vistaDatosDePago;
	}

	public void setVistaDatosDePago(VistaModificarDatosDeCompra vistaDatosDePago) {
		this.vistaDatosDePago = vistaDatosDePago;
	}

	public Upload getUploader() {
		return uploader;
	}

	public void setUploader(Upload uploader) {
		this.uploader = uploader;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
}
