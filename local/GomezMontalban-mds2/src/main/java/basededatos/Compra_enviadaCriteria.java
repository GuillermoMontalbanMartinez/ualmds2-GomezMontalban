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

public class Compra_enviadaCriteria extends AbstractORMCriteria {
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
	public final IntegerExpression empresa_de_transportesId;
	public final AssociationExpression empresa_de_transportes;
	
	public Compra_enviadaCriteria(Criteria criteria) {
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
		empresa_de_transportesId = new IntegerExpression("empresa_de_transportes.", this);
		empresa_de_transportes = new AssociationExpression("empresa_de_transportes", this);
	}
	
	public Compra_enviadaCriteria(PersistentSession session) {
		this(session.createCriteria(Compra_enviada.class));
	}
	
	public Compra_enviadaCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public Empresa_de_transportesCriteria createEmpresa_de_transportesCriteria() {
		return new Empresa_de_transportesCriteria(createCriteria("empresa_de_transportes"));
	}
	
	public ItemCriteria createTiene_itemCriteria() {
		return new ItemCriteria(createCriteria("tiene_item"));
	}
	
	public Cibernauta_registradoCriteria createTiene_asociado_un_cibernauta_registradoCriteria() {
		return new Cibernauta_registradoCriteria(createCriteria("tiene_asociado_un_cibernauta_registrado"));
	}
	
	public Compra_enviada uniqueCompra_enviada() {
		return (Compra_enviada) super.uniqueResult();
	}
	
	public Compra_enviada[] listCompra_enviada() {
		java.util.List list = super.list();
		return (Compra_enviada[]) list.toArray(new Compra_enviada[list.size()]);
	}
}

