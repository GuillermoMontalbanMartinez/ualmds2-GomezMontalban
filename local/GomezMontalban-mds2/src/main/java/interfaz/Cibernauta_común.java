package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaCibernautaComun;

public class Cibernauta_común extends VistaCibernautaComun {
	public Buscar_producto _buscar_producto;
	public Ofertas _ofertas = new Ofertas();
	public Productos_mas_vendidos _productos_mas_vendidos;
	public Ver_publicidad _ver_publicidad;
	public VerticalLayout layoutOfretas;
	public ArrayList<basededatos.Producto> productos_con_oferta = new ArrayList<basededatos.Producto>();
	public ArrayList<Oferta> ofertas = new ArrayList<Oferta>();
	public Cibernauta_común() {
		layoutOfretas = this.getLayoutOfertas().as(VerticalLayout.class);
		try {
			basededatos.Producto [] productos = cargar_ofertas_producto();
			for(basededatos.Producto p : productos) {
				Oferta o = new Oferta();
				o.getImagen().setSrc(p.tiene_fotos.toArray()[0].getLink_foto());
				o.getNombreText().setValue(p.getNombre());
				o.getFechaLimiteText().setValue(p.getTiene_una_oferta().getFecha());
				o.getPrecioNuevoText().setValue(String.valueOf(p.getPrecio()));
				o.getPrecioAnteriorText().setValue(String.valueOf(p.getPrecio() * 100 / (100 - p.getTiene_una_oferta().getPrecio_oferta())));
				productos_con_oferta.add(p);
				layoutOfretas.add(o);
				ofertas.add(o);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public basededatos.Producto[] cargar_ofertas_producto() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_oferta_producto();
	}
}