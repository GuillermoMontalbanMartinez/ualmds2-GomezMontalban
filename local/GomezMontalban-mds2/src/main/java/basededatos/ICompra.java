package basededatos;

public interface ICompra {

	public void cancelarPedido(int aId_compra);

	public Compra_recibida[] cargar_compras();

	public Compra_enviada[] cargar_compras_enviadas();

	public Compra[] cargar_pedidos_encargados(int aId_usuario);

	public Compra_pendiente[] cargar_pedidos_a_entregar();

	public Compra[] cargar_productos_comprados_recientemente(int aId_usuario);

	public Compra_recibida[] cargar_pedidos_entregados();

	public Compra[] cargar_lista_compras_admin();

	public void Enviar_compra(int aId_compra);

	public void Enviar_producto(int aId_compra);

	public void confirmar_compra(Object aId_compra);
}