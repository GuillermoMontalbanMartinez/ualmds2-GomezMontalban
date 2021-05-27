package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaCompraAdmin;
import vistas.VistaCompraEnviada;
import vistas.VistaComprasAdmin;

public class Compra_admin extends VistaCompraAdmin {
	public Compras_admin _compras_admin;
	public Datos_envio _datos_envio;
	public VerticalLayout layoutCompraAdmin;
	public int idUsuario;
	public int idProducto;
	public int estado;
	public Ficha_cliente fichaCliente;
	public basededatos.Cibernauta_registrado cr;
	public String id, calle, codigoPostal, localidad, nombre, pais, portal, provincia;

	public Compra_admin(int idUsuario, int idProducto, int estado) {
		layoutCompraAdmin = this.layoutCompraAdmin;
		this.idUsuario = idUsuario;
		this.idProducto = idProducto;
		this.estado = estado;
		fichaCliente = new Ficha_cliente();

		switch (estado) {
		case 1:
			this.getTextEstadoCompra().setValue("Pedido confirmado");
			break;
		case 2:
			this.getTextEstadoCompra().setValue("Pedido en envio");
			break;
		case 3:
			this.getTextEstadoCompra().setValue("Pedido entregado");
			break;
		default:
			this.getTextEstadoCompra().setValue("Ha ocurrido un error :(");
			break;
		}

		this.getTextIdProducto().setValue(String.valueOf(idProducto));
		this.getTextIdUsuario().setValue(String.valueOf(idUsuario));

		try {
			cargar_ficha_cliente();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.id = String.valueOf(cr.getORMID());
		this.calle = cr.getCalle();
		this.codigoPostal = String.valueOf(cr.getCp());
		this.nombre = cr.getNombre();
		this.pais = cr.getPais();
		this.portal = cr.getPortal();
		this.localidad = cr.getLocalidad();
		this.provincia = cr.getProvincia();

	}

	public void cargar_ficha_cliente() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		cr = bd.cargar_ficha_cliente(idUsuario);
	}

}