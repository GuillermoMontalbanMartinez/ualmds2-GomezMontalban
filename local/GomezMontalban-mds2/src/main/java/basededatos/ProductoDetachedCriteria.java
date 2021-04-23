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

public class ProductoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ProductoDetachedCriteria() {
		super(basededatos.Producto.class, basededatos.ProductoCriteria.class);
		id_producto = new IntegerExpression("id_producto", this.getDetachedCriteria());
		tiene_itemId = new IntegerExpression("tiene_item.id_item", this.getDetachedCriteria());
		tiene_item = new AssociationExpression("tiene_item", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.id_categorias", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		tiene_una_ofertaId = new IntegerExpression("tiene_una_oferta.id_ofertas", this.getDetachedCriteria());
		tiene_una_oferta = new AssociationExpression("tiene_una_oferta", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripción = new StringExpression("descripción", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		tiene_fotos = new CollectionExpression("ORM_Tiene_fotos", this.getDetachedCriteria());
		tiene_reseñas = new CollectionExpression("ORM_Tiene_reseñas", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ProductoCriteria.class);
		id_producto = new IntegerExpression("id_producto", this.getDetachedCriteria());
		tiene_itemId = new IntegerExpression("tiene_item.id_item", this.getDetachedCriteria());
		tiene_item = new AssociationExpression("tiene_item", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.id_categorias", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		tiene_una_ofertaId = new IntegerExpression("tiene_una_oferta.id_ofertas", this.getDetachedCriteria());
		tiene_una_oferta = new AssociationExpression("tiene_una_oferta", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripción = new StringExpression("descripción", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		tiene_fotos = new CollectionExpression("ORM_Tiene_fotos", this.getDetachedCriteria());
		tiene_reseñas = new CollectionExpression("ORM_Tiene_reseñas", this.getDetachedCriteria());
	}
	
	public ItemDetachedCriteria createTiene_itemCriteria() {
		return new ItemDetachedCriteria(createCriteria("tiene_item"));
	}
	
	public CategoriaDetachedCriteria createCategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("categoria"));
	}
	
	public OfertaDetachedCriteria createTiene_una_ofertaCriteria() {
		return new OfertaDetachedCriteria(createCriteria("tiene_una_oferta"));
	}
	
	public FotoDetachedCriteria createTiene_fotosCriteria() {
		return new FotoDetachedCriteria(createCriteria("ORM_Tiene_fotos"));
	}
	
	public ReseñaDetachedCriteria createTiene_reseñasCriteria() {
		return new ReseñaDetachedCriteria(createCriteria("ORM_Tiene_reseñas"));
	}
	
	public Producto uniqueProducto(PersistentSession session) {
		return (Producto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto[] listProducto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

