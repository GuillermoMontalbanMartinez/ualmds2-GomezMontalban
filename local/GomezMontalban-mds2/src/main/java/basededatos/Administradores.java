package basededatos;

import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Administrador;

public class Administradores {
	public BDPrincipal _bd_main_administradores;
	public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

	public void Alta_cuenta(String aNombre, String aCorreo, String aContrasena, int aTipoDeUsuario, String apellidos) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();		
		Date fecha = new Date();
		
		try {

			switch (aTipoDeUsuario) {
			
			case 0:
				Administrador ad = basededatos.AdministradorDAO.createAdministrador();
				ad.setNombre(aNombre);
				ad.setCorreo_electronico(aCorreo);
				ad.setContrasena(aContrasena);
				ad.setFecha_creacion_usuario(fecha.toString());
				ad.setApellidos(apellidos);
				break;

			case 1:
				Empresa_de_transportes et = basededatos.Empresa_de_transportesDAO.createEmpresa_de_transportes();
				et.setNombre(aNombre);
				et.setCorreo_electronico(aCorreo);
				et.setContrasena(aContrasena);
				et.setFecha_creacion_usuario(fecha.toString());
				et.setApellidos(apellidos);

			
			case 2:
				Encargado_de_compras ec = basededatos.Encargado_de_comprasDAO.createEncargado_de_compras();
				ec.setNombre(aNombre);
				ec.setCorreo_electronico(aCorreo);
				ec.setContrasena(aContrasena);
				ec.setFecha_creacion_usuario(fecha.toString());
				ec.setApellidos(apellidos);

				


			default:
				break;
			}
						
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
					
	}

	public void Baja_cuenta(String aCorreo, int aTipoDeUsuario, int aId_usuario) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
		try {

			switch (aTipoDeUsuario) {
			
			case 0:
				Administrador ad = basededatos.AdministradorDAO.loadAdministradorByORMID(aId_usuario);
				basededatos.AdministradorDAO.delete(ad);
				break;

			case 1:
				Empresa_de_transportes et = basededatos.Empresa_de_transportesDAO.loadEmpresa_de_transportesByORMID(aId_usuario);
				basededatos.Empresa_de_transportesDAO.delete(et);
			
			case 2:
				Encargado_de_compras ec = basededatos.Encargado_de_comprasDAO.loadEncargado_de_comprasByORMID(aId_usuario);
				basededatos.Encargado_de_comprasDAO.delete(ec);


			default:
				break;
			}
						
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}
}