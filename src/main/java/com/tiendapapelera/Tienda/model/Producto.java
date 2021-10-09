package com.tiendapapelera.Tienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@Column(name="codigo_producto")
	private long Codigo;
	
	@Column(name="ivacompra")
	private double IVA;
	
	@Column(name="nitproveedor")
	private long nitProveedor;
	
	@Column(name="nombre_producto")
	private String Nombre;
	
	@Column(name="precio_compra")
	private double precioCompra;
	
	@Column(name="precio_venta")
	private double precioVenta;
	
	public Producto() {
		
	}
	public Producto(long codigo, double IVA, long nitProveedor, String nombre, double precioCompra, double precioVenta) {
		super();
		Codigo = codigo;
		this.IVA = IVA;
		this.nitProveedor = nitProveedor;
		Nombre = nombre;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}
	public long getCodigo() {
		return Codigo;
	}
	public void setCodigo(long codigo) {
		Codigo = codigo;
	}
	public double getIVA() {
		return IVA;
	}
	public void setIVA(double IVA) {
		this.IVA = IVA;
	}
	public long getNitPorveedor() {
		return nitProveedor;
	}
	public void setNitPorveedor(long nitProveedor) {
		this.nitProveedor = nitProveedor;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
	
}
