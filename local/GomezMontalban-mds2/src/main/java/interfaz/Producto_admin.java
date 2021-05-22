package interfaz;

import org.orm.PersistentException;

import basededatos.Cibernauta_registrado;
import basededatos.Foto;
import vistas.VistaProductoAdmin;

public class Producto_admin extends VistaProductoAdmin {
	public Productos_admin _productos_admin;
	public Caracteristicas_del_producto_admin _caracteristicas_del_producto_admin  = new Caracteristicas_del_producto_admin();
	public String nombreP, descripcion, precio, foto;
	public int idProducto;
	public Producto_admin(String nombreProducto, String descripcion, String precio, String foto, int id) {

		this.idProducto = id;
		this.getTextNombreProducto().setValue(nombreProducto);
		this.getTextDescripcion().setValue(descripcion);
		this.getTextPrecio().setValue(precio);
		this.getTextImagen().setSrc(foto);

		this.nombreP = nombreProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.foto = foto;
		
		
		try {
			basededatos.Producto producto = basededatos.ProductoDAO.getProductoByORMID(idProducto);
			_caracteristicas_del_producto_admin.getNombreText().setValue(producto.getNombre());
			_caracteristicas_del_producto_admin.getDescripcionText().setValue(producto.getDescripción());
			_caracteristicas_del_producto_admin.getPrecioText().setValue(String.valueOf(producto.getPrecio()));
			int aux = 0;
			for (Foto f : basededatos.FotoDAO.listFotoByQuery(null, null)) {
				if (f.getEsta_asociada_a_un_producto().equals(producto)) {
					switch (aux) {
					case 0:
						_caracteristicas_del_producto_admin.getFoto().setSrc(f.getLink_foto());
						aux++;
						break;

					case 1:
						_caracteristicas_del_producto_admin.getFoto1().setSrc(f.getLink_foto());
						aux++;
						break;
					case 2:
						_caracteristicas_del_producto_admin.getFoto2().setSrc(f.getLink_foto());
						aux++;
						break;
					case 3:
						_caracteristicas_del_producto_admin.getFoto3().setSrc(f.getLink_foto());
						aux++;
						break;
					case 4:
						_caracteristicas_del_producto_admin.getFoto4().setSrc(f.getLink_foto());
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

}