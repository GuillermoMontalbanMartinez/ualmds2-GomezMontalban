package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;

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

	public void publicar(int aValoracion, String aCuerpo, int aId_producto) {
		throw new UnsupportedOperationException();
	}
}