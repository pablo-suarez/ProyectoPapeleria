package com.tiendapapelera.Tienda.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiendapapelera.Tienda.model.Cliente;

@Repository
public interface ICliente extends CrudRepository<Cliente, Long>{

}
