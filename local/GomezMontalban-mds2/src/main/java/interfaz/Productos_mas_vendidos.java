package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import basededatos.Producto;
import vistas.VistaProductosMasVendidos;

public class Productos_mas_vendidos extends VistaProductosMasVendidos {
	public Cibernauta_común _cibernauta_común;
	public Filtrar_por_categoria _filtrar_por_categoria;
	public producto_mas_vendido _producto_mas_vendido;
	
	
	
	public Producto[] cargar_productos_mas_vendidos() throws PersistentException{
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_productos_mas_vendidos();
	}
}