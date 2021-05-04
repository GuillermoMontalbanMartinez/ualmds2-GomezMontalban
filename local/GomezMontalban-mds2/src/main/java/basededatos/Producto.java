/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: David(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.io.Serializable;

import org.orm.PersistentException;
public class Producto implements Serializable {
	Productos producto;
	
	public Producto() {
		producto = new Productos();
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PRODUCTO_TIENE_FOTOS) {
			return ORM_tiene_fotos;
		}
		else if (key == ORMConstants.KEY_PRODUCTO_TIENE_RESENAS) {
			return ORM_tiene_resenas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PRODUCTO_TIENE_UNA_OFERTA) {
			this.tiene_una_oferta = (basededatos.Oferta) owner;
		}
		
		else if (key == ORMConstants.KEY_PRODUCTO_CATEGORIA) {
			this.categoria = (basededatos.Categoria) owner;
		}
		
		else if (key == ORMConstants.KEY_PRODUCTO_TIENE_ITEM) {
			this.tiene_item = (basededatos.Item) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_producto;
	
	private basededatos.Item tiene_item;
	
	private basededatos.Categoria categoria;
	
	private basededatos.Oferta tiene_una_oferta;
	
	private String nombre;
	
	private String descripción;
	
	private double precio;
	
	private java.util.Set ORM_tiene_fotos = new java.util.HashSet();
	
	private java.util.Set ORM_tiene_resenas = new java.util.HashSet();
	
	private void setId_producto(int value) {
		this.id_producto = value;
	}
	
	public int getId_producto() {
		return id_producto;
	}
	
	public int getORMID() {
		return getId_producto();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDescripción(String value) {
		this.descripción = value;
	}
	
	public String getDescripción() {
		return descripción;
	}
	
	public void setPrecio(double value) {
		this.precio = value;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setTiene_una_oferta(basededatos.Oferta value) {
		if (this.tiene_una_oferta != value) {
			basededatos.Oferta ltiene_una_oferta = this.tiene_una_oferta;
			this.tiene_una_oferta = value;
			if (value != null) {
				tiene_una_oferta.setEsta_asociada_a_un_producto(this);
			}
			if (ltiene_una_oferta != null && ltiene_una_oferta.getEsta_asociada_a_un_producto() == this) {
				ltiene_una_oferta.setEsta_asociada_a_un_producto(null);
			}
		}
	}
	
	public basededatos.Oferta getTiene_una_oferta() {
		return tiene_una_oferta;
	}
	
	public void setCategoria(basededatos.Categoria value) {
		if (categoria != null) {
			categoria.productos.remove(this);
		}
		if (value != null) {
			value.productos.add(this);
		}
	}
	
	public basededatos.Categoria getCategoria() {
		return categoria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Categoria(basededatos.Categoria value) {
		this.categoria = value;
	}
	
	private basededatos.Categoria getORM_Categoria() {
		return categoria;
	}
	
	public void setTiene_item(basededatos.Item value) {
		if (this.tiene_item != value) {
			basededatos.Item ltiene_item = this.tiene_item;
			this.tiene_item = value;
			if (value != null) {
				tiene_item.setEsta_asociado_a_un_producto(this);
			}
			if (ltiene_item != null && ltiene_item.getEsta_asociado_a_un_producto() == this) {
				ltiene_item.setEsta_asociado_a_un_producto(null);
			}
		}
	}
	
	public basededatos.Item getTiene_item() {
		return tiene_item;
	}
	
	private void setORM_Tiene_fotos(java.util.Set value) {
		this.ORM_tiene_fotos = value;
	}
	
	private java.util.Set getORM_Tiene_fotos() {
		return ORM_tiene_fotos;
	}
	
	public final basededatos.FotoSetCollection tiene_fotos = new basededatos.FotoSetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCTO_TIENE_FOTOS, ORMConstants.KEY_FOTO_ESTA_ASOCIADA_A_UN_PRODUCTO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tiene_resenas(java.util.Set value) {
		this.ORM_tiene_resenas = value;
	}
	
	private java.util.Set getORM_Tiene_resenas() {
		return ORM_tiene_resenas;
	}
	
	public final basededatos.ResenaSetCollection tiene_resenas = new basededatos.ResenaSetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCTO_TIENE_RESENAS, ORMConstants.KEY_RESENA_ESTA_ASOCIADOS_A_UN_PRODUCTO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void Alta_producto(String nombre, String descripcion, double precio, int id_producto, String foto1, String foto2, String foto3, String foto4, String foto5) throws PersistentException {
		producto.Alta_producto(nombre, descripcion, precio, id_producto, foto1, foto2, foto3, foto4, foto5);
	}
	
	public String toString() {
		return String.valueOf(getId_producto());
	}
	
}
