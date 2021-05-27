package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import basededatos.Resena;
import vistas.VistaCaracteristicasDelProductoAdmin;

public class Caracteristicas_del_producto_admin extends VistaCaracteristicasDelProductoAdmin {

	public Producto_admin _producto_admin;
	public Reseñas reseña;
	private int idProducto;
	ArrayList<Resena> resenasProducto;
	public Caracteristicas_del_producto_admin(int id) {
		this.idProducto=id;
		
	}
	
	public  ArrayList<Resena> cargar_resenas() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		resenasProducto = new ArrayList<Resena>();
		for(Resena r : bd.cargar_resenas(idProducto)) {
			
			resenasProducto.add(r);
		}
		return resenasProducto;
	}
	
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
}