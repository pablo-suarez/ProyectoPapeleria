package com.tiendapapelera.Tienda.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name="ventas")
public class Venta {
	
	private int Codigo;
	private int cedulaCliente;
	private int cedulaUsuario;
	private double IVA;
	private double Total;
	private double Valor;
	
	
}
