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
public class Oferta implements Serializable {
	public Oferta() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_OFERTA_ASOCIADA_A_UNA_CATEGORIA) {
			return ORM_asociada_a_una_categoria;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id_ofertas;
	
	private int precio_oferta;
	
	private String fecha;
	
	private basededatos.Producto esta_asociada_a_un_producto;
	
	private java.util.Set ORM_asociada_a_una_categoria = new java.util.HashSet();
	
	private void setId_ofertas(int value) {
		this.id_ofertas = value;
	}
	
	public int getId_ofertas() {
		return id_ofertas;
	}
	
	public int getORMID() {
		return getId_ofertas();
	}
	
	public void setPrecio_oferta(int value) {
		this.precio_oferta = value;
	}
	
	public int getPrecio_oferta() {
		return precio_oferta;
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setEsta_asociada_a_un_producto(basededatos.Producto value) {
		if (this.esta_asociada_a_un_producto != value) {
			basededatos.Producto lesta_asociada_a_un_producto = this.esta_asociada_a_un_producto;
			this.esta_asociada_a_un_producto = value;
			if (value != null) {
				esta_asociada_a_un_producto.setTiene_una_oferta(this);
			}
			if (lesta_asociada_a_un_producto != null && lesta_asociada_a_un_producto.getTiene_una_oferta() == this) {
				lesta_asociada_a_un_producto.setTiene_una_oferta(null);
			}
		}
	}
	
	public basededatos.Producto getEsta_asociada_a_un_producto() {
		return esta_asociada_a_un_producto;
	}
	
	private void setORM_Asociada_a_una_categoria(java.util.Set value) {
		this.ORM_asociada_a_una_categoria = value;
	}
	
	private java.util.Set getORM_Asociada_a_una_categoria() {
		return ORM_asociada_a_una_categoria;
	}
	
	public final basededatos.CategoriaSetCollection asociada_a_una_categoria = new basededatos.CategoriaSetCollection(this, _ormAdapter, ORMConstants.KEY_OFERTA_ASOCIADA_A_UNA_CATEGORIA, ORMConstants.KEY_CATEGORIA_OFERTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_ofertas());
	}
	
}
