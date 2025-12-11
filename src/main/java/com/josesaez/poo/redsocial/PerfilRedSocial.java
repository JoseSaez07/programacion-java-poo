package com.josesaez.poo.redsocial;

import java.util.ArrayList;

public class PerfilRedSocial {
	private String ususario;
	private String nombreVisible;
	private String biografia;
	private String paisOciudad;
	private int numeroDeSeguidores;
	private Estado estado;
	private boolean cuentavercificada;
	private ArrayList<Publicacion> publicaciones;

	public String getUsusario() {
		return ususario;
	}

	public PerfilRedSocial() {
		super();
		this.publicaciones = new  ArrayList<Publicacion>();
	}

	public PerfilRedSocial(String ususario, String nombreVisible, String biografia, String paisOciudad,
			int numeroDeSeguidores, Estado estado, boolean cuentavercificada) {
		super();
		this.ususario = ususario;
		this.nombreVisible = nombreVisible;
		this.biografia = biografia;
		this.paisOciudad = paisOciudad;
		this.numeroDeSeguidores = numeroDeSeguidores;
		this.estado = estado;
		this.cuentavercificada = cuentavercificada;
		this.publicaciones = new  ArrayList<Publicacion>();
	}
	
	public ArrayList<Publicacion> getListas() {
		return publicaciones;
	}

	public void setListas(ArrayList<Publicacion> listas) {
		this.publicaciones = listas;
	}

	public void setUsusario(String ususario) {
		this.ususario = ususario;
	}

	public String getNombreVisible() {
		return nombreVisible;
	}

	public void setNombreVisible(String nombreVisible) {
		this.nombreVisible = nombreVisible;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getPaisOciudad() {
		return paisOciudad;
	}

	public void setPaisOciudad(String paisOciudad) {
		this.paisOciudad = paisOciudad;
	}

	public int getNumeroDeSeguidores() {
		return numeroDeSeguidores;
	}

	public void setNumeroDeSeguidores(int numeroDeSeguidores) {
		this.numeroDeSeguidores = numeroDeSeguidores;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public boolean isCuentavercificada() {
		return cuentavercificada;
	}

	public void setCuentavercificada(boolean cuentavercificada) {
		this.cuentavercificada = cuentavercificada;
	}

	public void mostrarInformacion() {
		System.out.println(this.nombreVisible);
	}

	public void añadirSeguidores() {
		this.numeroDeSeguidores += numeroDeSeguidores;
	}

	public void estadoPerfil(Estado estado) {
		this.estado = estado;
	}

	public boolean estaActivo() {
		if (this.cuentavercificada) {
			System.out.println("Esta activo");
		} else {
			System.out.println("Esta desactivada");
		}
		return this.cuentavercificada;
	}

	public void crearPublicacion(String texto) {
    Publicacion m = new Publicacion();
    m.set()
   
	}

	public void listaPublicacion(Publicacion listado) {

	}
}
