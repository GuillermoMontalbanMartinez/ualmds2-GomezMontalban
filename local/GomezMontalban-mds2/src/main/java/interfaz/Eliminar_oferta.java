package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.mchange.lang.ArrayUtils;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Producto;
import vistas.VistaEliminarOferta;

public class Eliminar_oferta extends VistaEliminarOferta {
	public Administrar_ofertas _administrar_ofertas;
	public BDPrincipal bd;
	String value = "";
	Select<basededatos.Producto> select = new Select();

	public Eliminar_oferta() {
		this.getButtonEliminarOfertaProducto().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Baja_oferta_producto();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		select.setItemLabelGenerator(Producto::getNombre);
		try {
			select.setItems(this.cargar_producto());

		} catch (PersistentException e) {
			e.printStackTrace();
		}

		this.getTextComboBoxEliminarOferta().add(select);

		select.addValueChangeListener(event -> {
			if (event.getValue() != null) {
				value = event.getValue().getNombre().toString();
			}
		});

	}

	public Administrar_ofertas get_administrar_ofertas() {
		return _administrar_ofertas;
	}

	public void set_administrar_ofertas(Administrar_ofertas _administrar_ofertas) {
		this._administrar_ofertas = _administrar_ofertas;
	}

	public void Baja_oferta_producto() throws PersistentException {
		bd = new BDPrincipal();
		bd.Baja_oferta_producto(value);
	}

	public basededatos.Producto[] cargar_producto() throws PersistentException {
		bd = new BDPrincipal();
		return bd.cargar_productos();
	}
}