package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import basededatos.BDPrincipal;
import vistas.VistaRegistro;

public class Registro extends VistaRegistro{
	public Cibernauta _cibernauta;
	public Iniciar_sesion _iniciar_sesion;
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
	public int cvv;
	
	@SuppressWarnings("unchecked")
	public Registro() {
		this.getButtonRegistro().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					registro();
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		});
	}


	public void registro() throws PersistentException {
		bdPrincipal = new BDPrincipal();
		nombre = this.getTextNombreUsuario().getValue().toString();
		apellidos = this.getTextApellidos().getValue().toString();
		correoElectronico = this.getTextCorreo().getValue().toString();
		telefono = this.getTextTelefono().getValue().toString();
		password = this.getTextPassword().getValue().toString();
		passwordRepeat = this.getTextRepetirPassword().getValue().toString();
		pais = this.getTextPais().getValue().toString();
		localidad = this.getTextLocalidad().getValue().toString();
		calle = this.getTextCalle().getValue().toString();
		portal = this.getTextPortal().getValue().toString();
		provincia = this.getTextProvincia().getValue().toString();
		cp = Integer.parseInt(this.getTextCodigoPostal().getValue().toString());
		titular = this.getTextTitularTarjeta().getValue().toString();
		numeroTarjeta = this.getTextNumeroTarjeta().getValue().toString();
		fechaCaducidad = this.getTextFechaCaducidad().getValue().toString();
		cvv = Integer.parseInt(this.getTextCVVTarjeta().getValue().toString());
//		cvv = Integer.parseInt(this.getTextFechaCaducidad().getValue().toString());
		
		bdPrincipal.Registro(nombre, apellidos, correoElectronico, password, passwordRepeat, telefono, pais, localidad, calle, portal, provincia, cp, numeroTarjeta, titular, fechaCaducidad, cvv, null);
	}
}