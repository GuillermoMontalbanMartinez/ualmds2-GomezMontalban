package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import basededatos.BDPrincipal;
import basededatos.Cibernauta_registrado;
import vistas.VistaProducto;

public class Producto extends VistaProducto {
	public Oferta _oferta;
	public Productos _productos;
	public Ver_carácteristicas_del_producto _ver_carácteristicas_del_producto;
	public int idUsuario;
	public String nombreP, descripcion, precio, foto;
	public Producto(String nombre, String descripcion, String precio, String foto) {

		this.getTextNombre().setValue(nombre);
		this.getTextDescripcion().setValue(descripcion);
		this.getTextPrecio().setValue(precio);
		this.getIdFoto().setSrc(foto);

		this.nombreP = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.foto = foto;
	}

	public void añadir_al_carrito() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		basededatos.Producto productos[] = basededatos.ProductoDAO.listProductoByQuery(null, null);
		for (basededatos.Producto p : productos) {
			if (p.getNombre().equals(this.nombreP)
					&& p.getDescripción().equals(this.descripcion)
					&& p.getPrecio() == Double.valueOf(this.precio)) {
				
				bd._db_item.anadir_al_carrito(p.getORMID(), idUsuario);

				
			}

		}
	}
	
	public void setUsuario(String nombre) throws PersistentException {
		Cibernauta_registrado cb[] = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null, null);
		for (Cibernauta_registrado cib : cb) {
			if (cib.getNombre().equals(nombre)) {
				idUsuario = cib.getORMID();
			}
		}
	}
}