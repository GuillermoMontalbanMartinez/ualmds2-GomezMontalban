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

public class ProductoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_producto;
	public final IntegerExpression tiene_itemId;
	public final AssociationExpression tiene_item;
	public final IntegerExpression categoriaId;
	public final AssociationExpression categoria;
	public final IntegerExpression tiene_una_ofertaId;
	public final AssociationExpression tiene_una_oferta;
	public final StringExpression nombre;
	public final StringExpression descripción;
	public final DoubleExpression precio;
	public final CollectionExpression tiene_fotos;
	public final CollectionExpression tiene_reseñas;
	
	public ProductoCriteria(Criteria criteria) {
		super(criteria);
		id_producto = new IntegerExpression("id_producto", this);
		tiene_itemId = new IntegerExpression("tiene_item.id_item", this);
		tiene_item = new AssociationExpression("tiene_item", this);
		categoriaId = new IntegerExpression("categoria.id_categorias", this);
		categoria = new AssociationExpression("categoria", this);
		tiene_una_ofertaId = new IntegerExpression("tiene_una_oferta.id_ofertas", this);
		tiene_una_oferta = new AssociationExpression("tiene_una_oferta", this);
		nombre = new StringExpression("nombre", this);
		descripción = new StringExpression("descripción", this);
		precio = new DoubleExpression("precio", this);
		tiene_fotos = new CollectionExpression("ORM_Tiene_fotos", this);
		tiene_reseñas = new CollectionExpression("ORM_Tiene_reseñas", this);
	}
	
	public ProductoCriteria(PersistentSession session) {
		this(session.createCriteria(Producto.class));
	}
	
	public ProductoCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public ItemCriteria createTiene_itemCriteria() {
		return new ItemCriteria(createCriteria("tiene_item"));
	}
	
	public CategoriaCriteria createCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("categoria"));
	}
	
	public OfertaCriteria createTiene_una_ofertaCriteria() {
		return new OfertaCriteria(createCriteria("tiene_una_oferta"));
	}
	
	public FotoCriteria createTiene_fotosCriteria() {
		return new FotoCriteria(createCriteria("ORM_Tiene_fotos"));
	}
	
	public ReseñaCriteria createTiene_reseñasCriteria() {
		return new ReseñaCriteria(createCriteria("ORM_Tiene_reseñas"));
	}
	
	public Producto uniqueProducto() {
		return (Producto) super.uniqueResult();
	}
	
	public Producto[] listProducto() {
		java.util.List list = super.list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

