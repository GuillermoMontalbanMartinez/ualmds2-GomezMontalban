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
public class Compra implements Serializable {
	public Compra() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMPRA_TIENE_ITEM) {
			this.tiene_item = (basededatos.Item) owner;
		}
		
		else if (key == ORMConstants.KEY_COMPRA_TIENE_ASOCIADO_UN_CIBERNAUTA_REGISTRADO) {
			this.tiene_asociado_un_cibernauta_registrado = (basededatos.Cibernauta_registrado) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_compra;
	
	private basededatos.Item tiene_item;
	
	private int estado_compra;
	
	private int total_productos;
	
	private String fechaRecepcion;
	
	private String fecha_envio;
	
	private String fecha_compra;
	
	private double precio_compra;
	
	private basededatos.Cibernauta_registrado tiene_asociado_un_cibernauta_registrado;
	
	private void setId_compra(int value) {
		this.id_compra = value;
	}
	
	public int getId_compra() {
		return id_compra;
	}
	
	public int getORMID() {
		return getId_compra();
	}
	
	public void setEstado_compra(int value) {
		this.estado_compra = value;
	}
	
	public int getEstado_compra() {
		return estado_compra;
	}
	
	public void setTotal_productos(int value) {
		this.total_productos = value;
	}
	
	public int getTotal_productos() {
		return total_productos;
	}
	
	public void setFechaRecepcion(String value) {
		this.fechaRecepcion = value;
	}
	
	public String getFechaRecepcion() {
		return fechaRecepcion;
	}
	
	public void setFecha_envio(String value) {
		this.fecha_envio = value;
	}
	
	public String getFecha_envio() {
		return fecha_envio;
	}
	
	public void setFecha_compra(String value) {
		this.fecha_compra = value;
	}
	
	public String getFecha_compra() {
		return fecha_compra;
	}
	
	public void setPrecio_compra(double value) {
		this.precio_compra = value;
	}
	
	public double getPrecio_compra() {
		return precio_compra;
	}
	
	public void setTiene_item(basededatos.Item value) {
		if (this.tiene_item != value) {
			basededatos.Item ltiene_item = this.tiene_item;
			this.tiene_item = value;
			if (value != null) {
				tiene_item.setEsta_asociado_a_una_compra(this);
			}
			if (ltiene_item != null && ltiene_item.getEsta_asociado_a_una_compra() == this) {
				ltiene_item.setEsta_asociado_a_una_compra(null);
			}
		}
	}
	
	public basededatos.Item getTiene_item() {
		return tiene_item;
	}
	
	public void setTiene_asociado_un_cibernauta_registrado(basededatos.Cibernauta_registrado value) {
		if (tiene_asociado_un_cibernauta_registrado != null) {
			tiene_asociado_un_cibernauta_registrado.tiene_compra.remove(this);
		}
		if (value != null) {
			value.tiene_compra.add(this);
		}
	}
	
	public basededatos.Cibernauta_registrado getTiene_asociado_un_cibernauta_registrado() {
		return tiene_asociado_un_cibernauta_registrado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tiene_asociado_un_cibernauta_registrado(basededatos.Cibernauta_registrado value) {
		this.tiene_asociado_un_cibernauta_registrado = value;
	}
	
	private basededatos.Cibernauta_registrado getORM_Tiene_asociado_un_cibernauta_registrado() {
		return tiene_asociado_un_cibernauta_registrado;
	}
	
	public String toString() {
		return String.valueOf(getId_compra());
	}
	
}
