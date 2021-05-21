package interfaz;

import basededatos.Cibernauta_registrado;
import vistas.VistaProductoAdmin;

public class Producto_admin extends VistaProductoAdmin {
	public Productos_admin _productos_admin;
	public Caracteristicas_del_producto_admin _caracteristicas_del_producto_admin;
	public String nombreP, descripcion, precio, foto;
	
	public Producto_admin(String nombreProducto, String descripcion, String precio, String foto) {

		this.getTextNombreProducto().setValue(nombreProducto);
		this.getTextDescripcion().setValue(descripcion);
		this.getTextPrecio().setValue(precio);
		this.getTextImagen().setSrc(foto);

		this.nombreP = nombreProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.foto = foto;
	}

//	public void setUsuario(String nombre) {
//		Cibernauta_registrado cb[] = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null, null);
//		for (Cibernauta_registrado cib : cb) {
//			if (cib.getNombre().equals(nombre)) {
//				idUsuario = cib.getORMID();
//			}
//		}
//		
//	}
}