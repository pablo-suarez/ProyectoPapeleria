package com.tiendapapelera.Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendapapelera.Tienda.interfaces.IProductos;
import com.tiendapapelera.Tienda.interfeceService.IProductoService;
import com.tiendapapelera.Tienda.model.Producto;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private IProductos data;

	@Override
	public List<Producto> listar() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarId(long Codigo) {
		return data.findById(Codigo);
	}

	@Override
	public long save(Producto p) {
		int res = 0;
		Producto producto=data.save(p);
		if(!producto.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void delete(long Codigo) 
	{
		data.deleteById(Codigo);
	}
	
}
