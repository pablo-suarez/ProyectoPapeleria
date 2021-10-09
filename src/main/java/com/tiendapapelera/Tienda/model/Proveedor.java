package com.tiendapapelera.Tienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedor {
	
	@Id
	@Column(name="nitproveedor")
	private long NIT;
	
	@Column(name="ciudad_proveedor")
	private String Ciudad;
	
	@Column(name="direccion_proveedor")
	private String Direccion;
	
	@Column(name="nombre_proveedor")
	private String Nombre;
	
	@Column(name="telefono_proveedor")
	private String Telefono;
	
	
	
	public Proveedor() {
		
	}
	public Proveedor(long NIT, String ciudad, String direccion, String nombre, String telefono) {
		super();
		this.NIT = NIT;
		Ciudad = ciudad;
		Direccion = direccion;
		Nombre = nombre;
		Telefono = telefono;
	}
	public long getNIT() {
		return NIT;
	}
	public void setNIT(long NIT) {
		this.NIT = NIT;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
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
