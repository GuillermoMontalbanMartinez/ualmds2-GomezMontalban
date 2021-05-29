package interfaz;

import java.util.ArrayList;
import java.util.Arrays;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Producto;
import vistas.VistaCibernautaComun;

public class Cibernauta_común extends VistaCibernautaComun {
	public Buscar_producto _buscar_producto;
	public Ofertas _ofertas = new Ofertas();
	public Productos_mas_vendidos _productos_mas_vendidos = new Productos_mas_vendidos();
	public Ver_publicidad _ver_publicidad;
	public VerticalLayout layoutOfretas;
	public ArrayList<basededatos.Producto> productos_con_oferta = new ArrayList<basededatos.Producto>();
	public ArrayList<Oferta> ofertas = new ArrayList<Oferta>();
	Select<Categoria> select = new Select<Categoria>();
	String value = null;
	public Acceder_al_catalogo catalogo = new Acceder_al_catalogo();
	public Producto[] producto_mas_vendido = null;

	ArrayList<interfaz.Producto> vista_productos;

	public Cibernauta_común() {
		vista_productos = new ArrayList<interfaz.Producto>();
		layoutOfretas = this.getLayoutOfertas().as(VerticalLayout.class);
		try {
			basededatos.Producto[] productos = cargar_ofertas_producto();
			for (basededatos.Producto p : productos) {
				Oferta o = new Oferta(p.getNombre(), p.getDescripción(), String.valueOf(p.getPrecio()),
						p.tiene_fotos.toArray()[0].getLink_foto(), p.getORMID());
				o.getImagen().setSrc(p.tiene_fotos.toArray()[0].getLink_foto());
				o.getNombreText().setValue(p.getNombre());
				o.getFechaLimiteText().setValue(p.getTiene_una_oferta().getFecha());
				o.getPrecioNuevoText().setValue(String.valueOf(p.getPrecio()));
				o.getPrecioAnteriorText().setValue(
						String.valueOf(p.getPrecio() * 100 / (100 - p.getTiene_una_oferta().getPrecio_oferta())));
				productos_con_oferta.add(p);
				layoutOfretas.add(o);
				ofertas.add(o);
			}

			select.setItemLabelGenerator(Categoria::getNombre);

			select.setItems(this.cargar_categoria());

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getVistaProductosMasVendidos().getSelectLayout().as(VerticalLayout.class).add(select);

		select.addValueChangeListener(event -> {
			if (event.getValue() != null) {
				value = event.getValue().getNombre().toString();
				try {
					eliminar_producto();
					mostrar_productos();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public void mostrar_productos() throws PersistentException {
		producto_mas_vendido = _productos_mas_vendidos.cargar_productos_mas_vendidos();
		int aux = 0;
		ArrayList<Producto> p_aux = new ArrayList<Producto>();
		for (Producto p : producto_mas_vendido) {
			if (p_aux.size() == 0) {
				p_aux.add(p);
			} else {
				boolean insert = true;
				for (Producto p2 : p_aux) {
					if (p.getNombre().equals(p2.getNombre())) {
						insert = false;
						break;
					}
				}
					if (insert) {
						p_aux.add(p);
					}

				
			}
		}
		for (Producto p : p_aux) {
			if (aux > 2) {
				break;
			} else {
				if (value != null) {
					if (p.getCategoria().getNombre().equals(value)) {
						interfaz.producto_mas_vendido producto = new interfaz.producto_mas_vendido(p.getNombre(),
								p.getDescripción(), String.valueOf(p.getPrecio()),
								p.tiene_fotos.toArray()[0].getLink_foto(), p.getORMID());
						this.getVistaProductosMasVendidos().getLayoutProductos().as(VerticalLayout.class).add(producto);
						vista_productos.add(producto);
						aux++;

					}
				}else {
					interfaz.producto_mas_vendido producto = new interfaz.producto_mas_vendido(p.getNombre(),
							p.getDescripción(), String.valueOf(p.getPrecio()),
							p.tiene_fotos.toArray()[0].getLink_foto(), p.getORMID());

					this.getVistaProductosMasVendidos().getLayoutProductos().as(VerticalLayout.class).add(producto);
					vista_productos.add(producto);
					aux++;

				}
				
			}

		}
		aux = 0;
	}

	public void eliminar_producto() {
		this.getVistaProductosMasVendidos().getLayoutProductos().as(VerticalLayout.class).removeAll();
		vista_productos.clear();
	}

	public basededatos.Producto[] cargar_ofertas_producto() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_oferta_producto();
	}

	public Categoria[] cargar_categoria() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_categoria();
	}
}