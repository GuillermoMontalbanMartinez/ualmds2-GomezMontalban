package basededatos;

import org.orm.PersistentException;

public interface ICompra {

	public void cancelarPedido(int aId_compra);

//	public Compra_enviada[] cargar_compras_enviadas() throws PersistentException;

	public Compra_recibida[] cargar_compras_recibidas() throws PersistentException;

//	public Compra[] cargar_pedidos_encargados(int aId_usuario);

	public Compra_recibida[] cargar_pedidos_a_entregar() throws PersistentException;

	public Compra[] cargar_productos_comprados_recientemente(int aId_usuario) throws PersistentException;

	public Compra_enviada[] cargar_pedidos_entregados() throws PersistentException;

//	public Compra[] cargar_lista_compras_admin() throws PersistentException;

	public void Enviar_compra(int aId_compra) throws PersistentException;

	public void Enviar_producto(int aId_compra) throws PersistentException;

//	public void confirmar_compra(Object aId_compra);
}