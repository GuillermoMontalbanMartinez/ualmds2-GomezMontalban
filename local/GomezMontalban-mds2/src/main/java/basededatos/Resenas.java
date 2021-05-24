package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Resena;

public class Resenas {
	public BDPrincipal _db_main_resenas;
	public Vector<Resena> _contiene_resenas = new Vector<Resena>();

	public Resena[] cargar_resenas(int idPRoducto) throws PersistentException {
		Resena[] resenas = basededatos.ResenaDAO.listResenaByQuery(null, null);
		ArrayList<Resena> r = new ArrayList<Resena>();
		
		for(Resena resena : resenas) {
			if(resena.getEsta_asociados_a_un_producto().getORMID() == idPRoducto) {
				r.add(resena);
			}
		}
		
		Resena resultado[] = new Resena[r.size()];

		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = (Resena) r.get(i);
		}
		
		return resultado;
		
	}

	public void publicar(int aValoracion, String aCuerpo, int aId_producto, int aId_usuario) throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			

			Resena r = basededatos.ResenaDAO.createResena();
			Producto p = basededatos.ProductoDAO.loadProductoByORMID(aId_producto);
			Cibernauta_registrado cb = Cibernauta_registradoDAO.loadCibernauta_registradoByORMID(aId_usuario);
			r.setComentario(aCuerpo);
			r.setValoracion(aValoracion);
			r.setEsta_asociados_a_un_producto(p);
			r.setEsta_asociada_a_un_cibernauta_registrado(cb);
			basededatos.ResenaDAO.save(r);
			
			pt.commit();
		} catch (PersistentException e) {
			pt.rollback();
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}
	
}