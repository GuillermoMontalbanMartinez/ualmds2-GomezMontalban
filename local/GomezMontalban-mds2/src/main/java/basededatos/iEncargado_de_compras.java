package basededatos;

import org.orm.PersistentException;

public interface iEncargado_de_compras {

	public void Enviar_producto(int aId_compra) throws PersistentException;
}