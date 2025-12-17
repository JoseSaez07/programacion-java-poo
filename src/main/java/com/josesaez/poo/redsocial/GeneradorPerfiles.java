package com.josesaez.poo.redsocial;

public class GeneradorPerfiles {

	public static PerfilRedSocial crearPerfil(String usuario) {
		PerfilRedSocial p = new PerfilRedSocial();
		p.setNombreVisible(usuario);
         return p;
	}
}
