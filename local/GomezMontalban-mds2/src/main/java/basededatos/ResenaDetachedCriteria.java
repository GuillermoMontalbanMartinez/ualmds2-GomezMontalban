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

public class ResenaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression Id_resena;
	public final IntegerExpression esta_asociados_a_un_productoId;
	public final AssociationExpression esta_asociados_a_un_producto;
	public final StringExpression comentario;
	public final IntegerExpression valoracion;
	public final IntegerExpression esta_asociada_a_un_cibernauta_registradoId;
	public final AssociationExpression esta_asociada_a_un_cibernauta_registrado;
	
	public ResenaDetachedCriteria() {
		super(basededatos.Resena.class, basededatos.ResenaCriteria.class);
		Id_resena = new IntegerExpression("Id_resena", this.getDetachedCriteria());
		esta_asociados_a_un_productoId = new IntegerExpression("esta_asociados_a_un_producto.id_producto", this.getDetachedCriteria());
		esta_asociados_a_un_producto = new AssociationExpression("esta_asociados_a_un_producto", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		valoracion = new IntegerExpression("valoracion", this.getDetachedCriteria());
		esta_asociada_a_un_cibernauta_registradoId = new IntegerExpression("esta_asociada_a_un_cibernauta_registrado.", this.getDetachedCriteria());
		esta_asociada_a_un_cibernauta_registrado = new AssociationExpression("esta_asociada_a_un_cibernauta_registrado", this.getDetachedCriteria());
	}
	
	public ResenaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ResenaCriteria.class);
		Id_resena = new IntegerExpression("Id_resena", this.getDetachedCriteria());
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
	
	public Resena uniqueResena(PersistentSession session) {
		return (Resena) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Resena[] listResena(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Resena[]) list.toArray(new Resena[list.size()]);
	}
}

