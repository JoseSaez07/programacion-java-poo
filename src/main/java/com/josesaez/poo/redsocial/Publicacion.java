package com.josesaez.poo.redsocial;
import java.time.LocalDateTime;
public class Publicacion {
private String Texto;
private LocalDateTime hora;
private int likes;
	public static void main(String[] args) {
	}
	public Publicacion() {
		super();
	}
	public Publicacion(String texto, LocalDateTime hora, int likes) {
		super();
		Texto = texto;
		this.hora = hora;
		this.likes = likes;
	}
	public String getTexto() {
		return Texto;
	}
	public void setTexto(String texto) {
		Texto = texto;
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
		
	}
	

}
