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
public class Correo implements Serializable {
	public Correo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CORREO_PERTENECE_A_UN_CIBERNAUTA_REGISTRADO) {
			this.pertenece_a_un_cibernauta_registrado = (basededatos.Cibernauta_registrado) owner;
		}
		
		else if (key == ORMConstants.KEY_CORREO_RECEPTOR) {
			this.receptor = (basededatos.Correo) owner;
		}
		
		else if (key == ORMConstants.KEY_CORREO_REMITENTE) {
			this.remitente = (basededatos.Correo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_correo;
	
	private basededatos.Correo receptor;
	
	private String autor;
	
	private String destinatario;
	
	private String asunto;
	
	private String contenido;
	
	private boolean leido;
	
	private basededatos.Cibernauta_registrado pertenece_a_un_cibernauta_registrado;
	
	private basededatos.Correo remitente;
	
	private void setId_correo(int value) {
		this.id_correo = value;
	}
	
	public int getId_correo() {
		return id_correo;
	}
	
	public int getORMID() {
		return getId_correo();
	}
	
	public void setAutor(String value) {
		this.autor = value;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setDestinatario(String value) {
		this.destinatario = value;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setAsunto(String value) {
		this.asunto = value;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public void setContenido(String value) {
		this.contenido = value;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setLeido(boolean value) {
		this.leido = value;
	}
	
	public boolean getLeido() {
		return leido;
	}
	
	public void setPertenece_a_un_cibernauta_registrado(basededatos.Cibernauta_registrado value) {
		if (pertenece_a_un_cibernauta_registrado != null) {
			pertenece_a_un_cibernauta_registrado.tiene_correos.remove(this);
		}
		if (value != null) {
			value.tiene_correos.add(this);
		}
	}
	
	public basededatos.Cibernauta_registrado getPertenece_a_un_cibernauta_registrado() {
		return pertenece_a_un_cibernauta_registrado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a_un_cibernauta_registrado(basededatos.Cibernauta_registrado value) {
		this.pertenece_a_un_cibernauta_registrado = value;
	}
	
	private basededatos.Cibernauta_registrado getORM_Pertenece_a_un_cibernauta_registrado() {
		return pertenece_a_un_cibernauta_registrado;
	}
	
	public void setReceptor(basededatos.Correo value) {
		if (this.receptor != value) {
			basededatos.Correo lreceptor = this.receptor;
			this.receptor = value;
			if (value != null) {
				receptor.setRemitente(this);
			}
			if (lreceptor != null && lreceptor.getRemitente() == this) {
				lreceptor.setRemitente(null);
			}
		}
	}
	
	public basededatos.Correo getReceptor() {
		return receptor;
	}
	
	public void setRemitente(basededatos.Correo value) {
		if (this.remitente != value) {
			basededatos.Correo lremitente = this.remitente;
			this.remitente = value;
			if (value != null) {
				remitente.setReceptor(this);
			}
			if (lremitente != null && lremitente.getReceptor() == this) {
				lremitente.setReceptor(null);
			}
		}
	}
	
	public basededatos.Correo getRemitente() {
		return remitente;
	}
	
	public String toString() {
		return String.valueOf(getId_correo());
	}
	
}
