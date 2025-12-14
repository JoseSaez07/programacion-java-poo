package com.josesaez.poo.redsocial;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Publicacion {
private String texto;
private LocalDateTime hora;
private int likes;
	public static void main(String[] args) {
	}
	public Publicacion() {
		super();
	}
	public Publicacion(String texto) {
		super();
		this.texto = texto;
		this.hora = LocalDateTime.now();
		this.likes = 0;
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
		System.out.printf("'%s',  publicado a las %s,  tiene %d likes.%n",this.texto, this.hora.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),this.likes);
	}
	public void darMegusta() {
		this.likes++;
	}

}
