package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import basededatos.BDPrincipal;
import basededatos.Cibernauta_registrado;
import basededatos.Foto;
import basededatos.Resena;
import vistas.VistaCaracteristicasDelProducto;
import vistas.VistaCaracteristicasDelProductoAdmin;

public class Ver_carácteristicas_del_producto extends VistaCaracteristicasDelProducto {

	private int idUsuario;
	private int idProducto;
	ArrayList<Resena> resenasProducto;

	public Ver_carácteristicas_del_producto(int idProducto) {
		this.idProducto = idProducto;

	}

	public void añadir_al_carrito() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		if(this.idUsuario!=-1)bd._db_item.anadir_al_carrito(this.idProducto, idUsuario);
	}

	public void setUsuario(int idUsuario, int idProducto) {
		this.idUsuario = idUsuario;
		this.idProducto = idProducto;
	}

	public ArrayList<Resena> cargar_resenas() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		resenasProducto = new ArrayList<Resena>();
		for (Resena r : bd.cargar_resenas(idProducto)) {

			resenasProducto.add(r);
		}
		return resenasProducto;
	}
}