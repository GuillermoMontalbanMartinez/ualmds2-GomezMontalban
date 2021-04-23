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

public class OfertaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_ofertas;
	public final IntegerExpression precio_oferta;
	public final StringExpression fecha;
	public final IntegerExpression esta_asociada_a_un_productoId;
	public final AssociationExpression esta_asociada_a_un_producto;
	public final CollectionExpression asociada_a_una_categoria;
	
	public OfertaCriteria(Criteria criteria) {
		super(criteria);
		id_ofertas = new IntegerExpression("id_ofertas", this);
		precio_oferta = new IntegerExpression("precio_oferta", this);
		fecha = new StringExpression("fecha", this);
		esta_asociada_a_un_productoId = new IntegerExpression("esta_asociada_a_un_producto.id_ofertas", this);
		esta_asociada_a_un_producto = new AssociationExpression("esta_asociada_a_un_producto", this);
		asociada_a_una_categoria = new CollectionExpression("ORM_Asociada_a_una_categoria", this);
	}
	
	public OfertaCriteria(PersistentSession session) {
		this(session.createCriteria(Oferta.class));
	}
	
	public OfertaCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createEsta_asociada_a_un_productoCriteria() {
		return new ProductoCriteria(createCriteria("esta_asociada_a_un_producto"));
	}
	
	public CategoriaCriteria createAsociada_a_una_categoriaCriteria() {
		return new CategoriaCriteria(createCriteria("ORM_Asociada_a_una_categoria"));
	}
	
	public Oferta uniqueOferta() {
		return (Oferta) super.uniqueResult();
	}
	
	public Oferta[] listOferta() {
		java.util.List list = super.list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

