package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-eliminar-oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-eliminar-oferta")
@JsModule("./src/vista-eliminar-oferta.js")
public class VistaEliminarOferta extends PolymerTemplate<VistaEliminarOferta.VistaEliminarOfertaModel> {
	@Id("ButtonEliminarOfertaProducto")
	private Button buttonEliminarOfertaProducto;
	@Id("ButtonCancelarOfertaProducto")
	private Button buttonCancelarOfertaProducto;
	@Id("VerticalLayoutEliminarOferta")
	private Element verticalLayoutEliminarOferta;


	/**
     * Creates a new VistaEliminarOferta.
     */
    public VistaEliminarOferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEliminarOferta and vista-eliminar-oferta
     */
    public interface VistaEliminarOfertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }



	public Button getButtonEliminarOfertaProducto() {
		return buttonEliminarOfertaProducto;
	}

	public void setButtonEliminarOfertaProducto(Button buttonEliminarOfertaProducto) {
		this.buttonEliminarOfertaProducto = buttonEliminarOfertaProducto;
	}

	public Button getButtonCancelarOfertaProducto() {
		return buttonCancelarOfertaProducto;
	}

	public void setButtonCancelarOfertaProducto(Button buttonCancelarOfertaProducto) {
		this.buttonCancelarOfertaProducto = buttonCancelarOfertaProducto;
	}

	public Element getVerticalLayoutEliminarOferta() {
		return verticalLayoutEliminarOferta;
	}

	public void setVerticalLayoutEliminarOferta(Element verticalLayoutEliminarOferta) {
		this.verticalLayoutEliminarOferta = verticalLayoutEliminarOferta;
	}
}


