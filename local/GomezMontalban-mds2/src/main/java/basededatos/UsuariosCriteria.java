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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuariosCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_usuario;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression correo_electronico;
	public final StringExpression telefono;
	public final StringExpression contraseña;
	public final StringExpression fecha_creacion_usuario;
	
	public UsuariosCriteria(Criteria criteria) {
		super(criteria);
		id_usuario = new IntegerExpression("id_usuario", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		correo_electronico = new StringExpression("correo_electronico", this);
		telefono = new StringExpression("telefono", this);
		contraseña = new StringExpression("contraseña", this);
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this);
	}
	
	public UsuariosCriteria(PersistentSession session) {
		this(session.createCriteria(Usuarios.class));
	}
	
	public UsuariosCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public Usuarios uniqueUsuarios() {
		return (Usuarios) super.uniqueResult();
	}
	
	public Usuarios[] listUsuarios() {
		java.util.List list = super.list();
		return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
	}
}

