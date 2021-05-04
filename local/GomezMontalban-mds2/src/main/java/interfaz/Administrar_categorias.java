package interfaz;


import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import vistas.VistaAdministrarCategorias;

public class Administrar_categorias extends VistaAdministrarCategorias {
	public Banner_admin banner_admin;
	public BDPrincipal bd;
	public String nombreCategoria;
	int idCategoria;
	Select<Categoria> select = new Select<>();
	
	
	public Administrar_categorias() {
		this.getVaadinButtonAceptarAlta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Alta_categoria();
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		});
		
		this.getVaadinButtonAceptarBaja().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Baja_categoria();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		select.setItemLabelGenerator(Categoria::getNombre);
		try {
			select.setItems(this.cargar_categoria());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getLayoutSelectBajasCategorias().add(select);
		
	}
	

	public void Alta_categoria() throws PersistentException {
		bd = new BDPrincipal();
		nombreCategoria = this.getTextCategoria().getValue().toString();
		bd.alta_categorias(nombreCategoria);
		
	}

	public void Baja_categoria() throws PersistentException {
		bd = new BDPrincipal();
		nombreCategoria = this.getTextCategoria().getValue().toString();
		bd.baja_categoria(nombreCategoria);
	}


	public Banner_admin get_banner_admin() {
		return banner_admin;
	}

	public void set_banner_admin(Banner_admin _banner_admin) {
		this.banner_admin = _banner_admin;
	}
	
	public Categoria[] cargar_categoria() throws PersistentException {
		bd = new BDPrincipal();
		return bd.cargar_categoria();
	}
}