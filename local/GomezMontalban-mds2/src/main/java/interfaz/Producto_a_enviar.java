package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import basededatos.BDPrincipal;
import vistas.VistaProductoAEnviar;

public class Producto_a_enviar extends VistaProductoAEnviar {
	public Productos_a_enviar _productos_a_enviar;
	public Correo _correo;
	public int idCompra = -1;

	public Producto_a_enviar(int ormid) {
		this.getTextNumeroPedidoProductoAEnviar().setValue(String.valueOf(ormid));
		idCompra = ormid;

		this.getButtonEntregado().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Enviar_producto();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}

	public void correo_de_verificacion() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_producto() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		bd.Enviar_producto(idCompra);
	}
}