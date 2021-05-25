package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Correo;
import vistas.VistaListadoDeCompras;

public class Ver_listado_de_compras extends VistaListadoDeCompras {
	public Banner_admin _banner_admin;
	public Compras_admin _compras_admin;
	public ArrayList<Compra> comprasArray = new ArrayList<Compra>();
	public basededatos.Compra[] compras;
	public VerticalLayout layoutVerListadoDeCompras;
	
	public Ver_listado_de_compras() {
		layoutVerListadoDeCompras = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
	}
	
	public void cargar_listas_compras_admin() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		compras = bd.cargar_listado_de_compras_admin();
	}
	
//	public Banner_registrado _banner_registrado;
//	public Lista_de_emails _lista_de_emails = new Lista_de_emails();
//	public Redactar_correo _redactar_correo = new Redactar_correo();
//	public HorizontalLayout layout = this.getLayout();
//	public VerticalLayout listaEmails;
//	private String usuario;
//	int id;
//	private BDPrincipal bd;
//	private ArrayList<Correo> correos = new ArrayList<Correo>();
//	public ArrayList<Email> emails = new ArrayList<Email>();
//
//	public Correo_usuario() {
//		listaEmails = this.getLayoutEmails().as(VerticalLayout.class);
//
//	}
//
//	public void cargar_lista_de_emails(int id_usuario) throws PersistentException {
//		try {
//			Correo[] co = basededatos.CorreoDAO.listCorreoByQuery(null, null);
//
//			for (Correo c : co) {
//				if (c.getPertenece_a_un_cibernauta_registrado()
//						.equals(basededatos.Cibernauta_registradoDAO.getCibernauta_registradoByORMID(id))) {
//					correos.add(c);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void mostra_correos() throws PersistentException {
//
//		for (Correo c : correos) {
//			Email email = new Email(c.getAutor(), c.getAsunto(), c.getContenido());
//
//			emails.add(email);
//			listaEmails.add(email);
//		}
//
//	}
//
//	public void eliminar_correos() {
//
//		listaEmails.removeAll();
//
//	}
//
//	public void setUsuario(int id) throws PersistentException {
//		this.id = id;
//		cargar_lista_de_emails(id);
//
//	}
	
}

//public Pedidos_a_entregar pedidos_a_entregar;
//public VerticalLayout layout_pedidos_entregados;
//public VerticalLayout listaPedidosEntregados;
//public ArrayList<Producto_enviado> enviados = new ArrayList<Producto_enviado>();
//public basededatos.Compra_enviada[] comprasEnviadas;
//
//public Pedidos_entregados() {
//	layout_pedidos_entregados = this.getVaadinVerticalLayout().as(VerticalLayout.class);
//	listaPedidosEntregados = this.getLayoutVistaProductosEnviados().as(VerticalLayout.class);
//}
//
//public void cargar_pedidos_entregados() throws PersistentException {
//	BDPrincipal bd = new BDPrincipal();
//	comprasEnviadas = bd.cargar_pedidos_entregados();
//}
//
//public void mostrar_pedidos_entregados() throws PersistentException {
//	cargar_pedidos_entregados();
//	for (basededatos.Compra_enviada ce : comprasEnviadas) {
//		Producto_enviado productoEnviado = new Producto_enviado(ce.getORMID());
//		enviados.add(productoEnviado);
//		listaPedidosEntregados.add(productoEnviado);
//	}
//}
//
//public void eliminar_pedidos_entregados() {
//	listaPedidosEntregados.removeAll();
//	enviados.clear();
//}
