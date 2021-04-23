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

public class CategoriaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_categorias;
	public final IntegerExpression ofertaId;
	public final AssociationExpression oferta;
	public final StringExpression nombre;
	public final CollectionExpression productos;
	
	public CategoriaCriteria(Criteria criteria) {
		super(criteria);
		id_categorias = new IntegerExpression("id_categorias", this);
		ofertaId = new IntegerExpression("oferta.id_ofertas", this);
		oferta = new AssociationExpression("oferta", this);
		nombre = new StringExpression("nombre", this);
		productos = new CollectionExpression("ORM_Productos", this);
	}
	
	public CategoriaCriteria(PersistentSession session) {
		this(session.createCriteria(Categoria.class));
	}
	
	public CategoriaCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public OfertaCriteria createOfertaCriteria() {
		return new OfertaCriteria(createCriteria("oferta"));
	}
	
	public ProductoCriteria createProductosCriteria() {
		return new ProductoCriteria(createCriteria("ORM_Productos"));
	}
	
	public Categoria uniqueCategoria() {
		return (Categoria) super.uniqueResult();
	}
	
	public Categoria[] listCategoria() {
		java.util.List list = super.list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

