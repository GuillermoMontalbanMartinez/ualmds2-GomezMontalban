package interfaz;

import vistas.VistaCompra;

public class Compra extends VistaCompra {
	public Listado_de_compras _listado_de_compras;
	public Correo _correo;
	public Ficha_cliente _ficha_cliente;
	public int idPedido;
	public String nombreCliente;
	public String pais;
	public String localidad;
	public String calle;
	public String portal;
	public String provincia;
	public String codigoPostal;

	public Compra(int idPedido, String nombreCliente, String pais, String localidad, String calle, String portal,
			String provincia, String codigoPostal) {
		this.idPedido = idPedido;
		this.nombreCliente = nombreCliente;
		this.pais = pais;
		this.localidad = localidad;
		this.calle = calle;
		this.portal = portal;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		
		this.getTextNumeroPedido().setValue(String.valueOf(idPedido));
		this.getTextNombreCliente().setValue(nombreCliente);
		this.getVaadinTextField().setValue(pais);
		this.getTextLocalidad().setValue(localidad);
		this.getTextCalle().setValue(calle);
		this.getTextPortal().setValue(portal);
		this.getTextProvincia().setValue(provincia);
		this.getTextCodigoPostal().setValue(codigoPostal);
	}
	
	

	public void correo_de_verificacion() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_compra() {
		throw new UnsupportedOperationException();
	}
}