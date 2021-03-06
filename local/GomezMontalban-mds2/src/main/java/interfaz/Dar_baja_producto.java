package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Producto;
import vistas.VistaDarBajaProducto;

public class Dar_baja_producto extends VistaDarBajaProducto {
	public Administrar_productos _administrar_productos;
	public BDPrincipal bd;
	public String nombreProducto;
	// public int idProducto;
	String value = "";
	Select<basededatos.Producto> select = new Select();

	public Dar_baja_producto() {
		this.getButtonAceptar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Baja_producto();
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
		this.getTextNombreProductoEliminarProducto().add(select);

		select.addValueChangeListener(event -> {
			if (event.getValue() != null) {
				value = event.getValue().getNombre().toString();
			}
		});
	}

	public void Baja_producto() throws PersistentException {
		bd = new BDPrincipal();
		bd.Baja_producto(value);
	}

	public basededatos.Producto[] cargar_producto() throws PersistentException {
		bd = new BDPrincipal();
		Producto[] productos = bd.cargar_productos();
		ArrayList<Producto> aux = new ArrayList<Producto>();
		for (Producto p : productos) {
			if (aux.size() == 0) {
				aux.add(p);
			} else {
				boolean insert = true;
				for (Producto p2 : aux) {
					if (p.getNombre().equals(p2.getNombre())) {
						insert = false;
						break;
					}

				}
				if (insert) {
					aux.add(p);
				}
			}
		}
		Producto resultado[] = new Producto[aux.size()];

		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = aux.get(i);
		}

		return resultado;
	}
}