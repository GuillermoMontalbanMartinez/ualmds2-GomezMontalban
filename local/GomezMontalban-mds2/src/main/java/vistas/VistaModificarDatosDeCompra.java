package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.datepicker.DatePicker;

/**
 * A Designer generated component for the vista-modificar-datos-de-compra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar-datos-de-compra")
@JsModule("./src/vista-modificar-datos-de-compra.js")
public class VistaModificarDatosDeCompra extends PolymerTemplate<VistaModificarDatosDeCompra.VistaModificarDatosDeCompraModel> {

    @Id("textNumeroTarjeta")
	private TextField textNumeroTarjeta;
	@Id("textTitularTarjeta")
	private TextField textTitularTarjeta;
	@Id("textCVVTarjeta")
	private TextField textCVVTarjeta;
	@Id("textFechaCaducidad")
	private DatePicker textFechaCaducidad;

	/**
     * Creates a new VistaModificarDatosDeCompra.
     */
    public VistaModificarDatosDeCompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificarDatosDeCompra and vista-modificar-datos-de-compra
     */
    public interface VistaModificarDatosDeCompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
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

	public TextField getTextCVVTarjeta() {
		return textCVVTarjeta;
	}

	public void setTextCVVTarjeta(TextField textCVVTarjeta) {
		this.textCVVTarjeta = textCVVTarjeta;
	}

	public DatePicker getTextFechaCaducidad() {
		return textFechaCaducidad;
	}

	public void setTextFechaCaducidad(DatePicker textFechaCaducidad) {
		this.textFechaCaducidad = textFechaCaducidad;
	}
}
