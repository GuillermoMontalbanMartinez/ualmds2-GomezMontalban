package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import vistas.VistaEscribirResenaProducto;

public class Escribir_reseña extends VistaEscribirResenaProducto {
	public Producto_comprado_recientemente _producto_comprado_recientemente;

	Select<String> select = new Select<>();
	String value = "";

	private int idProducto;

	private int idUsuario;

	public Escribir_reseña(int idProducto, int idUsuario) {
		
		this.idProducto = idProducto;
		this.idUsuario = idUsuario;
		
		select.setItems("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		this.getSelectLayout().add(select);

		select.addValueChangeListener(event -> {
			if (event.getValue() != null) {
				value = event.getValue().toString();
			}
		});
		
		this.getPublicarButton().addClickListener(e ->{
			try {
				publicar();
			} catch (PersistentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

	}

	public void publicar() throws PersistentException{
		BDPrincipal bd = new BDPrincipal();
System.out.println(Integer.parseInt(value) + " "+ this.getCuerpoText().getValue()+ " "+ idProducto+ " "+ idUsuario);
		bd.publicar(Integer.parseInt(value), this.getCuerpoText().getValue(), idProducto, idUsuario);
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;

	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;

	}
}