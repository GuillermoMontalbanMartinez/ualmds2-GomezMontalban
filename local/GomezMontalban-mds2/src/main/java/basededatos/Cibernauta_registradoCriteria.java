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

public class Cibernauta_registradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_usuario;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression correo_electronico;
	public final StringExpression telefono;
	public final StringExpression contrasena;
	public final StringExpression fecha_creacion_usuario;
	public final StringExpression pais;
	public final StringExpression localidad;
	public final StringExpression calle;
	public final StringExpression portal;
	public final StringExpression provincia;
	public final IntegerExpression cp;
	public final StringExpression nombre_titular_tarjeta;
	public final StringExpression numero_tarjeta_credito;
	public final StringExpression fecha_caducidad;
	public final IntegerExpression cvv;
	public final CollectionExpression realiza_resena;
	public final CollectionExpression tiene_compra;
	public final CollectionExpression tiene_correos;
	
	public Cibernauta_registradoCriteria(Criteria criteria) {
		super(criteria);
		id_usuario = new IntegerExpression("id_usuario", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		correo_electronico = new StringExpression("correo_electronico", this);
		telefono = new StringExpression("telefono", this);
		contrasena = new StringExpression("contrasena", this);
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this);
		pais = new StringExpression("pais", this);
		localidad = new StringExpression("localidad", this);
		calle = new StringExpression("calle", this);
		portal = new StringExpression("portal", this);
		provincia = new StringExpression("provincia", this);
		cp = new IntegerExpression("cp", this);
		nombre_titular_tarjeta = new StringExpression("nombre_titular_tarjeta", this);
		numero_tarjeta_credito = new StringExpression("numero_tarjeta_credito", this);
		fecha_caducidad = new StringExpression("fecha_caducidad", this);
		cvv = new IntegerExpression("cvv", this);
		realiza_resena = new CollectionExpression("ORM_Realiza_resena", this);
		tiene_compra = new CollectionExpression("ORM_Tiene_compra", this);
		tiene_correos = new CollectionExpression("ORM_Tiene_correos", this);
	}
	
	public Cibernauta_registradoCriteria(PersistentSession session) {
		this(session.createCriteria(Cibernauta_registrado.class));
	}
	
	public Cibernauta_registradoCriteria() throws PersistentException {
		this(TFGómezMontalbánPersistentManager.instance().getSession());
	}
	
	public ResenaCriteria createRealiza_resenaCriteria() {
		return new ResenaCriteria(createCriteria("ORM_Realiza_resena"));
	}
	
	public CompraCriteria createTiene_compraCriteria() {
		return new CompraCriteria(createCriteria("ORM_Tiene_compra"));
	}
	
	public CorreoCriteria createTiene_correosCriteria() {
		return new CorreoCriteria(createCriteria("ORM_Tiene_correos"));
	}
	
	public Cibernauta_registrado uniqueCibernauta_registrado() {
		return (Cibernauta_registrado) super.uniqueResult();
	}
	
	public Cibernauta_registrado[] listCibernauta_registrado() {
		java.util.List list = super.list();
		return (Cibernauta_registrado[]) list.toArray(new Cibernauta_registrado[list.size()]);
	}
}

