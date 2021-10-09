package com.tiendapapelera.Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendapapelera.Tienda.interfaces.IProveedor;
import com.tiendapapelera.Tienda.interfeceService.IProveedorService;
import com.tiendapapelera.Tienda.model.Proveedor;


@Service
public class ProveedorService implements IProveedorService{

	@Autowired
	private IProveedor data;

	@Override
	public List<Proveedor> listar() {
		return (List<Proveedor>)data.findAll();
	}

	@Override
	public Optional<Proveedor> listarId(long NIT) {
		return data.findById(NIT);
	}

	@Override
	public long save(Proveedor p) {
		int res = 0;
		Proveedor proveedor=data.save(p);
		if(!proveedor.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void delete(long NIT) 
	{
		data.deleteById(NIT);
	}
	
}
