package interfaz;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Oferta;
import basededatos.Producto;
import vistas.VistaPublicarOferta;

public class Publicar_oferta extends VistaPublicarOferta {
	public Administrar_ofertas _administrar_ofertas;
	public BDPrincipal bd;
	String value = "";
	public int descuento;
	public String fechaLimite;
	Select<Producto> select = new Select<>();

	public Publicar_oferta() {

		this.getButtonPublicarOferta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Alta_oferta_producto();
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		});

		select.setItemLabelGenerator(Producto::getNombre);
		try {
			select.setItems(this.cargar_productos());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getTextNombreProductoOferta().add(select);

		select.addValueChangeListener(event -> {
			if (event.getValue() != null) {
				value = event.getValue().getNombre().toString();
			}
		});

	}

	public void Alta_oferta_producto() throws PersistentException {
		bd = new BDPrincipal();
		int id = -1;
		descuento = Integer.parseInt(this.getTextDescuentoOferta().getValue().toString());
		fechaLimite = this.getTextFechaLimiteOfertaProducto().getValue().toString();
		Producto[] producto = bd.cargar_productos();
		for (Producto pro : producto) {
			if (pro.getNombre().toString().equals(value)) {
				id = pro.getORMID();
			}
		}
		bd.Alta_oferta_producto(id, descuento, fechaLimite);
	}

	public Producto[] cargar_productos() throws PersistentException {
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
