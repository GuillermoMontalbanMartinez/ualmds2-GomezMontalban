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

public class Cibernauta_registrado extends basededatos.Usuarios {
	public Cibernauta_registrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CIBERNAUTA_REGISTRADO_REALIZA_RESEÑA) {
			return ORM_realiza_reseña;
		}
		else if (key == ORMConstants.KEY_CIBERNAUTA_REGISTRADO_TIENE_COMPRA) {
			return ORM_tiene_compra;
		}
		else if (key == ORMConstants.KEY_CIBERNAUTA_REGISTRADO_TIENE_CORREOS) {
			return ORM_tiene_correos;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String pais;
	
	private String localidad;
	
	private String calle;
	
	private String portal;
	
	private String provincia;
	
	private int cp;
	
	private String nombre_titular_tarjeta;
	
	private String numero_tarjeta_credito;
	
	private String fecha_caducidad;
	
	private int cvv;
	
	private java.util.Set ORM_realiza_reseña = new java.util.HashSet();
	
	private java.util.Set ORM_tiene_compra = new java.util.HashSet();
	
	private java.util.Set ORM_tiene_correos = new java.util.HashSet();
	
	public void setPais(String value) {
		this.pais = value;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setLocalidad(String value) {
		this.localidad = value;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setCalle(String value) {
		this.calle = value;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setPortal(String value) {
		this.portal = value;
	}
	
	public String getPortal() {
		return portal;
	}
	
	public void setProvincia(String value) {
		this.provincia = value;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setCp(int value) {
		this.cp = value;
	}
	
	public int getCp() {
		return cp;
	}
	
	public void setNombre_titular_tarjeta(String value) {
		this.nombre_titular_tarjeta = value;
	}
	
	public String getNombre_titular_tarjeta() {
		return nombre_titular_tarjeta;
	}
	
	public void setNumero_tarjeta_credito(String value) {
		this.numero_tarjeta_credito = value;
	}
	
	public String getNumero_tarjeta_credito() {
		return numero_tarjeta_credito;
	}
	
	public void setFecha_caducidad(String value) {
		this.fecha_caducidad = value;
	}
	
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	
	public void setCvv(int value) {
		this.cvv = value;
	}
	
	public int getCvv() {
		return cvv;
	}
	
	private void setORM_Realiza_reseña(java.util.Set value) {
		this.ORM_realiza_reseña = value;
	}
	
	private java.util.Set getORM_Realiza_reseña() {
		return ORM_realiza_reseña;
	}
	
	public final basededatos.ReseñaSetCollection realiza_reseña = new basededatos.ReseñaSetCollection(this, _ormAdapter, ORMConstants.KEY_CIBERNAUTA_REGISTRADO_REALIZA_RESEÑA, ORMConstants.KEY_RESEÑA_ESTA_ASOCIADA_A_UN_CIBERNAUTA_REGISTRADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tiene_compra(java.util.Set value) {
		this.ORM_tiene_compra = value;
	}
	
	private java.util.Set getORM_Tiene_compra() {
		return ORM_tiene_compra;
	}
	
	public final basededatos.CompraSetCollection tiene_compra = new basededatos.CompraSetCollection(this, _ormAdapter, ORMConstants.KEY_CIBERNAUTA_REGISTRADO_TIENE_COMPRA, ORMConstants.KEY_COMPRA_TIENE_ASOCIADO_UN_CIBERNAUTA_REGISTRADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tiene_correos(java.util.Set value) {
		this.ORM_tiene_correos = value;
	}
	
	private java.util.Set getORM_Tiene_correos() {
		return ORM_tiene_correos;
	}
	
	public final basededatos.CorreoSetCollection tiene_correos = new basededatos.CorreoSetCollection(this, _ormAdapter, ORMConstants.KEY_CIBERNAUTA_REGISTRADO_TIENE_CORREOS, ORMConstants.KEY_CORREO_PERTENECE_A_UN_CIBERNAUTA_REGISTRADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void confirmar(boolean respuesta) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void confirmar_cambios(boolean respuesta) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String enviar(String destinatario, String asunto, String correo) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
