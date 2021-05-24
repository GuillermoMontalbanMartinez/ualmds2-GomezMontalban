package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaCompraAdmin;
import vistas.VistaComprasAdmin;

// VistaComprasAdmin esta antes de modificarlo (error casi seguro)
public class Compra_admin extends VistaCompraAdmin {
	public Compras_admin _compras_admin;
	public Datos_envio _datos_envio;
	public VerticalLayout layoutCompraAdmin;
	
	public Compra_admin() {
		layoutCompraAdmin = this.layoutCompraAdmin;
		
		
	}
//	
//	basededatos.Cibernauta_registrado cr;
//	public int pedido;
//	public Ficha_cliente fichaCliente;
//	public String id;
//	public String calle, codigoPostal, localidad, nombre, pais, portal, provincia;
//	
//	public Producto_enviado(int idPedido) {
//		this.getTextNumeroPedido().setValue(String.valueOf(idPedido));
//		layoutProductoEnviada = this.getVerticalLayoutProductoEnviado().as(VerticalLayout.class);
//		fichaCliente = new Ficha_cliente();
//		pedido = idPedido;
//		try {
//			cargar_ficha_cliente();
//			id = String.valueOf(cr.getORMID());
//			calle = cr.getCalle();
//			codigoPostal = String.valueOf(cr.getCp());
//			localidad = String.valueOf(cr.getLocalidad());
//			nombre = cr.getNombre();
//			pais = cr.getPais();
//			portal = cr.getPortal();
//			provincia = cr.getProvincia();
//		} catch (PersistentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	
//	public void cargar_ficha_cliente() throws PersistentException {
//		BDPrincipal bd = new BDPrincipal();
//		basededatos.Compra compra = basededatos.CompraDAO.loadCompraByORMID(pedido);
//		cr  = bd.cargar_ficha_cliente(compra.getTiene_asociado_un_cibernauta_registrado().getORMID());
//		System.out.println(cr.getNombre());
//	}
}