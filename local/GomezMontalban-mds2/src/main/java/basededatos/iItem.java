package basededatos;

import java.util.ArrayList;

import org.orm.PersistentException;

public interface iItem {

	public ArrayList<Item> cargar_productos_seleccionados(int aId_usuario) throws PersistentException;
}