package com.tiendapapelera.Tienda.interfeceService;

import java.util.List;
import java.util.Optional;

import com.tiendapapelera.Tienda.model.Proveedor;

public interface IProveedorService {
	public List<Proveedor> listar();
	public Optional<Proveedor>listarId(long id);
	public long save(Proveedor p);
	public void delete(long id);
}
