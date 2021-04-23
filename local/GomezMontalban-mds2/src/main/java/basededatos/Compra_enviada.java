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

public class Compra_enviada extends basededatos.Compra {
	public Compra_enviada() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMPRA_ENVIADA_EMPRESA_DE_TRANSPORTES) {
			this.empresa_de_transportes = (basededatos.Empresa_de_transportes) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private basededatos.Empresa_de_transportes empresa_de_transportes;
	
	public void setEmpresa_de_transportes(basededatos.Empresa_de_transportes value) {
		if (empresa_de_transportes != null) {
			empresa_de_transportes.compra_enviada.remove(this);
		}
		if (value != null) {
			value.compra_enviada.add(this);
		}
	}
	
	public basededatos.Empresa_de_transportes getEmpresa_de_transportes() {
		return empresa_de_transportes;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Empresa_de_transportes(basededatos.Empresa_de_transportes value) {
		this.empresa_de_transportes = value;
	}
	
	private basededatos.Empresa_de_transportes getORM_Empresa_de_transportes() {
		return empresa_de_transportes;
	}
	
	public List cargar_productos_comprados_recientemente(int id_usuario) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
