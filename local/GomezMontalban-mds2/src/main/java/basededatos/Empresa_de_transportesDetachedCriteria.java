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

public class Empresa_de_transportesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_usuario;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression correo_electronico;
	public final StringExpression telefono;
	public final StringExpression contrasena;
	public final StringExpression fecha_creacion_usuario;
	public final CollectionExpression compra_enviada;
	
	public Empresa_de_transportesDetachedCriteria() {
		super(basededatos.Empresa_de_transportes.class, basededatos.Empresa_de_transportesCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this.getDetachedCriteria());
		compra_enviada = new CollectionExpression("ORM_Compra_enviada", this.getDetachedCriteria());
	}
	
	public Empresa_de_transportesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Empresa_de_transportesCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this.getDetachedCriteria());
		compra_enviada = new CollectionExpression("ORM_Compra_enviada", this.getDetachedCriteria());
	}
	
	public Compra_enviadaDetachedCriteria createCompra_enviadaCriteria() {
		return new Compra_enviadaDetachedCriteria(createCriteria("ORM_Compra_enviada"));
	}
	
	public Empresa_de_transportes uniqueEmpresa_de_transportes(PersistentSession session) {
		return (Empresa_de_transportes) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Empresa_de_transportes[] listEmpresa_de_transportes(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Empresa_de_transportes[]) list.toArray(new Empresa_de_transportes[list.size()]);
	}
}

