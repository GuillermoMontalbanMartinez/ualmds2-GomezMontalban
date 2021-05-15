package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import basededatos.BDPrincipal;
import vistas.VistaModificarDatosPersonales;

public class Modificar_datos_personales extends VistaModificarDatosPersonales{
	public Administrar_perfil _administrar_perfil;
	public Carrito_registrado _carrito_registrado;
	public BDPrincipal bdPrincipal;
	public String nombre;
	public String apellidos;
	public String correoElectronico;
	public String telefono;
	public String password;
	public String passwordRepeat;
	public String pais;
	public String localidad;
	public String calle;
	public String portal;
	public String provincia;
	public int cp;
	public String titular;
	public String numeroTarjeta;
	public String fechaCaducidad;
	public String cvv;
	
	public Modificar_datos_personales() {
		this.getTextGuardarCambios().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					confirmar_cambios();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	 
		
	}

	public void confirmar_cambios() throws PersistentException {
		bdPrincipal = new BDPrincipal();
		nombre = this.getTextNombreDeUsuario().getValue().toString();
		apellidos = this.getTextApellidos().getValue().toString();
		correoElectronico = this.getTextCorreo().getValue().toString();
		telefono = this.getTextTelefono().getValue().toString();
		password = this.getTextPassword().getValue().toString();
		passwordRepeat = this.getTextRepeatPassword().getValue().toString();
		pais = this.getTextPais().getValue().toString();
		localidad = this.getTextLocalidad().getValue().toString();
		calle = this.getTextCalle().getValue().toString();
		portal = this.getTextPortal().getValue().toString();
		provincia = this.getTextProvincia().getValue().toString();
		cp = Integer.parseInt(this.getTextCogidoPostal().getValue().toString());

		//titular = this.getTextTitularTarjeta().getValue().toString();
		//numeroTarjeta = this.getTextNumeroTarjeta().getValue().toString();
		//fechaCaducidad = this.getTextFechaCaducidad().getValue().toString();
		//cvv = Integer.parseInt(this.getTextFechaCaducidad().getValue().toString());
		// bdPrincipal.Registro(nombre, apellidos, correoElectronico, password, passwordRepeat, telefono, pais, localidad, calle, portal, provincia, cp, numeroTarjeta, titular, fechaCaducidad, cvv, null);

	}

	public void adjuntar_nueva_foto_de_perfil() {
		throw new UnsupportedOperationException();
	}
}