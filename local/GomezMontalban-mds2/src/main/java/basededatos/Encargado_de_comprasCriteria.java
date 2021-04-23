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

public class Encargado_de_comprasCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_usuario;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression correo_electronico;
	public final StringExpression telefono;
	public final StringExpression contraseña;
	public final StringExpression fecha_creacion_usuario;
	
	public Encargado_de_comprasCriteria(Criteria criteria) {
		super(criteria);
		id_usuario = new IntegerExpression("id_usuario", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		correo_electronico = new StringExpression("correo_electronico", this);
		telefono = new StringExpression("telefono", this);
		contraseña = new StringExpression("contraseña", this);
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this);
	}
	
	public Encargado_de_comprasCriteria(PersistentSession session) {
		this(session.createCriteria(Encargado_de_compras.class));
	}
	
	public Encargado_de_comprasCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public Encargado_de_compras uniqueEncargado_de_compras() {
		return (Encargado_de_compras) super.uniqueResult();
	}
	
	public Encargado_de_compras[] listEncargado_de_compras() {
		java.util.List list = super.list();
		return (Encargado_de_compras[]) list.toArray(new Encargado_de_compras[list.size()]);
	}
}

