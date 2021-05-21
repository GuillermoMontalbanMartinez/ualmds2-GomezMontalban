package com.example.test;

import interfaz.*;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.theme.material.*;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_registrado;

import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

@Route
@PWA(name = "Vaadin Application", shortName = "Vaadin App", description = "This is an example Vaadin application.", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
@Theme(value = Lumo.class, variant = Lumo.DARK)
// @Theme(value = Material.class, variant = Material.DARK)

public class MainView extends VerticalLayout {

	public MainView(@Autowired GreetService service) {
		Cibernauta cibernauta = new Cibernauta();
		add(cibernauta);
		login(cibernauta);
		
	}

	public void login(Cibernauta cibernauta) {
		
		cibernauta.inicio_sesion.getCancelarB().addClickListener(t -> {
			volver_a_principal(cibernauta);
		});
		
		cibernauta._banner_no_registrado.getGetPrincipal().addClickListener(t -> {
			volver_a_principal(cibernauta);
		});
		
		cibernauta.inicio_sesion.getVaadinLoginFormLoginInicioDeSesion().addForgotPasswordListener(e ->{
			Notification.show("AA");
			Cibernauta cb = new Cibernauta();
			removeAll();
			
		});
		
		cibernauta.inicio_sesion.getVaadinLoginFormLoginInicioDeSesion().addLoginListener(e -> {
			
			String usuario = e.getUsername();
			String password = e.getPassword();
			int id = -1;
			BDPrincipal c = new BDPrincipal();
			try {

				id = c.login(usuario, password);

				switch (id) {
				case 0:
					Administrador admin = new Administrador();

					admin.banner_admin.cerrar_sesion_admin.getVaadinButtonCerrarSesion().addClickListener(t -> {
						cerrar_sesion(admin, cibernauta);
					});

					admin.banner_admin.getVaadinButtonPrincipal().addClickListener(t -> {
						volver_a_principal(admin);
					});

					remove(cibernauta);
					add(admin);
					break;

				case 1:
					Empresa_de_transportes et = new Empresa_de_transportes();
					
					et.getButtonCerrarSesion().addClickListener( t -> {
						cerrar_sesion(et, cibernauta);
					});
					
					et.pedidos_a_entregar.getButtonCerrarSesion().addClickListener( t -> {
						volver_a_principal(et);
					});
					
					et.pedidos_entregados.getButtonCerrarSesion().addClickListener(t -> {
						volver_a_principal(et);
					});
					remove(cibernauta);
					add(et);

					break;

				case 2:
					Encargado_de_compras ec = new Encargado_de_compras();
					ec._compras_a_enviar.getButtonCerrarSesion().addClickListener(t -> {
						inicioEncargadoDeCompras(ec);
					});
					
					ec._compras_enviadas.getButtonCerrarSesion().addClickListener(t -> {
						inicioEncargadoDeCompras(ec);
					});
					
					ec.getButtonCerrarSesion().addClickListener(t -> {
						cerrar_sesion(ec, cibernauta);
					});
					
					
					remove(cibernauta);
					add(ec);

					break;

				case 3:
					Cibernauta_registrado registrado = new Cibernauta_registrado();
					registrado.setUsuario(usuario);
					registrado._banner_registrado._administrar_perfil._cerrar_sesion.getCerrarSesionBoton()
							.addClickListener(t -> {
								cerrar_sesion(registrado, cibernauta);
							});

					registrado._banner_registrado.getPrincipalButton().addClickListener(event ->{
						volver_a_principal(registrado);
					});
					remove(cibernauta);
					add(registrado);

					
					
					
					

					break;
				default:

					cibernauta.inicio_sesion.getVaadinLoginFormLoginInicioDeSesion().setError(true);
					break;
				}
				
				

			} catch (PersistentException e1) {
				e1.printStackTrace();
			}

		});
		
		

	}

	// Esto esta fallando
	public void inicioEncargadoDeCompras(Encargado_de_compras ec) {
		Encargado_de_compras encargadoDeCompras = new Encargado_de_compras();
		encargadoDeCompras.getButtonCerrarSesion().addClickListener(t -> {
			inicioEncargadoDeCompras(ec);
		});
		remove(ec);
		add(encargadoDeCompras);
	
	}

	public void cerrar_sesion(Component comp, Cibernauta c) {
		c = new Cibernauta();
		removeAll();
		add(c);
		login(c);
	}
	
	public void volver_a_principal(Empresa_de_transportes et) {
		Empresa_de_transportes empresaDeTransportes = new Empresa_de_transportes();
		Cibernauta cibernauta = new Cibernauta();
		
		empresaDeTransportes.getVaadinButtonPedidosAEntregar().addClickListener( t -> {
			volver_a_principal(empresaDeTransportes);
		});
		
		remove(et);
		add(empresaDeTransportes);
		
	}

	public void volver_a_principal(Administrador c) {
		Administrador admin = new Administrador();
		Cibernauta cibernauta = new Cibernauta();

		admin.banner_admin.getVaadinButtonPrincipal().addClickListener(t -> {
			volver_a_principal(admin);
		});

		remove(c);
		add(admin);

		login(cibernauta);
		admin.banner_admin.cerrar_sesion_admin.getVaadinButtonCerrarSesion().addClickListener(t -> {

			cerrar_sesion(c, cibernauta);
		});
	}
	
	public void volver_a_principal(Cibernauta c) {
		Cibernauta cibernauta = new Cibernauta();
		cibernauta.inicio_sesion.getCancelarB().addClickListener(t -> {
			volver_a_principal(cibernauta);
		});

		remove(c);
		add(cibernauta);

		login(cibernauta);
	}
	
	
	public void volver_a_principal(Cibernauta_registrado c) {
		Cibernauta_registrado registrado = new Cibernauta_registrado();
		Cibernauta cibernauta = new Cibernauta();

		try {
			registrado.setUsuario(c.getUsuario());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		registrado._banner_registrado.getPrincipalButton().addClickListener(t -> {
			volver_a_principal(registrado);
		});

		remove(c);
		add(registrado);

		login(cibernauta);
		registrado._banner_registrado._administrar_perfil._cerrar_sesion.getCerrarSesionBoton().addClickListener(t -> {

			cerrar_sesion(c, cibernauta);
		});
	}
	
}
