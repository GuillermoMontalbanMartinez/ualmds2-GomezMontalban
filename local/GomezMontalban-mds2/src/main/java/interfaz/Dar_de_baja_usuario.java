package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import basededatos.BDPrincipal;
import basededatos.Cibernauta_registrado;
import vistas.VistaDarDeBajaUsuario;

public class Dar_de_baja_usuario extends VistaDarDeBajaUsuario {
	public Administrar_perfil _administrar_perfil;
	public BDPrincipal bd;
	public int idUsuario;

	public Dar_de_baja_usuario() {
		this.getButtonConfirmarBajaUsuario().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					bajaCuentaCibernautaRegistrado();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

	}

	public void bajaCuentaCibernautaRegistrado() throws PersistentException {
		bd = new BDPrincipal();
		bd.BajaCuentaCibernautaRegistrado(idUsuario);
	}

	public void setUsuario(int id) throws PersistentException {

		idUsuario = id;
	}

}