package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import basededatos.BDPrincipal;
import vistas.VistaProducto;

public class Producto extends VistaProducto {
	public Oferta _oferta;
	public Productos _productos;
	public Ver_carácteristicas_del_producto _ver_carácteristicas_del_producto;

	public Producto(String nombre, String descripcion, String precio, String foto) {

		this.getTextNombre().setValue(nombre);
		this.getTextDescripcion().setValue(descripcion);
		this.getTextPrecio().setValue(precio);
		this.getIdFoto().setSrc(foto);

		this.getButtonAgregarCarrito().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					añadir_al_carrito();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public void añadir_al_carrito() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		basededatos.Producto productos[] = basededatos.ProductoDAO.listProductoByQuery(null, null);
		basededatos.Producto producto;
		for (basededatos.Producto p : productos) {
			if (p.getNombre().equals(this.getTextNombre().getValue().toString())
					&& p.getDescripción().equals(this.getTextDescripcion().getValue().toString())
					&& p.getPrecio() == Double.valueOf(this.getTextPrecio().getValue())) {
				bd._db_item.anadir_al_carrito(p.getORMID());
			}

		}
	}
}