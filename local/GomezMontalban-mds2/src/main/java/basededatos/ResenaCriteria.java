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

public class ResenaCriteria extends AbstractORMCriteria {
	public final IntegerExpression Id_resena;
	public final IntegerExpression esta_asociados_a_un_productoId;
	public final AssociationExpression esta_asociados_a_un_producto;
	public final StringExpression comentario;
	public final IntegerExpression valoracion;
	public final IntegerExpression esta_asociada_a_un_cibernauta_registradoId;
	public final AssociationExpression esta_asociada_a_un_cibernauta_registrado;
	
	public ResenaCriteria(Criteria criteria) {
		super(criteria);
		Id_resena = new IntegerExpression("Id_resena", this);
		esta_asociados_a_un_productoId = new IntegerExpression("esta_asociados_a_un_producto.id_producto", this);
		esta_asociados_a_un_producto = new AssociationExpression("esta_asociados_a_un_producto", this);
		comentario = new StringExpression("comentario", this);
		valoracion = new IntegerExpression("valoracion", this);
		esta_asociada_a_un_cibernauta_registradoId = new IntegerExpression("esta_asociada_a_un_cibernauta_registrado.", this);
		esta_asociada_a_un_cibernauta_registrado = new AssociationExpression("esta_asociada_a_un_cibernauta_registrado", this);
	}
	
	public ResenaCriteria(PersistentSession session) {
		this(session.createCriteria(Resena.class));
	}
	
	public ResenaCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createEsta_asociados_a_un_productoCriteria() {
		return new ProductoCriteria(createCriteria("esta_asociados_a_un_producto"));
	}
	
	public Cibernauta_registradoCriteria createEsta_asociada_a_un_cibernauta_registradoCriteria() {
		return new Cibernauta_registradoCriteria(createCriteria("esta_asociada_a_un_cibernauta_registrado"));
	}
	
	public Resena uniqueResena() {
		return (Resena) super.uniqueResult();
	}
	
	public Resena[] listResena() {
		java.util.List list = super.list();
		return (Resena[]) list.toArray(new Resena[list.size()]);
	}
}

