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
public class Administrador extends basededatos.Usuarios implements Serializable {
	Administradores ad;
	public Administrador() {
		ad = new Administradores();
	}
	
	public void Alta_cuenta(String nombre, String correo, String contrasena, int tipoDeUsuario, String Apellidos) throws PersistentException {
		ad.Alta_cuenta(nombre, correo, contrasena, tipoDeUsuario, Apellidos);
	}
	
	public void Baja_cuenta(int id_usuario) throws PersistentException {
		ad.Baja_cuenta(getCorreo_electronico(), id_usuario, id_usuario);
	}
	
	public String toString() {
		return super.toString();
	}
	
}
