package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Compra_pendiente;
import basededatos.Producto;
import vistas.VistaComprasAEnviar;

public class Compras_a_enviar extends VistaComprasAEnviar {
	public Listado_de_compras _listado_de_compras;
	public VerticalLayout layoutListadoDeCompras;
	public VerticalLayout layoutComprasAEnviar;
	public ArrayList<Compra> compras = new ArrayList<Compra>();
	public Compra_pendiente[] compraAEnviar = null;

	public Compras_a_enviar() {
		layoutComprasAEnviar = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layoutListadoDeCompras = this.getVerticalListadoDeCompras().as(VerticalLayout.class);

	}

	public void cargar_compras_a_enviar() throws PersistentException {
		try {
			compraAEnviar = basededatos.Compra_pendienteDAO.listCompra_pendienteByQuery(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mostrar_compras_a_enviar() throws PersistentException {
		cargar_compras_a_enviar();
		for (Compra_pendiente cp : compraAEnviar) {
			Compra compra = new Compra(cp.getId_compra(), cp.getTiene_asociado_un_cibernauta_registrado().getNombre(),
					cp.getTiene_asociado_un_cibernauta_registrado().getPais(),
					cp.getTiene_asociado_un_cibernauta_registrado().getLocalidad(),
					cp.getTiene_asociado_un_cibernauta_registrado().getCalle(),
					cp.getTiene_asociado_un_cibernauta_registrado().getPortal(),
					cp.getTiene_asociado_un_cibernauta_registrado().getProvincia(),
					String.valueOf(cp.getTiene_asociado_un_cibernauta_registrado().getCp()));
			compras.add(compra);
			layoutListadoDeCompras.add(compra);
		}
	}

	public void eliminar_compras_a_enviar() {
		layoutListadoDeCompras.removeAll();
		compras.clear();
	}

}