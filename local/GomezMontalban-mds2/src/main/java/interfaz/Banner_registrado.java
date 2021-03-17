package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBannerRegistrado;

public class Banner_registrado extends VistaBannerRegistrado {
	public Cibernauta_registrado _cibernauta_registrado;
	public Administrar_perfil _administrar_perfil;
	public Carrito_registrado _carrito_registrado;
	public Correo_usuario _correo_usuario;
	
	public Banner_registrado() {
		this._correo_usuario = new Correo_usuario();
	}
}