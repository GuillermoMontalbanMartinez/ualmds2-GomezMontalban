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

public class FotoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression id_foto;
	public final IntegerExpression esta_asociada_a_un_productoId;
	public final AssociationExpression esta_asociada_a_un_producto;
	public final StringExpression link_foto;
	
	public FotoDetachedCriteria() {
		super(basededatos.Foto.class, basededatos.FotoCriteria.class);
		id_foto = new StringExpression("id_foto", this.getDetachedCriteria());
		esta_asociada_a_un_productoId = new IntegerExpression("esta_asociada_a_un_producto.id_producto", this.getDetachedCriteria());
		esta_asociada_a_un_producto = new AssociationExpression("esta_asociada_a_un_producto", this.getDetachedCriteria());
		link_foto = new StringExpression("link_foto", this.getDetachedCriteria());
	}
	
	public FotoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.FotoCriteria.class);
		id_foto = new StringExpression("id_foto", this.getDetachedCriteria());
		esta_asociada_a_un_productoId = new IntegerExpression("esta_asociada_a_un_producto.id_producto", this.getDetachedCriteria());
		esta_asociada_a_un_producto = new AssociationExpression("esta_asociada_a_un_producto", this.getDetachedCriteria());
		link_foto = new StringExpression("link_foto", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createEsta_asociada_a_un_productoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("esta_asociada_a_un_producto"));
	}
	
	public Foto uniqueFoto(PersistentSession session) {
		return (Foto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Foto[] listFoto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

