package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Compra_recibida;
//import basededatos.Compra_pendiente;
//import basededatos.Compra_enviada;
//import basededatos.Compra_pendiente;
import vistas.VistaComprasEnviadas;

public class Compras_enviadas extends VistaComprasEnviadas {
	public Listado_de_compras_enviadas _listado_de_compras_enviadas;
	public VerticalLayout layout;
	public VerticalLayout listadoComprasEnviadas;
	public basededatos.Compra_recibida[] comprasRecibidas = null;
	public ArrayList<Compra_enviada> comprasEnviadas = new ArrayList<Compra_enviada>();

	public Compras_enviadas() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		listadoComprasEnviadas = this.getLayoutVistaListadoDeComprasEnviadas().as(VerticalLayout.class);
	}

	public basededatos.Compra_recibida[] cargar_compras_recibidas() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_compras_recibidas();
	}


	public void eliminar_compras_enviadas() {
		listadoComprasEnviadas.removeAll();
		comprasEnviadas.clear();

	}

	public void mostrar_compras_enviadas() throws PersistentException {
		comprasRecibidas = cargar_compras_recibidas();
		for (basededatos.Compra_recibida ce : comprasRecibidas) {
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