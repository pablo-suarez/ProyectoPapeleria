package com.tiendapapelera.Tienda.interfeceService;

import java.util.List;
import java.util.Optional;

import com.tiendapapelera.Tienda.model.Producto;

public interface IProductoService {
	public List<Producto> listar();
	public Optional<Producto>listarId(long id);
	public long save(Producto p);
	public void delete(long id);
}
