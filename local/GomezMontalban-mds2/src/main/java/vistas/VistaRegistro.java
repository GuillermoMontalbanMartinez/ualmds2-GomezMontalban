package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;

/**
 * A Designer generated component for the vista-registro template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registro")
@JsModule("./src/vista-registro.js")
public class VistaRegistro extends PolymerTemplate<VistaRegistro.VistaRegistroModel> {

    @Id("textNombreUsuario")
	private TextField textNombreUsuario;
	@Id("textApellidos")
	private TextField textApellidos;
	@Id("textCorreo")
	private TextField textCorreo;
	@Id("textRepetirPassword")
	private PasswordField textRepetirPassword;
	@Id("textPassword")
	private PasswordField textPassword;
	@Id("textTelefono")
	private TextField textTelefono;
	@Id("textPais")
	private TextField textPais;
	@Id("textLocalidad")
	private TextField textLocalidad;
	@Id("textCalle")
	private TextField textCalle;
	@Id("textPortal")
	private TextField textPortal;
	@Id("textProvincia")
	private TextField textProvincia;
	@Id("textCodigoPostal")
	private TextField textCodigoPostal;
	@Id("textNumeroTarjeta")
	private TextField textNumeroTarjeta;
	@Id("textTitularTarjeta")
	private TextField textTitularTarjeta;
	@Id("textCVVTarjeta")
	private TextField textCVVTarjeta;
	@Id("ButtonRegistro")
	private Button buttonRegistro;
	@Id("ButtonCancelar")
	private Button buttonCancelar;
	@Id("textFechaCaducidad")
	private DatePicker textFechaCaducidad;

	/**
     * Creates a new VistaRegistro.
     */
    public VistaRegistro() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRegistro and vista-registro
     */
    public interface VistaRegistroModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getTextNombreUsuario() {
		return textNombreUsuario;
	}

	public void setTextNombreUsuario(TextField textNombreUsuario) {
		this.textNombreUsuario = textNombreUsuario;
	}

	public TextField getTextApellidos() {
		return textApellidos;
	}

	public void setTextApellidos(TextField textApellidos) {
		this.textApellidos = textApellidos;
	}

	public TextField getTextCorreo() {
		return textCorreo;
	}

	public void setTextCorreo(TextField textCorreo) {
		this.textCorreo = textCorreo;
	}

	public PasswordField getTextRepetirPassword() {
		return textRepetirPassword;
	}

	public void setTextRepetirPassword(PasswordField textRepetirPassword) {
		this.textRepetirPassword = textRepetirPassword;
	}

	public PasswordField getTextPassword() {
		return textPassword;
	}

	public void setTextPassword(PasswordField textPassword) {
		this.textPassword = textPassword;
	}

	public TextField getTextTelefono() {
		return textTelefono;
	}

	public void setTextTelefono(TextField textTelefono) {
		this.textTelefono = textTelefono;
	}

	public TextField getTextPais() {
		return textPais;
	}

	public void setTextPais(TextField textPais) {
		this.textPais = textPais;
	}

	public TextField getTextLocalidad() {
		return textLocalidad;
	}

	public void setTextLocalidad(TextField textLocalidad) {
		this.textLocalidad = textLocalidad;
	}

	public TextField getTextCalle() {
		return textCalle;
	}

	public void setTextCalle(TextField textCalle) {
		this.textCalle = textCalle;
	}

	public TextField getTextPortal() {
		return textPortal;
	}

	public void setTextPortal(TextField textPortal) {
		this.textPortal = textPortal;
	}

	public TextField getTextProvincia() {
		return textProvincia;
	}

	public void setTextProvincia(TextField textProvincia) {
		this.textProvincia = textProvincia;
	}

	public TextField getTextCodigoPostal() {
		return textCodigoPostal;
	}

	public void setTextCodigoPostal(TextField textCodigoPostal) {
		this.textCodigoPostal = textCodigoPostal;
	}

	public TextField getTextNumeroTarjeta() {
		return textNumeroTarjeta;
	}

	public void setTextNumeroTarjeta(TextField textNumeroTarjeta) {
		this.textNumeroTarjeta = textNumeroTarjeta;
	}

	public TextField getTextTitularTarjeta() {
		return textTitularTarjeta;
	}

	public void setTextTitularTarjeta(TextField textTitularTarjeta) {
		this.textTitularTarjeta = textTitularTarjeta;
	}

	public DatePicker getTextFechaCaducidad() {
		return textFechaCaducidad;
	}


	public TextField getTextCVVTarjeta() {
		return textCVVTarjeta;
	}

	public void setTextCVVTarjeta(TextField textCVVTarjeta) {
		this.textCVVTarjeta = textCVVTarjeta;
	}

	public Button getButtonRegistro() {
		return buttonRegistro;
	}

	public void setButtonRegistro(Button buttonRegistro) {
		this.buttonRegistro = buttonRegistro;
	}

	public Button getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(Button buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}

	public void setTextFechaCaducidad(DatePicker textFechaCaducidad) {
		this.textFechaCaducidad = textFechaCaducidad;
	}
}
