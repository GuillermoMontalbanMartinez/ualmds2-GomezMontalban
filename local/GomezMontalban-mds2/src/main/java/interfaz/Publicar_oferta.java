package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Oferta;
import vistas.VistaPublicarOferta;

public class Publicar_oferta extends VistaPublicarOferta {
	public Administrar_ofertas _administrar_ofertas;
	public BDPrincipal bd;
	public double descuento;
	public String fechaLimite;
	Select<Oferta> select = new Select<>();
	
	public Publicar_oferta() {
//		this.getButtonPublicarOferta().addClickListener(new ComponentEventListener() {
//			@Override
//			public void onComponentEvent(ComponentEvent event) {
//				try {
//					Alta_oferta();
//				} catch (PersistentException e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		
		//select.setItemLabelGenerator(Oferta::getId_ofertas()); -- Tiene que ser de tipo String no hay forma
		
		
//		select.setItemLabelGenerator(Categoria::getNombre);
//		try {
//			select.setItems(this.cargar_categoria());
//		} catch (PersistentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		this.getLayoutSelectBajasCategorias().add(select);
		
	}

	public void Alta_oferta() {
		bd = new BDPrincipal();
		descuento = Double.parseDouble(this.getTextDescuentoOferta().getValue().toString());
		fechaLimite = this.getTextFechaLimiteOfertaProducto().getValue().toString();
		bd.Alta_oferta_producto(0, descuento, fechaLimite);
	}
}
