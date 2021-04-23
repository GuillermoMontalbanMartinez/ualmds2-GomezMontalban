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

public class Encargado_de_comprasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_usuario;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression correo_electronico;
	public final StringExpression telefono;
	public final StringExpression contraseña;
	public final StringExpression fecha_creacion_usuario;
	
	public Encargado_de_comprasDetachedCriteria() {
		super(basededatos.Encargado_de_compras.class, basededatos.Encargado_de_comprasCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this.getDetachedCriteria());
	}
	
	public Encargado_de_comprasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Encargado_de_comprasCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this.getDetachedCriteria());
	}
	
	public Encargado_de_compras uniqueEncargado_de_compras(PersistentSession session) {
		return (Encargado_de_compras) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Encargado_de_compras[] listEncargado_de_compras(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Encargado_de_compras[]) list.toArray(new Encargado_de_compras[list.size()]);
	}
}

