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

public class ItemCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_item;
	public final IntegerExpression cantidad;
	public final IntegerExpression esta_asociado_a_una_compraId;
	public final AssociationExpression esta_asociado_a_una_compra;
	public final IntegerExpression esta_asociado_a_un_productoId;
	public final AssociationExpression esta_asociado_a_un_producto;
	
	public ItemCriteria(Criteria criteria) {
		super(criteria);
		id_item = new IntegerExpression("id_item", this);
		cantidad = new IntegerExpression("cantidad", this);
		esta_asociado_a_una_compraId = new IntegerExpression("esta_asociado_a_una_compra.id_item", this);
		esta_asociado_a_una_compra = new AssociationExpression("esta_asociado_a_una_compra", this);
		esta_asociado_a_un_productoId = new IntegerExpression("esta_asociado_a_un_producto.id_item", this);
		esta_asociado_a_un_producto = new AssociationExpression("esta_asociado_a_un_producto", this);
	}
	
	public ItemCriteria(PersistentSession session) {
		this(session.createCriteria(Item.class));
	}
	
	public ItemCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public CompraCriteria createEsta_asociado_a_una_compraCriteria() {
		return new CompraCriteria(createCriteria("esta_asociado_a_una_compra"));
	}
	
	public ProductoCriteria createEsta_asociado_a_un_productoCriteria() {
		return new ProductoCriteria(createCriteria("esta_asociado_a_un_producto"));
	}
	
	public Item uniqueItem() {
		return (Item) super.uniqueResult();
	}
	
	public Item[] listItem() {
		java.util.List list = super.list();
		return (Item[]) list.toArray(new Item[list.size()]);
	}
}

