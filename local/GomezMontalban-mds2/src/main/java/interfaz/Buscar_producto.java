package interfaz;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Producto;
import basededatos.iCibernauta;
import vistas.VistaBuscarProducto;

public class Buscar_producto extends VistaBuscarProducto {
	public Cibernauta_común _cibernauta_común;
	public Acceder_al_catalogo _acceder_al_catalogo;
	public VerticalLayout layoutListadoProductos;
	
	public Buscar_producto(String string) throws PersistentException {
		super(string);
    	iCibernauta cibernauta = new BDPrincipal();
    	Producto[] productos = null;
    	try {
			 productos = cibernauta.buscarProductos(string);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	layoutListadoProductos = this.getLayoutListadoProductos().as(VerticalLayout.class);
    	for (Producto p : productos) {
			interfaz.Producto produc = new interfaz.Producto(p.getNombre(),p.getDescripción(),String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto(), p.getORMID());
			layoutListadoProductos.add(produc);
		}
	}
	
}