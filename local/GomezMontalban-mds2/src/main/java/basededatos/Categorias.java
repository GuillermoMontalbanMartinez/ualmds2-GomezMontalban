package basededatos;

import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import basededatos.Categoria;

public class Categorias {
	public BDPrincipal _db_main_categorias;
	public Vector<Categoria> _contiene_categorias = new Vector<Categoria>();

	public void baja_categoria(int aId_categoria) {
		try {
			PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
			Categoria categorias = basededatos.CategoriaDAO.loadCategoriaByORMID(aId_categoria);
			basededatos.CategoriaDAO.delete(categorias);
			t.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Categoria[] cargar_lista_categorias() {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_categorias_catalogo() {
		throw new UnsupportedOperationException();
	}
}