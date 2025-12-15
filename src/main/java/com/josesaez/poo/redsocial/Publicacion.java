package com.josesaez.poo.redsocial;
import java.time.LocalDateTime;
public class Publicacion {
private String texto;
private LocalDateTime hora;
private int likes;
	public static void main(String[] args) {
	}
	public Publicacion() {
		super();
	}
	public Publicacion(String texto, LocalDateTime hora, int likes) {
		super();
		this.texto = texto;
		this.hora = hora;
		this.likes = likes;
	}
	public String getTexto() {
		return texto;
	}
	public LocalDateTime getHora() {
		return hora;
	}
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public void mostrar() {
		System.out.println(this.texto);
		System.out.println(this.likes);
		System.out.println(this.hora);
	}
	public void darMegusta(int likes) {
		this.likes++;
	}
public int verMegusta() {
	return this.likes;
}
public void setTexto(String titulo) {
	// TODO Auto-generated method stub
	
}
}
