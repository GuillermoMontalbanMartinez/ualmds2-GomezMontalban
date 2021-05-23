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
 * A Designer generated component for the vista-escribir-reseña template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-escribir-reseña")
@JsModule("./src/vista-escribir-reseña.js")
public class VistaEscribirReseña extends PolymerTemplate<VistaEscribirReseña.VistaEscribirReseñaModel> {

    @Id("selectLayout")
	private HorizontalLayout selectLayout;
	@Id("cuerpoText")
	private TextArea cuerpoText;
	@Id("publicarButton")
	private Button publicarButton;
	@Id("cancelarButton")
	private Button cancelarButton;

	/**
     * Creates a new VistaEscribirReseña.
     */
    public VistaEscribirReseña() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEscribirReseña and vista-escribir-reseña
     */
    public interface VistaEscribirReseñaModel extends TemplateModel {
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

	public Button getPublicarButton() {
		return publicarButton;
	}

	public void setPublicarButton(Button publicarButton) {
		this.publicarButton = publicarButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

	public void setCancelarButton(Button cancelarButton) {
		this.cancelarButton = cancelarButton;
	}
}
