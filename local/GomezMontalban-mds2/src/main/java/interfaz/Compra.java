package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Compras_recibidas;
import vistas.VistaCompra;

public class Compra extends VistaCompra {
	public Listado_de_compras _listado_de_compras;
	// Creados por mi
	public Encargado_de_compras encargadoDeCompras;
	public Compras_recibidas comprasRecibidas;
	//
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
	public VerticalLayout layoutCompra;

	public Compra(int idPedido, String nombreCliente, String pais, String localidad, String calle, String portal,
			String provincia, String codigoPostal) {
		layoutCompra = this.getLayoutCompra().as(VerticalLayout.class);
		// encargadoDeCompras = new Encargado_de_compras();
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

		this.getButtonEnviado().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// layoutCompra.removeAll();
				//layoutCompra.add(encargadoDeCompras);
				
				try {
					System.out.println("El id de pedido enviado es " + idPedido);
					comprasRecibidas.Enviar_compra(idPedido);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}

	public void correo_de_verificacion() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_compra() {
		throw new UnsupportedOperationException();
	}
}