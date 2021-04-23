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

public class ItemDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_item;
	public final IntegerExpression cantidad;
	public final IntegerExpression esta_asociado_a_una_compraId;
	public final AssociationExpression esta_asociado_a_una_compra;
	public final IntegerExpression esta_asociado_a_un_productoId;
	public final AssociationExpression esta_asociado_a_un_producto;
	
	public ItemDetachedCriteria() {
		super(basededatos.Item.class, basededatos.ItemCriteria.class);
		id_item = new IntegerExpression("id_item", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
		esta_asociado_a_una_compraId = new IntegerExpression("esta_asociado_a_una_compra.id_item", this.getDetachedCriteria());
		esta_asociado_a_una_compra = new AssociationExpression("esta_asociado_a_una_compra", this.getDetachedCriteria());
		esta_asociado_a_un_productoId = new IntegerExpression("esta_asociado_a_un_producto.id_item", this.getDetachedCriteria());
		esta_asociado_a_un_producto = new AssociationExpression("esta_asociado_a_un_producto", this.getDetachedCriteria());
	}
	
	public ItemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ItemCriteria.class);
		id_item = new IntegerExpression("id_item", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
		esta_asociado_a_una_compraId = new IntegerExpression("esta_asociado_a_una_compra.id_item", this.getDetachedCriteria());
		esta_asociado_a_una_compra = new AssociationExpression("esta_asociado_a_una_compra", this.getDetachedCriteria());
		esta_asociado_a_un_productoId = new IntegerExpression("esta_asociado_a_un_producto.id_item", this.getDetachedCriteria());
		esta_asociado_a_un_producto = new AssociationExpression("esta_asociado_a_un_producto", this.getDetachedCriteria());
	}
	
	public CompraDetachedCriteria createEsta_asociado_a_una_compraCriteria() {
		return new CompraDetachedCriteria(createCriteria("esta_asociado_a_una_compra"));
	}
	
	public ProductoDetachedCriteria createEsta_asociado_a_un_productoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("esta_asociado_a_un_producto"));
	}
	
	public Item uniqueItem(PersistentSession session) {
		return (Item) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Item[] listItem(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Item[]) list.toArray(new Item[list.size()]);
	}
}

