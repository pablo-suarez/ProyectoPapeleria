package com.tiendapapelera.Tienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@Column(name = "cedula_usuario")
	private int Cedula;
	
	@Column(name = "nombre_usuario")
	private String Nombre;
	
	@Column(name = "email_usuario")
	private String Correo;
	
	@Column(name = "usuario")
	private String Usuario;
	
	@Column(name = "password")
	private String Clave;
	
	public Usuario()
	{
		
	}

	public Usuario(int cedula, String nombre, String correo, String usuario, String clave) {
		super();
		Cedula = cedula;
		Nombre = nombre;
		Correo = correo;
		Usuario = usuario;
		Clave = clave;
	}

	public int getCedula() {
		return Cedula;
	}

	public void setCedula(int cedula) {
		Cedula = cedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}
	
	
	
	

}
