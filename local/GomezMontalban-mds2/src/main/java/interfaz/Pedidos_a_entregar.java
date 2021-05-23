package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import basededatos.Compra_pendiente;
import basededatos.Correo;
import vistas.VistaPedidosAEntregar;

public class Pedidos_a_entregar extends VistaPedidosAEntregar {
	public Pedidos_entregados pedidos_entregados;
	public VerticalLayout layout_pedidos_a_entregar = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	public VerticalLayout listaPedidosAEntregar;
	// private ArrayList<Compra_pendiente> correos = new
	// ArrayList<Compra_pendiente>();
	private Compra_pendiente[] comprasAEnviar;
	public ArrayList<Compra_pendiente> compraPedienteArray = new ArrayList<Compra_pendiente>();

	public Pedidos_a_entregar() {
		// this.getVaadinButtonProductosAEntregar().setVisible(false);
		listaPedidosAEntregar = this.getLayout_pedidos_a_entregar();
	}

	public void cargar_pedidos_a_entregar() throws PersistentException {

		try {
			Compra_pendiente[] comprasAEnviar = basededatos.Compra_pendienteDAO.listCompra_pendienteByQuery(null, null);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mostrar_pedidos_a_entregar() throws PersistentException {
		for (Compra_pendiente cp : comprasAEnviar) {
			Compra compra = new Compra(cp.getId_compra(), cp.getTiene_asociado_un_cibernauta_registrado().getNombre(),
					cp.getTiene_asociado_un_cibernauta_registrado().getPais(),
					cp.getTiene_asociado_un_cibernauta_registrado().getLocalidad(),
					cp.getTiene_asociado_un_cibernauta_registrado().getCalle(),
					cp.getTiene_asociado_un_cibernauta_registrado().getPortal(),
					cp.getTiene_asociado_un_cibernauta_registrado().getProvincia(),
					String.valueOf(cp.getTiene_asociado_un_cibernauta_registrado().getCp()));
			
			listaPedidosAEntregar.add(compra);
		}

	}

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

//	public void cargar_lista_de_emails(int id_usuario) throws PersistentException {
//		try{Correo[] co = basededatos.CorreoDAO.listCorreoByQuery(null, null);
//
//		for (Correo c : co) {
//			if (c.getPertenece_a_un_cibernauta_registrado()
//					.equals(basededatos.Cibernauta_registradoDAO.getCibernauta_registradoByORMID(id))) {
//				correos.add(c);
//			}
//		}
//		}catch(Exception e) {
//			System.out.println("yikes");
//		}
//	}

	public Pedidos_entregados getPedidos_entregados() {
		return pedidos_entregados;
	}

	public void setPedidos_entregados(Pedidos_entregados pedidos_entregados) {
		this.pedidos_entregados = pedidos_entregados;
	}

	public VerticalLayout getLayout_pedidos_a_entregar() {
		return layout_pedidos_a_entregar;
	}

	public void setLayout_pedidos_a_entregar(VerticalLayout layout_pedidos_a_entregar) {
		this.layout_pedidos_a_entregar = layout_pedidos_a_entregar;
	}

}