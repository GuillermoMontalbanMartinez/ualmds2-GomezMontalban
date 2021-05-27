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
	public ArrayList<Compra_admin> comprasArray = new ArrayList<Compra_admin>();
	public basededatos.Compra[] compras;
	public VerticalLayout layoutVerListadoDeCompras;
	public VerticalLayout layoutListadoComprasAdmin;

	public Ver_listado_de_compras() {
		layoutVerListadoDeCompras = this.getVaadinVerticalLayout().as(VerticalLayout.class);
//		 layoutListadoComprasAdmin = this.getLayoutVistaComprasAdmin().as(VerticalLayout.class);
		layoutListadoComprasAdmin = this.getVerticalLayoutVistaComprasAdmin().as(VerticalLayout.class);
	}

	public void cargar_lista_compras_admin() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		compras = bd.cargar_listado_de_compras_admin();
	}

	public void mostrar_listado_compras_admin() throws PersistentException {
		cargar_lista_compras_admin();
		for (basededatos.Compra c : compras) {
			Compra_admin compra = new Compra_admin(c.getTiene_asociado_un_cibernauta_registrado().getORMID(),
					c.getId_compra(), c.getEstado_compra());
			comprasArray.add(compra);
			layoutListadoComprasAdmin.add(compra);
		}

	}

	public void eliminar_listado_compras_admin() {
		layoutListadoComprasAdmin.removeAll();
		comprasArray.clear();
	}

}
