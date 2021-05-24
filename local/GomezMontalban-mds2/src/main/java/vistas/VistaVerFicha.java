package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-ver-ficha template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-ficha")
@JsModule("./src/vista-ver-ficha.js")
public class VistaVerFicha extends PolymerTemplate<VistaVerFicha.VistaVerFichaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("textCliente")
	private TextField textCliente;
	@Id("textNombre")
	private TextField textNombre;
	@Id("textCalle")
	private TextField textCalle;
	@Id("textLocalidad")
	private TextField textLocalidad;
	@Id("textPais")
	private TextField textPais;
	@Id("textPortal")
	private TextField textPortal;
	@Id("textProvincia")
	private TextField textProvincia;
	@Id("textCodigoPostal")
	private TextField textCodigoPostal;

	/**
     * Creates a new VistaVerFicha.
     */
    public VistaVerFicha() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerFicha and vista-ver-ficha
     */
    public interface VistaVerFichaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
