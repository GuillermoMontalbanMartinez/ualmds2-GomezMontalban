package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.Compra_pendiente;
//import basededatos.Compra_enviada;
//import basededatos.Compra_pendiente;
import vistas.VistaComprasEnviadas;

public class Compras_enviadas extends VistaComprasEnviadas {
	public Listado_de_compras_enviadas _listado_de_compras_enviadas;
	public VerticalLayout layout;
	public VerticalLayout listadoComprasEnviadas;
	public Compra_enviada[] comprasRecibidas = null;
	public ArrayList<Compra_enviada> comprasEnviadas = new ArrayList<Compra_enviada>();

	public Compras_enviadas() {
		// listadoComprasEnviadas = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		listadoComprasEnviadas = this.getLayoutVistaListadoDeComprasEnviadas().as(VerticalLayout.class);
	}

	public void cargar_compras_enviadas() throws PersistentException {
		try {
//			// compraRecibiadas = basededatos.Compra_enviadaDAO.listCompra_enviadaByQuery(null, null);
//			comprasRecibidas = basededatos.Compra_recibidaDAO.listCompra_recibidaByQuery(null, null);
			comprasRecibidas = basededatos.Compra_enviadaDAO.listCompra_enviadaByQuery(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public Listado_de_compras _listado_de_compras;
//	public VerticalLayout layoutListadoDeCompras;
//	public VerticalLayout layoutComprasAEnviar;
//	public ArrayList<Compra> compras = new ArrayList<Compra>();
//	public Compra_pendiente[] compraAEnviar = null;
//
//
//	public void cargar_compras_a_enviar() throws PersistentException {
//		try {
//			compraAEnviar = basededatos.Compra_pendienteDAO.listCompra_pendienteByQuery(null, null);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public void eliminar_compras_enviadas() {
		listadoComprasEnviadas.removeAll();

	}

	public void mostrar_compras_enviadas() throws PersistentException {
		cargar_compras_enviadas();
		for (basededatos.Compra_enviada ce : compraEnviada) {
			Compra_enviada compraEnviada = new Compra_enviada(ce.getId_compra(),
					ce.getTiene_asociado_un_cibernauta_registrado().getNombre(),
					ce.getTiene_asociado_un_cibernauta_registrado().getPais(),
					ce.getTiene_asociado_un_cibernauta_registrado().getLocalidad(),
					ce.getTiene_asociado_un_cibernauta_registrado().getCalle(),
					ce.getTiene_asociado_un_cibernauta_registrado().getPortal(),
					ce.getTiene_asociado_un_cibernauta_registrado().getProvincia(),
					String.valueOf(ce.getTiene_asociado_un_cibernauta_registrado().getCp()));
			comprasEnviadas.add(compraEnviada);
			listadoComprasEnviadas.add(compraEnviada);

		}

	}
	
	
}