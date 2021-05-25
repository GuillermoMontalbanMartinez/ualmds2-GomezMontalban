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
public class Resena implements Serializable {
	public Resena() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_RESENA_ESTA_ASOCIADOS_A_UN_PRODUCTO) {
			this.esta_asociados_a_un_producto = (basededatos.Producto) owner;
		}
		
		else if (key == ORMConstants.KEY_RESENA_ESTA_ASOCIADA_A_UN_CIBERNAUTA_REGISTRADO) {
			this.esta_asociada_a_un_cibernauta_registrado = (basededatos.Cibernauta_registrado) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int Id_resena;
	
	private basededatos.Producto esta_asociados_a_un_producto;
	
	private String comentario;
	
	private int valoracion;
	
	private basededatos.Cibernauta_registrado esta_asociada_a_un_cibernauta_registrado;
	
	private void setId_resena(int value) {
		this.Id_resena = value;
	}
	
	public int getId_resena() {
		return Id_resena;
	}
	
	public int getORMID() {
		return getId_resena();
	}
	
	public void setComentario(String value) {
		this.comentario = value;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setValoracion(int value) {
		this.valoracion = value;
	}
	
	public int getValoracion() {
		return valoracion;
	}
	
	public void setEsta_asociados_a_un_producto(basededatos.Producto value) {
		if (esta_asociados_a_un_producto != null) {
			esta_asociados_a_un_producto.tiene_resenas.remove(this);
		}
		if (value != null) {
			value.tiene_resenas.add(this);
		}
	}
	
	public basededatos.Producto getEsta_asociados_a_un_producto() {
		return esta_asociados_a_un_producto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Esta_asociados_a_un_producto(basededatos.Producto value) {
		this.esta_asociados_a_un_producto = value;
	}
	
	private basededatos.Producto getORM_Esta_asociados_a_un_producto() {
		return esta_asociados_a_un_producto;
	}
	
	public void setEsta_asociada_a_un_cibernauta_registrado(basededatos.Cibernauta_registrado value) {
		if (esta_asociada_a_un_cibernauta_registrado != null) {
			esta_asociada_a_un_cibernauta_registrado.realiza_resena.remove(this);
		}
		if (value != null) {
			value.realiza_resena.add(this);
		}
	}
	
	public basededatos.Cibernauta_registrado getEsta_asociada_a_un_cibernauta_registrado() {
		return esta_asociada_a_un_cibernauta_registrado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Esta_asociada_a_un_cibernauta_registrado(basededatos.Cibernauta_registrado value) {
		this.esta_asociada_a_un_cibernauta_registrado = value;
	}
	
	private basededatos.Cibernauta_registrado getORM_Esta_asociada_a_un_cibernauta_registrado() {
		return esta_asociada_a_un_cibernauta_registrado;
	}
	
	
	public String toString() {
		return String.valueOf(getId_resena());
	}
	
}
