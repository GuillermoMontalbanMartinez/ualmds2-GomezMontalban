package basededatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Compra_enviada;

public class Compras_enviadas {
	public BDPrincipal _db_main_compras_enviadas;
	public Vector<Compra_enviada> _contiene_compras_enviadas = new Vector<Compra_enviada>();

	public Compra_enviada[] cargar_compras_enviadas() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
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

	public basededatos.Compra[] cargar_productos_comprados_recientemente(int id_usuario) throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		Compra[] resultado = null;
		try {
			Cibernauta_registrado cb = basededatos.Cibernauta_registradoDAO
					.loadCibernauta_registradoByORMID(id_usuario);
			Compra compras[] = basededatos.CompraDAO.listCompraByQuery(null, null);
			ArrayList<Compra> comprasAsociadas = new ArrayList<Compra>();
			
			for (Compra c : compras) {
				if (c.getTiene_asociado_un_cibernauta_registrado().equals(cb)) {
					if (c.getEstado_compra() != 0) {
						comprasAsociadas.add(c);
					}
				}

			}
			resultado = new Compra[comprasAsociadas.size()];
			for (int i = 0; i < comprasAsociadas.size(); i++) {
				resultado[i] =comprasAsociadas.get(i);
			}
			pt.commit();
			return resultado;
		} catch (Exception e) {
			pt.rollback();
			e.printStackTrace();
			return null;
		}

		
	}

}