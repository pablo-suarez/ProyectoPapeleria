package com.tiendapapelera.Tienda.interfeceService;

import java.util.List;
import java.util.Optional;

import com.tiendapapelera.Tienda.model.Usuario;

public interface IUsuarioService {
	public List<Usuario> listar();
	public Optional<Usuario>listarId(int id);
	public int save(Usuario p);
	public void delete(int id);
}
