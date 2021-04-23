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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_usuario;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression correo_electronico;
	public final StringExpression telefono;
	public final StringExpression contrasena;
	public final StringExpression fecha_creacion_usuario;
	
	public AdministradorDetachedCriteria() {
		super(basededatos.Administrador.class, basededatos.AdministradorCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AdministradorCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this.getDetachedCriteria());
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

