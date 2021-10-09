package com.tiendapapelera.Tienda.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiendapapelera.Tienda.model.Usuario;


@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
