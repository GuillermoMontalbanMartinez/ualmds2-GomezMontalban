package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Compra;
import basededatos.Producto;
import vistas.VistaVerUltimasCompras;

public class Ver_ultimas_compras extends VistaVerUltimasCompras {
	public Administrar_perfil _administrar_perfil;
	public Productos_comprados_recientemente _productos_comprados_recientemente = new Productos_comprados_recientemente();
	public VerticalLayout compras;
	int idUsuario=-1;
	ArrayList<Compra> compraArrayList = new ArrayList<Compra>();
	ArrayList<Producto_comprado_recientemente> compraInterfazList = new ArrayList<Producto_comprado_recientemente>();

	;

	public Ver_ultimas_compras() {
		compras = _productos_comprados_recientemente.getProductosCompradosLayout().as(VerticalLayout.class);

		try {
			mostrar_productos_comprados();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void mostrar_productos_comprados() throws PersistentException {
		cargar_productos_comprados_recientementes();

		for (Compra c : compraArrayList) {
			Producto_comprado_recientemente p = new Producto_comprado_recientemente();
			p.getCuerpoText().setValue(c.getTiene_item().getEsta_asociado_a_un_producto().getDescripción());
			p.getNombreText().setValue(c.getTiene_item().getEsta_asociado_a_un_producto().getNombre());
			p.getImagen()
					.setSrc(c.getTiene_item().getEsta_asociado_a_un_producto().tiene_fotos.toArray()[0].getLink_foto());
			p.getPrecioText().setValue(String.valueOf(c.getTiene_item().getEsta_asociado_a_un_producto().getPrecio()));
			p.setIdProducto(c.getTiene_item().getEsta_asociado_a_un_producto().getORMID());
			p.setIdUsuario(idUsuario);
			
			compras.add(p);
			compraInterfazList.add(p);
		}
	}

	public void cargar_productos_comprados_recientementes() throws PersistentException {
		if (idUsuario != -1) {
			BDPrincipal bd = new BDPrincipal();
			Compra[] compra = bd.cargar_productos_comprados_recientemente(idUsuario);

			for (Compra p : compra) {
				compraArrayList.add(p);

			}
		}
	}

	public void limpiar() {
		compras.removeAll();
		compraArrayList.clear();
	}

	public void setUsuario(String usuario) throws PersistentException {
		basededatos.Cibernauta_registrado[] cb = basededatos.Cibernauta_registradoDAO
				.listCibernauta_registradoByQuery(null, null);
		for (basededatos.Cibernauta_registrado c : cb) {
			if (c.getNombre().equals(usuario)) {
				idUsuario = c.getORMID();
			}
		}
		mostrar_productos_comprados();
	}
}