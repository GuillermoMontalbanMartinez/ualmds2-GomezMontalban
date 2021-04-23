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

public class OfertaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_ofertas;
	public final IntegerExpression precio_oferta;
	public final StringExpression fecha;
	public final IntegerExpression esta_asociada_a_un_productoId;
	public final AssociationExpression esta_asociada_a_un_producto;
	public final CollectionExpression asociada_a_una_categoria;
	
	public OfertaDetachedCriteria() {
		super(basededatos.Oferta.class, basededatos.OfertaCriteria.class);
		id_ofertas = new IntegerExpression("id_ofertas", this.getDetachedCriteria());
		precio_oferta = new IntegerExpression("precio_oferta", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		esta_asociada_a_un_productoId = new IntegerExpression("esta_asociada_a_un_producto.id_ofertas", this.getDetachedCriteria());
		esta_asociada_a_un_producto = new AssociationExpression("esta_asociada_a_un_producto", this.getDetachedCriteria());
		asociada_a_una_categoria = new CollectionExpression("ORM_Asociada_a_una_categoria", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.OfertaCriteria.class);
		id_ofertas = new IntegerExpression("id_ofertas", this.getDetachedCriteria());
		precio_oferta = new IntegerExpression("precio_oferta", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		esta_asociada_a_un_productoId = new IntegerExpression("esta_asociada_a_un_producto.id_ofertas", this.getDetachedCriteria());
		esta_asociada_a_un_producto = new AssociationExpression("esta_asociada_a_un_producto", this.getDetachedCriteria());
		asociada_a_una_categoria = new CollectionExpression("ORM_Asociada_a_una_categoria", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createEsta_asociada_a_un_productoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("esta_asociada_a_un_producto"));
	}
	
	public CategoriaDetachedCriteria createAsociada_a_una_categoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("ORM_Asociada_a_una_categoria"));
	}
	
	public Oferta uniqueOferta(PersistentSession session) {
		return (Oferta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Oferta[] listOferta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

