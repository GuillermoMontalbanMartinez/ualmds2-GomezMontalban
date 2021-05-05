package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Oferta;
import basededatos.Producto;
import vistas.VistaPublicarOferta;

public class Publicar_oferta extends VistaPublicarOferta {
	public Administrar_ofertas _administrar_ofertas;
	public BDPrincipal bd;
	public double descuento;
	public String fechaLimite;
	Select<Producto> select = new Select<>();
	
	public Publicar_oferta() {

		this.getButtonPublicarOferta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Alta_oferta_producto(0, descuento, fechaLimite);
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		});
		

		select.setItemLabelGenerator(Producto::getNombre);
		try {
			select.setItems(this.cargar_productos());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getTextNombreProductoOferta().add(select);
		
	}

	public void Alta_oferta_producto(int aId_producto, double aDescuento, String aFechaLimite) throws PersistentException {
		bd = new BDPrincipal();
		descuento = Double.parseDouble(this.getTextDescuentoOferta().getValue().toString());
		fechaLimite = this.getTextFechaLimiteOfertaProducto().getValue().toString();
		bd.Alta_oferta_producto(0, descuento, fechaLimite);
	}
	
	public void Alta_oferta_categoria(int aId_categoria, double aDescuento, String aFechaLimite) throws PersistentException {
		throw new UnsupportedOperationException();
	}
	
	public Producto[] cargar_productos() throws PersistentException {
		bd = new BDPrincipal();
		return bd.cargar_productos();
	}

}
