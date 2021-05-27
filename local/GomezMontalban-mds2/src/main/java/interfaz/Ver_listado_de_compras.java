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
	public VerticalLayout layoutListadoComprasAdmin;

	public Ver_listado_de_compras() {
		layoutVerListadoDeCompras = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layoutListadoComprasAdmin = this.getLayoutVistaComprasAdmin().as(VerticalLayout.class);
	}

	public void cargar_lista_compras_admin() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		compras = bd.cargar_listado_de_compras_admin();
	}

	public void mostrar_listado_compras_admin() throws PersistentException {
		cargar_lista_compras_admin();
		for (basededatos.Compra c : compras) {
			Compra compra = new Compra(c.getORMID(), c.getTiene_asociado_un_cibernauta_registrado().getNombre(),
					c.getTiene_asociado_un_cibernauta_registrado().getPais(),
					c.getTiene_asociado_un_cibernauta_registrado().getLocalidad(),
					c.getTiene_asociado_un_cibernauta_registrado().getCalle(),
					c.getTiene_asociado_un_cibernauta_registrado().getPortal(),
					c.getTiene_asociado_un_cibernauta_registrado().getProvincia(),
					String.valueOf(c.getTiene_asociado_un_cibernauta_registrado().getCp()));
			comprasArray.add(compra);
			layoutListadoComprasAdmin.add(compra);
		}

	}

	public void eliminar_listado_compras_admin() {
		layoutListadoComprasAdmin.removeAll();
		comprasArray.clear();
	}

}
