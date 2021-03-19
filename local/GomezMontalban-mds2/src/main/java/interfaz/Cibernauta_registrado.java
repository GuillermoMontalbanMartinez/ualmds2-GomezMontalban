package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cibernauta_registrado extends Cibernauta_común {
	public Banner_registrado _banner_registrado;
	public HorizontalLayout banner;
	public VerticalLayout layout;
	public Cibernauta_registrado() {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		_banner_registrado = new Banner_registrado();
		banner = this.getBanner();
		banner.add(_banner_registrado);
		
		_banner_registrado.getCorreo().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado._correo_usuario);
				
			}
		});
		
		_banner_registrado.getPerfil().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado._administrar_perfil);
				
			}
		});
		
		_banner_registrado._administrar_perfil.getUltimasComprasRealizadas().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado._administrar_perfil._ver_ultimas_compras);
				
			}
		});
		
		_banner_registrado._administrar_perfil.getSeguimientoPedidos().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado._administrar_perfil._seguimiento_del_pedido);
				
			}
		});
		
		_banner_registrado._administrar_perfil.getModificarDatosPersonales().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado._administrar_perfil._modificar_datos_personales);
				
			}
		});

		_banner_registrado._administrar_perfil.getDarBajaCuenta().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado._administrar_perfil._dar_de_baja_usuario);
				
			}
		});
		
		_banner_registrado._administrar_perfil.getCerrarSesion().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout.removeAll();
				layout.add(_banner_registrado._administrar_perfil._cerrar_sesion);
				
			}
		});
	
		
		
	}
	
}