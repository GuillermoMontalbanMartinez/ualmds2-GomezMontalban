package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaProductoAEnviar;

public class Producto_a_enviar extends VistaProductoAEnviar {
	public Productos_a_enviar _productos_a_enviar;
	public Correo _correo;
	public VerticalLayout layoutProductoEnviar;
	public int idCompra = -1;
	basededatos.Cibernauta_registrado cr;
	public int pedido;
	public Ficha_cliente fichaCliente;
	public String id;
	public String calle, codigoPostal, localidad, nombre, pais, portal, provincia;

	public Producto_a_enviar(int ormid) {
		this.getTextNumeroPedidoProductoAEnviar().setValue(String.valueOf(ormid));
		idCompra = ormid;
		fichaCliente = new Ficha_cliente();
		layoutProductoEnviar = this.getVerticalLayoutProductoAEnviar().as(VerticalLayout.class);
		pedido = ormid;
		try {
//			cargar_ficha_cliente();
//			fichaCliente.getTextCliente().setValue(String.valueOf(cr.getORMID()));
//			fichaCliente.getTextCalle().setValue(cr.getCalle());
//			fichaCliente.getTextCodigoPostal().setValue(String.valueOf(cr.getCp()));
//			fichaCliente.getTextLocalidad().setValue(String.valueOf(cr.getLocalidad()));
//			fichaCliente.getTextNombre().setValue(cr.getNombre());
//			fichaCliente.getTextPais().setValue(cr.getPais());
//			fichaCliente.getTextPortal().setValue(cr.getPortal());
//			fichaCliente.getTextProvincia().setValue(cr.getProvincia());
			cargar_ficha_cliente();
			id = String.valueOf(cr.getORMID());
			calle = cr.getCalle();
			codigoPostal = String.valueOf(cr.getCp());
			localidad = String.valueOf(cr.getLocalidad());
			nombre = cr.getNombre();
			pais = cr.getPais();
			portal = cr.getPortal();
			provincia = cr.getProvincia();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.getButtonEntregado().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Enviar_producto();
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

	public void Enviar_producto() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		bd.Enviar_producto(idCompra);
	}
	
	public void cargar_ficha_cliente() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		basededatos.Compra compra = basededatos.CompraDAO.loadCompraByORMID(pedido);
		cr  = bd.cargar_ficha_cliente(compra.getTiene_asociado_un_cibernauta_registrado().getORMID());
	}
}