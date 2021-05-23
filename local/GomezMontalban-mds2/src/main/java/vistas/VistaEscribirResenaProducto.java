package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-escribir-resena-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-escribir-resena-producto")
@JsModule("./src/vista-escribir-resena-producto.js")
public class VistaEscribirResenaProducto extends PolymerTemplate<VistaEscribirResenaProducto.VistaEscribirResenaProductoModel> {

    @Id("selectLayout")
	private HorizontalLayout selectLayout;
	@Id("cuerpoText")
	private TextArea cuerpoText;
	@Id("cancelarButton")
	private Button cancelarButton;
	@Id("publicarButton")
	private Button publicarButton;

	/**
     * Creates a new VistaEscribirResenaProducto.
     */
    public VistaEscribirResenaProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEscribirResenaProducto and vista-escribir-resena-producto
     */
    public interface VistaEscribirResenaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getSelectLayout() {
		return selectLayout;
	}

	public void setSelectLayout(HorizontalLayout selectLayout) {
		this.selectLayout = selectLayout;
	}

	public TextArea getCuerpoText() {
		return cuerpoText;
	}

	public void setCuerpoText(TextArea cuerpoText) {
		this.cuerpoText = cuerpoText;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

	public void setCancelarButton(Button cancelarButton) {
		this.cancelarButton = cancelarButton;
	}

	public Button getPublicarButton() {
		return publicarButton;
	}

	public void setPublicarButton(Button publicarButton) {
		this.publicarButton = publicarButton;
	}
}
