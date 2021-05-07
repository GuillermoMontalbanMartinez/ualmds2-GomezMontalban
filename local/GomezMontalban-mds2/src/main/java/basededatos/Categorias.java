package basededatos;

import java.util.List;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import basededatos.Categoria;

public class Categorias {
	public BDPrincipal _db_main_categorias;
	public Vector<Categoria> _contiene_categorias = new Vector<Categoria>();

	public void baja_categoria(String nombreCategoria) {
		try {
			PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
					.beginTransaction();
			List<Categoria> categorias = basededatos.CategoriaDAO.queryCategoria(null, null);
			for (Categoria categoria : categorias) {
				if (categoria.getNombre().equals(nombreCategoria)) {
					basededatos.CategoriaDAO.delete(CategoriaDAO.getCategoriaByORMID(categoria.getORMID()));
					t.commit();
				}
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void alta_categorias(String nombreCategorias) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
					.beginTransaction();
			Categoria categoria = basededatos.CategoriaDAO.createCategoria();
			categoria.setNombre(nombreCategorias);
			basededatos.CategoriaDAO.save(categoria);
			pt.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

	public Categoria[] cargar_categorias_catalogo() {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_categoria() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		List idsCategoria = null;
		Categoria cat[] = null;
		try {
			idsCategoria = basededatos.CategoriaDAO.queryCategoria(null, null);
			cat = new Categoria[idsCategoria.size()];

			for (int i = 0; i < cat.length; i++) {
				cat[i] = (Categoria) idsCategoria.get(i);
			}
			pt.commit();
		} catch (Exception e) {
			pt.rollback();
		}
		
		return cat;
	}
}