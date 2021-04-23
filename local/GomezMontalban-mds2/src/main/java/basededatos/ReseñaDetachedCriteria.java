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

public class ReseñaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression Id_reseña;
	public final IntegerExpression esta_asociados_a_un_productoId;
	public final AssociationExpression esta_asociados_a_un_producto;
	public final StringExpression comentario;
	public final IntegerExpression valoracion;
	public final IntegerExpression esta_asociada_a_un_cibernauta_registradoId;
	public final AssociationExpression esta_asociada_a_un_cibernauta_registrado;
	
	public ReseñaDetachedCriteria() {
		super(basededatos.Reseña.class, basededatos.ReseñaCriteria.class);
		Id_reseña = new IntegerExpression("Id_reseña", this.getDetachedCriteria());
		esta_asociados_a_un_productoId = new IntegerExpression("esta_asociados_a_un_producto.id_producto", this.getDetachedCriteria());
		esta_asociados_a_un_producto = new AssociationExpression("esta_asociados_a_un_producto", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		valoracion = new IntegerExpression("valoracion", this.getDetachedCriteria());
		esta_asociada_a_un_cibernauta_registradoId = new IntegerExpression("esta_asociada_a_un_cibernauta_registrado.", this.getDetachedCriteria());
		esta_asociada_a_un_cibernauta_registrado = new AssociationExpression("esta_asociada_a_un_cibernauta_registrado", this.getDetachedCriteria());
	}
	
	public ReseñaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ReseñaCriteria.class);
		Id_reseña = new IntegerExpression("Id_reseña", this.getDetachedCriteria());
		esta_asociados_a_un_productoId = new IntegerExpression("esta_asociados_a_un_producto.id_producto", this.getDetachedCriteria());
		esta_asociados_a_un_producto = new AssociationExpression("esta_asociados_a_un_producto", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		valoracion = new IntegerExpression("valoracion", this.getDetachedCriteria());
		esta_asociada_a_un_cibernauta_registradoId = new IntegerExpression("esta_asociada_a_un_cibernauta_registrado.", this.getDetachedCriteria());
		esta_asociada_a_un_cibernauta_registrado = new AssociationExpression("esta_asociada_a_un_cibernauta_registrado", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createEsta_asociados_a_un_productoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("esta_asociados_a_un_producto"));
	}
	
	public Cibernauta_registradoDetachedCriteria createEsta_asociada_a_un_cibernauta_registradoCriteria() {
		return new Cibernauta_registradoDetachedCriteria(createCriteria("esta_asociada_a_un_cibernauta_registrado"));
	}
	
	public Reseña uniqueReseña(PersistentSession session) {
		return (Reseña) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reseña[] listReseña(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reseña[]) list.toArray(new Reseña[list.size()]);
	}
}

