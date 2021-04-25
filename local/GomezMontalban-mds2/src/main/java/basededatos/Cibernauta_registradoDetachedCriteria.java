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

public class Cibernauta_registradoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Cibernauta_registradoDetachedCriteria() {
		super(basededatos.Cibernauta_registrado.class, basededatos.Cibernauta_registradoCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this.getDetachedCriteria());
		pais = new StringExpression("pais", this.getDetachedCriteria());
		localidad = new StringExpression("localidad", this.getDetachedCriteria());
		calle = new StringExpression("calle", this.getDetachedCriteria());
		portal = new StringExpression("portal", this.getDetachedCriteria());
		provincia = new StringExpression("provincia", this.getDetachedCriteria());
		cp = new IntegerExpression("cp", this.getDetachedCriteria());
		nombre_titular_tarjeta = new StringExpression("nombre_titular_tarjeta", this.getDetachedCriteria());
		numero_tarjeta_credito = new StringExpression("numero_tarjeta_credito", this.getDetachedCriteria());
		fecha_caducidad = new StringExpression("fecha_caducidad", this.getDetachedCriteria());
		cvv = new IntegerExpression("cvv", this.getDetachedCriteria());
		realiza_resena = new CollectionExpression("ORM_Realiza_resena", this.getDetachedCriteria());
		tiene_compra = new CollectionExpression("ORM_Tiene_compra", this.getDetachedCriteria());
		tiene_correos = new CollectionExpression("ORM_Tiene_correos", this.getDetachedCriteria());
	}
	
	public Cibernauta_registradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Cibernauta_registradoCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		fecha_creacion_usuario = new StringExpression("fecha_creacion_usuario", this.getDetachedCriteria());
		pais = new StringExpression("pais", this.getDetachedCriteria());
		localidad = new StringExpression("localidad", this.getDetachedCriteria());
		calle = new StringExpression("calle", this.getDetachedCriteria());
		portal = new StringExpression("portal", this.getDetachedCriteria());
		provincia = new StringExpression("provincia", this.getDetachedCriteria());
		cp = new IntegerExpression("cp", this.getDetachedCriteria());
		nombre_titular_tarjeta = new StringExpression("nombre_titular_tarjeta", this.getDetachedCriteria());
		numero_tarjeta_credito = new StringExpression("numero_tarjeta_credito", this.getDetachedCriteria());
		fecha_caducidad = new StringExpression("fecha_caducidad", this.getDetachedCriteria());
		cvv = new IntegerExpression("cvv", this.getDetachedCriteria());
		realiza_resena = new CollectionExpression("ORM_Realiza_resena", this.getDetachedCriteria());
		tiene_compra = new CollectionExpression("ORM_Tiene_compra", this.getDetachedCriteria());
		tiene_correos = new CollectionExpression("ORM_Tiene_correos", this.getDetachedCriteria());
	}
	
	public ResenaDetachedCriteria createRealiza_resenaCriteria() {
		return new ResenaDetachedCriteria(createCriteria("ORM_Realiza_resena"));
	}
	
	public CompraDetachedCriteria createTiene_compraCriteria() {
		return new CompraDetachedCriteria(createCriteria("ORM_Tiene_compra"));
	}
	
	public CorreoDetachedCriteria createTiene_correosCriteria() {
		return new CorreoDetachedCriteria(createCriteria("ORM_Tiene_correos"));
	}
	
	public Cibernauta_registrado uniqueCibernauta_registrado(PersistentSession session) {
		return (Cibernauta_registrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cibernauta_registrado[] listCibernauta_registrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cibernauta_registrado[]) list.toArray(new Cibernauta_registrado[list.size()]);
	}
}

