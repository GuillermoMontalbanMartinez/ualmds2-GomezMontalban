package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import vistas.VistaProductosAdmin;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * A Designer generated component for the vista-acceder-al-catalogo-admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-acceder-al-catalogo-admin")
@JsModule("./src/vista-acceder-al-catalogo-admin.js")
public class VistaAccederAlCatalogoAdmin extends PolymerTemplate<VistaAccederAlCatalogoAdmin.VistaAccederAlCatalogoAdminModel> {

    @Id("layoutCatalogoAdmin")
	private Element layoutCatalogoAdmin;
	@Id("layoutProductosCatalogoAdmin")
	private VerticalLayout layoutProductosCatalogoAdmin;

	@Id("layoutSelect")
	private HorizontalLayout layoutSelect;

	/**
     * Creates a new VistaAccederAlCatalogoAdmin.
     */
    public VistaAccederAlCatalogoAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAccederAlCatalogoAdmin and vista-acceder-al-catalogo-admin
     */
    public interface VistaAccederAlCatalogoAdminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getLayoutCatalogoAdmin() {
		return layoutCatalogoAdmin;
	}

	public void setLayoutCatalogoAdmin(Element layoutCatalogoAdmin) {
		this.layoutCatalogoAdmin = layoutCatalogoAdmin;
	}


	public VerticalLayout getLayoutProductosCatalogoAdmin() {
		return layoutProductosCatalogoAdmin;
	}

	public void setLayoutProductosCatalogoAdmin(VerticalLayout layoutProductosCatalogoAdmin) {
		this.layoutProductosCatalogoAdmin = layoutProductosCatalogoAdmin;
	}



	public HorizontalLayout getLayoutSelect() {
		return layoutSelect;
	}

	public void setLayoutSelect(HorizontalLayout layoutSelect) {
		this.layoutSelect = layoutSelect;
	}
}
