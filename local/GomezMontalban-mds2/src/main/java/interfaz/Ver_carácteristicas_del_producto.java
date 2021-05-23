package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import basededatos.BDPrincipal;
import basededatos.Cibernauta_registrado;
import basededatos.Foto;
import vistas.VistaCaracteristicasDelProducto;
import vistas.VistaCaracteristicasDelProductoAdmin;

public class Ver_carácteristicas_del_producto extends VistaCaracteristicasDelProducto {



	private int idUsuario;
	private int idProducto;
	
	public Ver_carácteristicas_del_producto() {
		this.getAnadirAlCarrito().addClickListener(new ComponentEventListener() {
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
		bd._db_item.anadir_al_carrito(this.idProducto, idUsuario);
	}
	
	public void setUsuario(int idUsuario, int idProducto) {
		this.idUsuario = idUsuario;
		this.idProducto = idProducto;
	}
}