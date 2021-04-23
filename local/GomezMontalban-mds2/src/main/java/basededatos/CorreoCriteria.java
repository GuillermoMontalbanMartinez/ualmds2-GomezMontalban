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

public class CorreoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_correo;
	public final IntegerExpression receptorId;
	public final AssociationExpression receptor;
	public final StringExpression autor;
	public final StringExpression destinatario;
	public final StringExpression asunto;
	public final StringExpression contenido;
	public final BooleanExpression leido;
	public final IntegerExpression pertenece_a_un_cibernauta_registradoId;
	public final AssociationExpression pertenece_a_un_cibernauta_registrado;
	public final IntegerExpression remitenteId;
	public final AssociationExpression remitente;
	
	public CorreoCriteria(Criteria criteria) {
		super(criteria);
		id_correo = new IntegerExpression("id_correo", this);
		receptorId = new IntegerExpression("receptor.id_correo", this);
		receptor = new AssociationExpression("receptor", this);
		autor = new StringExpression("autor", this);
		destinatario = new StringExpression("destinatario", this);
		asunto = new StringExpression("asunto", this);
		contenido = new StringExpression("contenido", this);
		leido = new BooleanExpression("leido", this);
		pertenece_a_un_cibernauta_registradoId = new IntegerExpression("pertenece_a_un_cibernauta_registrado.", this);
		pertenece_a_un_cibernauta_registrado = new AssociationExpression("pertenece_a_un_cibernauta_registrado", this);
		remitenteId = new IntegerExpression("remitente.id_correo", this);
		remitente = new AssociationExpression("remitente", this);
	}
	
	public CorreoCriteria(PersistentSession session) {
		this(session.createCriteria(Correo.class));
	}
	
	public CorreoCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public CorreoCriteria createReceptorCriteria() {
		return new CorreoCriteria(createCriteria("receptor"));
	}
	
	public Cibernauta_registradoCriteria createPertenece_a_un_cibernauta_registradoCriteria() {
		return new Cibernauta_registradoCriteria(createCriteria("pertenece_a_un_cibernauta_registrado"));
	}
	
	public CorreoCriteria createRemitenteCriteria() {
		return new CorreoCriteria(createCriteria("remitente"));
	}
	
	public Correo uniqueCorreo() {
		return (Correo) super.uniqueResult();
	}
	
	public Correo[] listCorreo() {
		java.util.List list = super.list();
		return (Correo[]) list.toArray(new Correo[list.size()]);
	}
}

