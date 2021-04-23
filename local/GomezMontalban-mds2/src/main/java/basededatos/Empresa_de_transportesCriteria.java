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

public class Empresa_de_transportesCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_usuario;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression correo_electronico;
	public final StringExpression telefono;
	public final StringExpression contraseña;
	public final StringExpression fecha_creacion_usuario;
	public final CollectionExpression compra_enviada;
	
	public Empresa_de_transportesCriteria(Criteria criteria) {
		super(criteria);
		id_usuario = new IntegerExpression("id_usuario", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		correo_electronico = new StringExpression("correo_electronico", this);
		telefono = new StringExpression("telefono", this);
		contraseña = new StringExpression("contraseña", this);
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this);
		compra_enviada = new CollectionExpression("ORM_Compra_enviada", this);
	}
	
	public Empresa_de_transportesCriteria(PersistentSession session) {
		this(session.createCriteria(Empresa_de_transportes.class));
	}
	
	public Empresa_de_transportesCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public Compra_enviadaCriteria createCompra_enviadaCriteria() {
		return new Compra_enviadaCriteria(createCriteria("ORM_Compra_enviada"));
	}
	
	public Empresa_de_transportes uniqueEmpresa_de_transportes() {
		return (Empresa_de_transportes) super.uniqueResult();
	}
	
	public Empresa_de_transportes[] listEmpresa_de_transportes() {
		java.util.List list = super.list();
		return (Empresa_de_transportes[]) list.toArray(new Empresa_de_transportes[list.size()]);
	}
}

