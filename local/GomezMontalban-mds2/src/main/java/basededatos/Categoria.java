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
public class Categoria implements Serializable {
	public Categoria() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CATEGORIA_PRODUCTOS) {
			return ORM_productos;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CATEGORIA_OFERTA) {
			this.oferta = (basededatos.Oferta) owner;
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
	
	private int id_categorias;
	
	private basededatos.Oferta oferta;
	
	private String nombre;
	
	private java.util.Set ORM_productos = new java.util.HashSet();
	
	private void setId_categorias(int value) {
		this.id_categorias = value;
	}
	
	public int getId_categorias() {
		return id_categorias;
	}
	
	public int getORMID() {
		return getId_categorias();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setOferta(basededatos.Oferta value) {
		if (oferta != null) {
			oferta.asociada_a_una_categoria.remove(this);
		}
		if (value != null) {
			value.asociada_a_una_categoria.add(this);
		}
	}
	
	public basededatos.Oferta getOferta() {
		return oferta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Oferta(basededatos.Oferta value) {
		this.oferta = value;
	}
	
	private basededatos.Oferta getORM_Oferta() {
		return oferta;
	}
	
	private void setORM_Productos(java.util.Set value) {
		this.ORM_productos = value;
	}
	
	private java.util.Set getORM_Productos() {
		return ORM_productos;
	}
	
	public final basededatos.ProductoSetCollection productos = new basededatos.ProductoSetCollection(this, _ormAdapter, ORMConstants.KEY_CATEGORIA_PRODUCTOS, ORMConstants.KEY_PRODUCTO_CATEGORIA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	
	public String toString() {
		return String.valueOf(getId_categorias());
	}
	
}
