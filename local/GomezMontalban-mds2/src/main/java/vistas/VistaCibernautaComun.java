package vistas;
 
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import vistas.VistaProductosMasVendidos;

@Tag("vista-cibernauta-comun")
@JsModule("./src/vista-cibernauta-comun.js")
public class VistaCibernautaComun extends PolymerTemplate<VistaCibernautaComun.VistaCibernautaComunModel> {
 
    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("banner")
	private HorizontalLayout banner;
	@Id("mostrarProductos")
	private Button mostrarProductos;
	@Id("vistaProductosMasVendidos")
	private VistaProductosMasVendidos vistaProductosMasVendidos;
	@Id("layoutOfertas")
	private Element layoutOfertas;
	/**
     * Creates a new VistaCibernautaComun.
     */
    public VistaCibernautaComun() {
        // You can initialise any data required for the connected UI components here.
    }
 
    /**
     * This model binds properties between VistaCibernautaComun and vista-cibernauta-comun
     */
    public interface VistaCibernautaComunModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getBanner() {
		return banner;
	}

	public void setBanner(HorizontalLayout banner) {
		this.banner = banner;
	}

	public Button getMostrarProductos() {
		return mostrarProductos;
	}

	public void setMostrarProductos(Button mostrarProductos) {
		this.mostrarProductos = mostrarProductos;
	}

	public Element getLayoutOfertas() {
		return layoutOfertas;
	}

	public void setLayoutOfertas(Element layoutOfertas) {
		this.layoutOfertas = layoutOfertas;
	}

}
 