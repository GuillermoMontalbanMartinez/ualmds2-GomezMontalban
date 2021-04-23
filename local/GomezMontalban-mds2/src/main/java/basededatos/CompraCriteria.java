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

public class CompraCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_compra;
	public final IntegerExpression tiene_itemId;
	public final AssociationExpression tiene_item;
	public final IntegerExpression estado_compra;
	public final IntegerExpression total_productos;
	public final StringExpression fechaRecepcion;
	public final StringExpression fecha_envio;
	public final StringExpression fecha_compra;
	public final DoubleExpression precio_compra;
	public final IntegerExpression tiene_asociado_un_cibernauta_registradoId;
	public final AssociationExpression tiene_asociado_un_cibernauta_registrado;
	
	public CompraCriteria(Criteria criteria) {
		super(criteria);
		id_compra = new IntegerExpression("id_compra", this);
		tiene_itemId = new IntegerExpression("tiene_item.id_item", this);
		tiene_item = new AssociationExpression("tiene_item", this);
		estado_compra = new IntegerExpression("estado_compra", this);
		total_productos = new IntegerExpression("total_productos", this);
		fechaRecepcion = new StringExpression("fechaRecepcion", this);
		fecha_envio = new StringExpression("fecha_envio", this);
		fecha_compra = new StringExpression("fecha_compra", this);
		precio_compra = new DoubleExpression("precio_compra", this);
		tiene_asociado_un_cibernauta_registradoId = new IntegerExpression("tiene_asociado_un_cibernauta_registrado.", this);
		tiene_asociado_un_cibernauta_registrado = new AssociationExpression("tiene_asociado_un_cibernauta_registrado", this);
	}
	
	public CompraCriteria(PersistentSession session) {
		this(session.createCriteria(Compra.class));
	}
	
	public CompraCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public ItemCriteria createTiene_itemCriteria() {
		return new ItemCriteria(createCriteria("tiene_item"));
	}
	
	public Cibernauta_registradoCriteria createTiene_asociado_un_cibernauta_registradoCriteria() {
		return new Cibernauta_registradoCriteria(createCriteria("tiene_asociado_un_cibernauta_registrado"));
	}
	
	public Compra uniqueCompra() {
		return (Compra) super.uniqueResult();
	}
	
	public Compra[] listCompra() {
		java.util.List list = super.list();
		return (Compra[]) list.toArray(new Compra[list.size()]);
	}
}

