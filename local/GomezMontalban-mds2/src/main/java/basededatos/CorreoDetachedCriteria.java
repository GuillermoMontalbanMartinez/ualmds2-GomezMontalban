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

public class CorreoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public CorreoDetachedCriteria() {
		super(basededatos.Correo.class, basededatos.CorreoCriteria.class);
		id_correo = new IntegerExpression("id_correo", this.getDetachedCriteria());
		receptorId = new IntegerExpression("receptor.id_correo", this.getDetachedCriteria());
		receptor = new AssociationExpression("receptor", this.getDetachedCriteria());
		autor = new StringExpression("autor", this.getDetachedCriteria());
		destinatario = new StringExpression("destinatario", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		leido = new BooleanExpression("leido", this.getDetachedCriteria());
		pertenece_a_un_cibernauta_registradoId = new IntegerExpression("pertenece_a_un_cibernauta_registrado.", this.getDetachedCriteria());
		pertenece_a_un_cibernauta_registrado = new AssociationExpression("pertenece_a_un_cibernauta_registrado", this.getDetachedCriteria());
		remitenteId = new IntegerExpression("remitente.id_correo", this.getDetachedCriteria());
		remitente = new AssociationExpression("remitente", this.getDetachedCriteria());
	}
	
	public CorreoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CorreoCriteria.class);
		id_correo = new IntegerExpression("id_correo", this.getDetachedCriteria());
		receptorId = new IntegerExpression("receptor.id_correo", this.getDetachedCriteria());
		receptor = new AssociationExpression("receptor", this.getDetachedCriteria());
		autor = new StringExpression("autor", this.getDetachedCriteria());
		destinatario = new StringExpression("destinatario", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		leido = new BooleanExpression("leido", this.getDetachedCriteria());
		pertenece_a_un_cibernauta_registradoId = new IntegerExpression("pertenece_a_un_cibernauta_registrado.", this.getDetachedCriteria());
		pertenece_a_un_cibernauta_registrado = new AssociationExpression("pertenece_a_un_cibernauta_registrado", this.getDetachedCriteria());
		remitenteId = new IntegerExpression("remitente.id_correo", this.getDetachedCriteria());
		remitente = new AssociationExpression("remitente", this.getDetachedCriteria());
	}
	
	public CorreoDetachedCriteria createReceptorCriteria() {
		return new CorreoDetachedCriteria(createCriteria("receptor"));
	}
	
	public Cibernauta_registradoDetachedCriteria createPertenece_a_un_cibernauta_registradoCriteria() {
		return new Cibernauta_registradoDetachedCriteria(createCriteria("pertenece_a_un_cibernauta_registrado"));
	}
	
	public CorreoDetachedCriteria createRemitenteCriteria() {
		return new CorreoDetachedCriteria(createCriteria("remitente"));
	}
	
	public Correo uniqueCorreo(PersistentSession session) {
		return (Correo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Correo[] listCorreo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Correo[]) list.toArray(new Correo[list.size()]);
	}
}

