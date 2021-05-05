package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Producto;
import vistas.VistaDarBajaProducto;

public class Dar_baja_producto extends VistaDarBajaProducto {
	public Administrar_productos _administrar_productos;
	public BDPrincipal bd;
	public String nombreProducto;
	// public int idProducto;
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
			e.printStackTrace();
		}
		this.getTextNombreProductoEliminarProducto().add(select);

}

	public void Baja_producto() throws PersistentException {
		bd = new BDPrincipal();
		nombreProducto = select.getValue().getNombre();
		System.out.println("Nombre del producto: " + nombreProducto);
		bd.Baja_producto(nombreProducto);	
	}
	
	public basededatos.Producto[] cargar_producto() throws PersistentException {
		bd = new BDPrincipal();
		return bd.cargar_productos_catalogo();
	}
}