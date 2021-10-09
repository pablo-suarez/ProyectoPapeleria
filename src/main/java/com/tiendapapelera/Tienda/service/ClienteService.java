package com.tiendapapelera.Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendapapelera.Tienda.interfaces.ICliente;
import com.tiendapapelera.Tienda.interfeceService.IClienteService;
import com.tiendapapelera.Tienda.model.Cliente;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private ICliente data;

	@Override
	public List<Cliente> listar() {
		return (List<Cliente>)data.findAll();
	}

	@Override
	public Optional<Cliente> listarId(long Cedula) {
		return data.findById(Cedula);
	}

	@Override
	public long save(Cliente p) {
		int res = 0;
		Cliente cliente=data.save(p);
		if(!cliente.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void delete(long Cedula) 
	{
		data.deleteById(Cedula);
	}
	
}
