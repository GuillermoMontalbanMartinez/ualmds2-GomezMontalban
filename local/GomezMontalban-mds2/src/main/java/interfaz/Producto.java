package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Cibernauta_registrado;
import basededatos.Foto;
import basededatos.Resena;
import vistas.VistaProducto;

public class Producto extends VistaProducto {
	public Oferta _oferta;
	public Productos _productos;
	public Ver_carácteristicas_del_producto _ver_carácteristicas_del_producto = new Ver_carácteristicas_del_producto();
	public Iniciar_sesion i = new Iniciar_sesion();
	public int idUsuario;
	public int idProducto;
	public String nombreP, descripcion, precio, foto;
	VerticalLayout reseñas = _ver_carácteristicas_del_producto.getLayoutResenas().as(VerticalLayout.class);
	double reseñaMedia=0;
	

	public Producto(String nombre, String descripcion, String precio, String foto, int id) {

	
		this.idProducto = id;
		this.getTextNombre().setValue(nombre);
		this.getTextDescripcion().setValue(descripcion);
		this.getTextPrecio().setValue(precio);
		this.getIdFoto().setSrc(foto);

		this.nombreP = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.foto = foto;

		try {
			basededatos.Producto producto = basededatos.ProductoDAO.getProductoByORMID(idProducto);
			_ver_carácteristicas_del_producto.getNombreText().setValue(producto.getNombre());
			_ver_carácteristicas_del_producto.getDescripcionText().setValue(producto.getDescripción());
			_ver_carácteristicas_del_producto.getVaadinTextField().setValue(String.valueOf(producto.getPrecio()));
			int aux = 0;
			for (Foto f : basededatos.FotoDAO.listFotoByQuery(null, null)) {
				if (f.getEsta_asociada_a_un_producto().equals(producto)) {
					switch (aux%5) {
					case 0:
						_ver_carácteristicas_del_producto.getFoto().setSrc(f.getLink_foto());
						aux++;
						break;

					case 1:
						_ver_carácteristicas_del_producto.getFoto1().setSrc(f.getLink_foto());
						aux++;
						break;
					case 2:
						_ver_carácteristicas_del_producto.getFoto2().setSrc(f.getLink_foto());
						aux++;
						break;
					case 3:
						_ver_carácteristicas_del_producto.getFoto3().setSrc(f.getLink_foto());
						aux++;
						break;
					case 4:
						_ver_carácteristicas_del_producto.getFoto4().setSrc(f.getLink_foto());
						break;
					default:
						break;
					}

				}
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void añadir_al_carrito() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		System.out.println(this.idProducto + " " + idUsuario);
		bd._db_item.anadir_al_carrito(this.idProducto, idUsuario);
	}

	public void setUsuario(String nombre) throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		Cibernauta_registrado cb[] = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null, null);
		for (Cibernauta_registrado cib : cb) {
			if (cib.getNombre().equals(nombre)) {
				idUsuario = cib.getORMID();
			}
		}
		_ver_carácteristicas_del_producto.setUsuario(idUsuario, idProducto);
		ArrayList<Resena> cargar_resenas = _ver_carácteristicas_del_producto.cargar_resenas();
		for(Resena r : cargar_resenas ) {
			interfaz.Reseña resena = new interfaz.Reseña(r.getEsta_asociada_a_un_cibernauta_registrado().getNombre(), r.getValoracion(), r.getComentario());
			reseñas.add(resena);
			reseñaMedia+=r.getValoracion();
		}
		reseñaMedia/= cargar_resenas.size();
		_ver_carácteristicas_del_producto.getValoracionText().setValue(String.valueOf(reseñaMedia));
	}

	public int getIdProducto() {
		return this.idProducto;
	}
}