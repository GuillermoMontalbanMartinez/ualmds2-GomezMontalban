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
public class Usuarios implements Serializable {
	public Usuarios() {
	}
	
	private int id_usuario;
	
	private String nombre;
	
	private String apellidos;
	
	private String correo_electronico;
	
	private String telefono;
	
	private String contrasena;
	
	private String fecha_creacion_usuario;
	
	private void setId_usuario(int value) {
		this.id_usuario = value;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}
	
	public int getORMID() {
		return getId_usuario();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setCorreo_electronico(String value) {
		this.correo_electronico = value;
	}
	
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	
	public void setTelefono(String aTelefono) {
		this.telefono = aTelefono;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setFecha_creacion_usuario(String value) {
		this.fecha_creacion_usuario = value;
	}
	
	public String getFecha_creacion_usuario() {
		return fecha_creacion_usuario;
	}
	
	public String toString() {
		return String.valueOf(getId_usuario());
	}
	
}
