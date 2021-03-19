package interfaz;

import vistas.VistaAdministrarPerfil;

public class Administrar_perfil extends VistaAdministrarPerfil {
	public Banner_registrado _banner_registrado;
	public Cerrar_sesion _cerrar_sesion;
	public Dar_de_baja_usuario _dar_de_baja_usuario;
	public Modificar_datos_personales _modificar_datos_personales;
	public Seguimiento_del_pedido _seguimiento_del_pedido;
	public Ver_ultimas_compras _ver_ultimas_compras;
	
	public Administrar_perfil() {
		_cerrar_sesion = new Cerrar_sesion();
		_dar_de_baja_usuario = new Dar_de_baja_usuario();
		_modificar_datos_personales = new Modificar_datos_personales();
		_seguimiento_del_pedido = new Seguimiento_del_pedido();
		_ver_ultimas_compras = new Ver_ultimas_compras();
		}
}