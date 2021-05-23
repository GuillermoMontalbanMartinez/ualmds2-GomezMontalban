package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.BDPrincipal;
import basededatos.Producto;
import basededatos.iCibernauta;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-buscar-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar-producto")
@JsModule("./src/vista-buscar-producto.js")
public class VistaBuscarProducto extends PolymerTemplate<VistaBuscarProducto.VistaBuscarProductoModel> {

    @Id("layoutBuscarProducto")
	private HorizontalLayout searchField;
	@Id("layoutListadoProductos")
	private Element layoutListadoProductos;
	/**
     * Creates a new VistaBuscarProducto.
	 * @param string 
	 * @throws PersistentException 
     */
    public VistaBuscarProducto(String string)  {
        // You can initialise any data required for the connected UI components here.

    }

    /**
     * This model binds properties between VistaBuscarProducto and vista-buscar-producto
     */
    public interface VistaBuscarProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getSearchField() {
		return searchField;
	}

	public void setSearchField(HorizontalLayout searchField) {
		this.searchField = searchField;
	}

	public Element getLayoutListadoProductos() {
		return layoutListadoProductos;
	}

	public void setLayoutListadoProductos(Element layoutListadoProductos) {
		this.layoutListadoProductos = layoutListadoProductos;
	}
}
