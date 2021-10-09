package com.tiendapapelera.Tienda.interfeceService;

import java.util.List;
import java.util.Optional;

import com.tiendapapelera.Tienda.model.Cliente;


public interface IClienteService {
	public List<Cliente> listar();
	public Optional<Cliente>listarId(long id);
	public long save(Cliente p);
	public void delete(long id);
}
