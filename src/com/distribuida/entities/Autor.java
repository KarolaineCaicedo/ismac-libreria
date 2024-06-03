package com.distribuida.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Autor {
	
//ATRIBUTOS DE LA CLASE AUTOR
	private int idAutor;
	private String nombre;
	private String apellido;
	private String pais;
	private String telefono;
	private String correo;
	public Autor(int idAutor, String nombre, String apellido, String pais, String telefono, String correo) {
		
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
		this.telefono = telefono;
		this.correo = correo;
	}
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais
				+ ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	
}
