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

public class CategoriaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_categorias;
	public final IntegerExpression ofertaId;
	public final AssociationExpression oferta;
	public final StringExpression nombre;
	public final CollectionExpression productos;
	
	public CategoriaDetachedCriteria() {
		super(basededatos.Categoria.class, basededatos.CategoriaCriteria.class);
		id_categorias = new IntegerExpression("id_categorias", this.getDetachedCriteria());
		ofertaId = new IntegerExpression("oferta.id_ofertas", this.getDetachedCriteria());
		oferta = new AssociationExpression("oferta", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		productos = new CollectionExpression("ORM_Productos", this.getDetachedCriteria());
	}
	
	public CategoriaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CategoriaCriteria.class);
		id_categorias = new IntegerExpression("id_categorias", this.getDetachedCriteria());
		ofertaId = new IntegerExpression("oferta.id_ofertas", this.getDetachedCriteria());
		oferta = new AssociationExpression("oferta", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		productos = new CollectionExpression("ORM_Productos", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria createOfertaCriteria() {
		return new OfertaDetachedCriteria(createCriteria("oferta"));
	}
	
	public ProductoDetachedCriteria createProductosCriteria() {
		return new ProductoDetachedCriteria(createCriteria("ORM_Productos"));
	}
	
	public Categoria uniqueCategoria(PersistentSession session) {
		return (Categoria) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Categoria[] listCategoria(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

