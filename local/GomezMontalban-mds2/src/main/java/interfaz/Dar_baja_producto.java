package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Producto;
import vistas.VistaDarBajaProducto;

public class Dar_baja_producto extends VistaDarBajaProducto {
	public Administrar_productos _administrar_productos;
	public BDPrincipal bd;
	public String nombreProducto;
	public int idProducto;
	Select<basededatos.Producto> select = new Select();
	
	public Dar_baja_producto() {
		this.getButtonAceptar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Baja_producto();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		select.setItemLabelGenerator(Producto::getNombre);
		try {
			select.setItems(this.cargar_producto());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.getTextIdProductoEliminarProducto().add(select);
		
}

	public void Baja_producto() throws PersistentException {
		bd = new BDPrincipal();
		nombreProducto = this.getTextNombreProductoEliminarProducto().getValue().toString();
		bd.Baja_producto();
	}
	
	public basededatos.Producto[] cargar_producto() throws PersistentException {
		bd = new BDPrincipal();
		return bd.cargar_productos_catalogo();
	}
}