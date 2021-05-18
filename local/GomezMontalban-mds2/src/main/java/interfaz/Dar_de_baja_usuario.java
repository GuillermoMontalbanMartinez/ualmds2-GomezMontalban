package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import basededatos.BDPrincipal;
import vistas.VistaDarDeBajaUsuario;

public class Dar_de_baja_usuario extends VistaDarDeBajaUsuario{
	public Administrar_perfil _administrar_perfil;
	public BDPrincipal bd;
	
	public Dar_de_baja_usuario() {
		this.getButtonConfirmarBajaUsuario().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					confirmar();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	 
	}
	
//	public void Baja_cuenta() throws PersistentException {
//		bd = new BDPrincipal();
//		this.correo = this.getTextCorreo().getValue().toString();	
//		
//		
//		if(value == "Administrador") tipo = 0;
//		else if(value == "Empresa de transporte") tipo = 1;
//		else if(value == "Encargado de compras") tipo = 2;
//		else if(value == "Usuario registrado") tipo = 3;
//		bd.Baja_cuenta(correo, tipo);
//		
//		
//	}
//	
	public void confirmar() throws PersistentException{
		bd = new BDPrincipal();
		bd.BajaCuentaCibernautaRegistrado();
	}
}