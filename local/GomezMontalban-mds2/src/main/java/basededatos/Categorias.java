package basededatos;

import java.util.Vector;
import basededatos.Categoria;

public class Categorias {
	public BDPrincipal _db_main_categorias;
	public Vector<Categoria> _contiene_categorias = new Vector<Categoria>();

	public void baja_categoria(int aId_categoria) {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_lista_categorias() {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_categorias_catalogo() {
		throw new UnsupportedOperationException();
	}
}