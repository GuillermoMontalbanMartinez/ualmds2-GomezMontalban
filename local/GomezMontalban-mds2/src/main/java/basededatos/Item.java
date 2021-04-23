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

public class Item {
	public Item() {
	}
	
	private int id_item;
	
	private int cantidad;
	
	private basededatos.Compra esta_asociado_a_una_compra;
	
	private basededatos.Producto esta_asociado_a_un_producto;
	
	private void setId_item(int value) {
		this.id_item = value;
	}
	
	public int getId_item() {
		return id_item;
	}
	
	public int getORMID() {
		return getId_item();
	}
	
	public void setCantidad(int value) {
		this.cantidad = value;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setEsta_asociado_a_una_compra(basededatos.Compra value) {
		if (this.esta_asociado_a_una_compra != value) {
			basededatos.Compra lesta_asociado_a_una_compra = this.esta_asociado_a_una_compra;
			this.esta_asociado_a_una_compra = value;
			if (value != null) {
				esta_asociado_a_una_compra.setTiene_item(this);
			}
			if (lesta_asociado_a_una_compra != null && lesta_asociado_a_una_compra.getTiene_item() == this) {
				lesta_asociado_a_una_compra.setTiene_item(null);
			}
		}
	}
	
	public basededatos.Compra getEsta_asociado_a_una_compra() {
		return esta_asociado_a_una_compra;
	}
	
	public void setEsta_asociado_a_un_producto(basededatos.Producto value) {
		if (this.esta_asociado_a_un_producto != value) {
			basededatos.Producto lesta_asociado_a_un_producto = this.esta_asociado_a_un_producto;
			this.esta_asociado_a_un_producto = value;
			if (value != null) {
				esta_asociado_a_un_producto.setTiene_item(this);
			}
			if (lesta_asociado_a_un_producto != null && lesta_asociado_a_un_producto.getTiene_item() == this) {
				lesta_asociado_a_un_producto.setTiene_item(null);
			}
		}
	}
	
	public basededatos.Producto getEsta_asociado_a_un_producto() {
		return esta_asociado_a_un_producto;
	}
	
	public String toString() {
		return String.valueOf(getId_item());
	}
	
}
