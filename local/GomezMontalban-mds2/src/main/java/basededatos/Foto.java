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
public class Foto implements Serializable {
	public Foto() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Foto))
			return false;
		Foto foto = (Foto)aObj;
		if (getId_foto() != foto.getId_foto())
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId_foto();
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FOTO_ESTA_ASOCIADA_A_UN_PRODUCTO) {
			this.esta_asociada_a_un_producto = (basededatos.Producto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_foto;
	
	private basededatos.Producto esta_asociada_a_un_producto;
	
	private String link_foto;
	
	public void setId_foto(int value) {
		this.id_foto = value;
	}
	
	public int getId_foto() {
		return id_foto;
	}
	
	public int getORMID() {
		return getId_foto();
	}
	
	public void setLink_foto(String value) {
		this.link_foto = value;
	}
	
	public String getLink_foto() {
		return link_foto;
	}
	
	public void setEsta_asociada_a_un_producto(basededatos.Producto value) {
		if (esta_asociada_a_un_producto != null) {
			esta_asociada_a_un_producto.tiene_fotos.remove(this);
		}
		if (value != null) {
			value.tiene_fotos.add(this);
		}
	}
	
	public basededatos.Producto getEsta_asociada_a_un_producto() {
		return esta_asociada_a_un_producto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Esta_asociada_a_un_producto(basededatos.Producto value) {
		this.esta_asociada_a_un_producto = value;
	}
	
	private basededatos.Producto getORM_Esta_asociada_a_un_producto() {
		return esta_asociada_a_un_producto;
	}
	
	public String toString() {
		return String.valueOf(getId_foto());
	}
	
}
