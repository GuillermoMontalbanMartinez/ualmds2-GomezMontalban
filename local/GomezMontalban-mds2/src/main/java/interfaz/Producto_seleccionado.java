package interfaz;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import basededatos.Cibernauta_registrado;
import vistas.VistaProductoSeleccionado;

public class Producto_seleccionado extends VistaProductoSeleccionado {
	public Productos_seleccionados _productos_seleccionados;
	BDPrincipal bd;

	public String nombre, descripcion, precio, foto;
	public int idItem;
	double precioTotal;
	public basededatos.Producto producto;

	public Producto_seleccionado(String nombre, String descripcion, String precio, String foto, int idUsuario, int idItem) {

		this.getNombreText().setValue(nombre);
		this.getDescripcionText().setValue(descripcion);
		this.getImagen().setSrc(foto);
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.foto = foto;

		try {
			for (basededatos.Compra c : basededatos.CompraDAO.listCompraByQuery(null, null)) {
				if (c.getTiene_asociado_un_cibernauta_registrado().getORMID() == idUsuario) {
					this.getCantidadText().setValue(String.valueOf(c.getTiene_item().getCantidad()));
					this.idItem = c.getTiene_item().getORMID();
					this.precioTotal = (c.getTiene_item().getCantidad() * Double.parseDouble(precio));
					this.getPrecioText().setValue(String.valueOf(precioTotal));
					this.producto = c.getTiene_item().getEsta_asociado_a_un_producto();
				}
			}
			
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.getSumarUnidadButton().addClickListener(event -> {
			try {
				aumentar_unidad_producto();
				this.getCantidadText()
						.setValue(String.valueOf(Integer.parseInt(this.getCantidadText().getValue()) + 1));
				this.precioTotal = (Double.parseDouble(this.getCantidadText().getValue()) * Double.parseDouble(precio));
				this.getPrecioText().setValue(String.valueOf(precioTotal));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Pausa");
				}

			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		this.getRestarUnidadButton().addClickListener(event -> {
			try {
				if (Integer.parseInt(this.getCantidadText().getValue()) >= 1) {
					decrementar_unidad_producto();
					this.getCantidadText()
							.setValue(String.valueOf(Integer.parseInt(this.getCantidadText().getValue()) - 1));
					this.precioTotal = (Double.parseDouble(this.getCantidadText().getValue())
							* Double.parseDouble(precio));
					this.getPrecioText().setValue(String.valueOf(precioTotal));
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						System.out.println("Pausa");
					}
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		this.getQuitarButton().addClickListener(event -> {
			try {

				eliminar_producto();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Pausa");
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}

	public void aumentar_unidad_producto() throws PersistentException {
		bd = new BDPrincipal();

		bd.aumentar_unidad_producto(idItem);

	}

	public void decrementar_unidad_producto() throws PersistentException {
		bd = new BDPrincipal();

		bd.decrementar_unidad_producto(idItem);

	}

	public void eliminar_producto() throws PersistentException {
		bd = new BDPrincipal();
		bd.eliminar_producto(idItem);
	}

}