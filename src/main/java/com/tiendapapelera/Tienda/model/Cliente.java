package com.tiendapapelera.Tienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@Column(name="cedula_cliente")
	private long Cedula;
	
	@Column(name="direccion_cliente")
	private String Direccion;
	
	@Column(name="email_cliente")
	private String Correo;
	
	@Column(name="nombre_cliente")
	private String Nombre;
	
	@Column(name="telefono_cliente")
	private String Telefono;
	
	
	
	public Cliente() {
		
	}
	public Cliente(long cedula, String direccion, String correo, String nombre, String telefono) {
		super();
		Cedula = cedula;
		Direccion = direccion;
		Correo = correo;
		Nombre = nombre;
		Telefono = telefono;
	}
	public long getCedula() {
		return Cedula;
	}
	public void setCedula(long cedula) {
		Cedula = cedula;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	
}
