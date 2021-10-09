package com.tiendapapelera.Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendapapelera.Tienda.interfaces.IUsuario;
import com.tiendapapelera.Tienda.interfeceService.IUsuarioService;
import com.tiendapapelera.Tienda.model.Usuario;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuario data;

	@Override
	public List<Usuario> listar() {
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int Cedula) {
		return data.findById(Cedula);
	}

	@Override
	public int save(Usuario p) {
		int res = 0;
		Usuario persona=data.save(p);
		if(!persona.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void delete(int Cedula) 
	{
		data.deleteById(Cedula);
	}

}
