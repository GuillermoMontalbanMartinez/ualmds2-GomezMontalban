package basededatos;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Compra_enviada;

public class Compras_enviadas {
	public BDPrincipal _db_main_compras_enviadas;
	public Vector<Compra_enviada> _contiene_compras_enviadas = new Vector<Compra_enviada>();

	public Compra_enviada[] cargar_compras_enviadas() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
		List idsComprasEnviadas = null;
		Compra_enviada[] comprasEnviadas = null;
		try {
			idsComprasEnviadas = basededatos.Compra_enviadaDAO.queryCompra_enviada(null, null);
			comprasEnviadas = new Compra_enviada[idsComprasEnviadas.size()];
			
			for (int i = 0; i < comprasEnviadas.length; i++) {
				comprasEnviadas[i] = (Compra_enviada) idsComprasEnviadas.get(i);
			}
			pt.commit();
		} catch (Exception e) {
			pt.rollback();
		}
		
		return comprasEnviadas;
	}
	

	public void Enviar_producto(int aId_compra) {
		throw new UnsupportedOperationException();
	}
	

}