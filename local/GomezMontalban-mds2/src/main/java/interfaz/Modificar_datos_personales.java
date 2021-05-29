package interfaz;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.json.JSONObject;
import org.orm.PersistentException;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HtmlComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.Cibernauta_registrado;
import basededatos.Producto;
import elemental.json.Json;
import src.net.dv8tion.Uploader;
import vistas.VistaModificarDatosPersonales;

public class Modificar_datos_personales extends VistaModificarDatosPersonales {
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
	public Integer cvv;
	public String src;
	public String value = "";
	public int id;
	MultiFileMemoryBuffer buffer = new MultiFileMemoryBuffer();
	Div output = new Div();

	public Modificar_datos_personales() {

		this.getTextGuardarCambios().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					modificar_datos_personales();
					Notification.show("Datos modificados");
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});


		

	}

	public void modificar_datos_personales() throws PersistentException {
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

		titular = this.getVistaDatosDePago().getTextTitularTarjeta().getValue().toString();
		numeroTarjeta = this.getVistaDatosDePago().getTextNumeroTarjeta().getValue().toString();
		try{
			fechaCaducidad = this.getVistaDatosDePago().getTextFechaCaducidad().getValue().toString();
		}catch(Exception e) {
			fechaCaducidad=null;
		}
		cvv = Integer.parseInt(this.getVistaDatosDePago().getTextCVVTarjeta().getValue().toString());

		bdPrincipal._db_cibernautas_registrados.modificar_datos_personales(nombre, apellidos, correoElectronico,
				password, passwordRepeat, telefono, pais, localidad, calle, portal, provincia, cp, titular,
				numeroTarjeta, fechaCaducidad, cvv, src, id);
	}


	private void showOutput(String text, Component content, HasComponents outputContainer) {
		HtmlComponent p = new HtmlComponent(Tag.P);
		p.getElement().setText(text);
		outputContainer.add(p);
		outputContainer.add(content);
	}


	public void setUsuario(int id) throws PersistentException {
		Cibernauta_registrado cib = basededatos.Cibernauta_registradoDAO.loadCibernauta_registradoByORMID(id);
		this.id = id;
		this.getTextNombreDeUsuario().setValue(cib.getNombre());
		this.getTextApellidos().setValue(cib.getApellidos());
		this.getTextCorreo().setValue(cib.getCorreo_electronico());
		this.getTextTelefono().setValue(cib.getTelefono());
		this.getTextPassword().setValue(cib.getContrasena());
		this.getTextRepeatPassword().setValue(cib.getContrasena());
		this.getTextPais().setValue(cib.getPais());
		this.getTextLocalidad().setValue(cib.getLocalidad());
		this.getTextCalle().setValue(cib.getCalle());
		this.getTextPortal().setValue(cib.getPortal());
		this.getTextProvincia().setValue(cib.getProvincia());
		this.getTextCogidoPostal().setValue(String.valueOf(cib.getCp()));
		this.getVistaDatosDePago().getTextTitularTarjeta().setValue(cib.getNombre_titular_tarjeta());
		this.getVistaDatosDePago().getTextNumeroTarjeta().setValue(cib.getNumero_tarjeta_credito());
		this.getVistaDatosDePago().getTextFechaCaducidad().setName(String.valueOf(cib.getFecha_caducidad()));
		this.getVistaDatosDePago().getTextCVVTarjeta().setValue(String.valueOf(cib.getCvv()));

	}

}