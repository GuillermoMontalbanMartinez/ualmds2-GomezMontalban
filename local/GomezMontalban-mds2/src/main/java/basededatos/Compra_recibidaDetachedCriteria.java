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

public class Compra_recibidaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Compra_recibidaDetachedCriteria() {
		super(basededatos.Compra_recibida.class, basededatos.Compra_recibidaCriteria.class);
		id_compra = new IntegerExpression("id_compra", this.getDetachedCriteria());
		tiene_itemId = new IntegerExpression("tiene_item.id_item", this.getDetachedCriteria());
		tiene_item = new AssociationExpression("tiene_item", this.getDetachedCriteria());
		estado_compra = new IntegerExpression("estado_compra", this.getDetachedCriteria());
		total_productos = new IntegerExpression("total_productos", this.getDetachedCriteria());
		fechaRecepcion = new StringExpression("fechaRecepcion", this.getDetachedCriteria());
		fecha_envio = new StringExpression("fecha_envio", this.getDetachedCriteria());
		fecha_compra = new StringExpression("fecha_compra", this.getDetachedCriteria());
		precio_compra = new DoubleExpression("precio_compra", this.getDetachedCriteria());
		tiene_asociado_un_cibernauta_registradoId = new IntegerExpression("tiene_asociado_un_cibernauta_registrado.", this.getDetachedCriteria());
		tiene_asociado_un_cibernauta_registrado = new AssociationExpression("tiene_asociado_un_cibernauta_registrado", this.getDetachedCriteria());
	}
	
	public Compra_recibidaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Compra_recibidaCriteria.class);
		id_compra = new IntegerExpression("id_compra", this.getDetachedCriteria());
		tiene_itemId = new IntegerExpression("tiene_item.id_item", this.getDetachedCriteria());
		tiene_item = new AssociationExpression("tiene_item", this.getDetachedCriteria());
		estado_compra = new IntegerExpression("estado_compra", this.getDetachedCriteria());
		total_productos = new IntegerExpression("total_productos", this.getDetachedCriteria());
		fechaRecepcion = new StringExpression("fechaRecepcion", this.getDetachedCriteria());
		fecha_envio = new StringExpression("fecha_envio", this.getDetachedCriteria());
		fecha_compra = new StringExpression("fecha_compra", this.getDetachedCriteria());
		precio_compra = new DoubleExpression("precio_compra", this.getDetachedCriteria());
		tiene_asociado_un_cibernauta_registradoId = new IntegerExpression("tiene_asociado_un_cibernauta_registrado.", this.getDetachedCriteria());
		tiene_asociado_un_cibernauta_registrado = new AssociationExpression("tiene_asociado_un_cibernauta_registrado", this.getDetachedCriteria());
	}
	
	public ItemDetachedCriteria createTiene_itemCriteria() {
		return new ItemDetachedCriteria(createCriteria("tiene_item"));
	}
	
	public Cibernauta_registradoDetachedCriteria createTiene_asociado_un_cibernauta_registradoCriteria() {
		return new Cibernauta_registradoDetachedCriteria(createCriteria("tiene_asociado_un_cibernauta_registrado"));
	}
	
	public Compra_recibida uniqueCompra_recibida(PersistentSession session) {
		return (Compra_recibida) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Compra_recibida[] listCompra_recibida(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Compra_recibida[]) list.toArray(new Compra_recibida[list.size()]);
	}
}

