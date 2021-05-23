package interfaz;

import vistas.VistaCompraEnviada;

public class Compra_enviada extends VistaCompraEnviada {
	public Listado_de_compras_enviadas _listado_de_compras_enviadas;
	public Ficha_cliente _ficha_cliente;
	public int idPedido;
	public String nombreCliente;
	public String pais;
	public String localidad;
	public String calle;
	public String portal;
	public String provincia;
	public String codigoPostal;
	
	public Compra_enviada(int id_compra, String nombre, String pais, String localidad, String calle, String portal,
			String provincia, String string) {
		this.idPedido = id_compra;
		this.nombreCliente = nombre;
		this.pais = pais;
		this.localidad = localidad;
		this.calle = calle;
		this.portal = portal;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		
		this.getTextNumeroPedido().setValue(String.valueOf(idPedido));
		this.getTextNombreCliente().setValue(nombreCliente);
		this.getTextDireccion().setValue(pais);
		this.getTextLocalidad().setValue(localidad);
		this.getTextCalle().setValue(calle);
		this.getTextPortal().setValue(portal);
		this.getTextProvincia().setValue(provincia);
		this.getTextCodigoPostal().setValue(codigoPostal);
	}
	
}