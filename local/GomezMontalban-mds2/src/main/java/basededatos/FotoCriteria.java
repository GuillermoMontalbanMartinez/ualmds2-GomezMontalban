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

public class FotoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_foto;
	public final IntegerExpression esta_asociada_a_un_productoId;
	public final AssociationExpression esta_asociada_a_un_producto;
	public final StringExpression link_foto;
	
	public FotoCriteria(Criteria criteria) {
		super(criteria);
		id_foto = new  IntegerExpression("id_foto", this);
		esta_asociada_a_un_productoId = new IntegerExpression("esta_asociada_a_un_producto.id_producto", this);
		esta_asociada_a_un_producto = new AssociationExpression("esta_asociada_a_un_producto", this);
		link_foto = new StringExpression("link_foto", this);
	}
	
	public FotoCriteria(PersistentSession session) {
		this(session.createCriteria(Foto.class));
	}
	
	public FotoCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createEsta_asociada_a_un_productoCriteria() {
		return new ProductoCriteria(createCriteria("esta_asociada_a_un_producto"));
	}
	
	public Foto uniqueFoto() {
		return (Foto) super.uniqueResult();
	}
	
	public Foto[] listFoto() {
		java.util.List list = super.list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

