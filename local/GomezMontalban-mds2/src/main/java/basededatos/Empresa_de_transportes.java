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

import java.io.Serializable;
public class Empresa_de_transportes extends basededatos.Usuarios implements Serializable {
	public Empresa_de_transportes() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EMPRESA_DE_TRANSPORTES_COMPRA_ENVIADA) {
			return ORM_compra_enviada;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_compra_enviada = new java.util.HashSet();
	
	private void setORM_Compra_enviada(java.util.Set value) {
		this.ORM_compra_enviada = value;
	}
	
	private java.util.Set getORM_Compra_enviada() {
		return ORM_compra_enviada;
	}
	
	public final basededatos.Compra_enviadaSetCollection compra_enviada = new basededatos.Compra_enviadaSetCollection(this, _ormAdapter, ORMConstants.KEY_EMPRESA_DE_TRANSPORTES_COMPRA_ENVIADA, ORMConstants.KEY_COMPRA_ENVIADA_EMPRESA_DE_TRANSPORTES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	
	public String toString() {
		return super.toString();
	}
	
}
