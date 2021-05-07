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
import com.vaadin.flow.component.datepicker.DatePicker;

/**
 * A Designer generated component for the vista-publicar-oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicar-oferta")
@JsModule("./src/vista-publicar-oferta.js")
public class VistaPublicarOferta extends PolymerTemplate<VistaPublicarOferta.VistaPublicarOfertaModel> {

//    @Id("ButtonCancelarOfertaCategoria")
//	private Button buttonCancelarOfertaCategoria;
//	@Id("ButtonPublicarOfertaCategoria")
//	private Button buttonPublicarOfertaCategoria;
	@Id("ButtonPublicarOferta")
	private Button buttonPublicarOferta;
	@Id("ButtonCancelar")
	private Button buttonCancelar;
	@Id("VerticalLayoutPublicarOfertas")
	private Element verticalLayoutPublicarOfertas;
	@Id("textNombreProductoOferta")
	private HorizontalLayout textNombreProductoOferta;
	@Id("textDescuentoOferta")
	private TextField textDescuentoOferta;

	@Id("textFechaLimiteOfertaProducto")
	private DatePicker textFechaLimiteOfertaProducto;


	/**
     * Creates a new VistaPublicarOferta.
     */
    public VistaPublicarOferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPublicarOferta and vista-publicar-oferta
     */
    public interface VistaPublicarOfertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }



	public Button getButtonPublicarOferta() {
		return buttonPublicarOferta;
	}

	public void setButtonPublicarOferta(Button buttonPublicarOferta) {
		this.buttonPublicarOferta = buttonPublicarOferta;
	}

	public Button getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(Button buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}

	public Element getVerticalLayoutPublicarOfertas() {
		return verticalLayoutPublicarOfertas;
	}

	public void setVerticalLayoutPublicarOfertas(Element verticalLayoutPublicarOfertas) {
		this.verticalLayoutPublicarOfertas = verticalLayoutPublicarOfertas;
	}

	public HorizontalLayout getTextNombreProductoOferta() {
		return textNombreProductoOferta;
	}

	public void setTextNombreProductoOferta(HorizontalLayout textNombreProductoOferta) {
		this.textNombreProductoOferta = textNombreProductoOferta;
	}

	public TextField getTextDescuentoOferta() {
		return textDescuentoOferta;
	}

	public void setTextDescuentoOferta(TextField textDescuentoOferta) {
		this.textDescuentoOferta = textDescuentoOferta;
	}


	public DatePicker getTextFechaLimiteOfertaProducto() {
		return textFechaLimiteOfertaProducto;
	}

	public void setTextFechaLimiteOfertaProducto(DatePicker textFechaLimiteOfertaProducto) {
		this.textFechaLimiteOfertaProducto = textFechaLimiteOfertaProducto;
	}

}
