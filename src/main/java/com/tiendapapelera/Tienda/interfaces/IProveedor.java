package com.tiendapapelera.Tienda.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiendapapelera.Tienda.model.Proveedor;

@Repository
public interface IProveedor extends CrudRepository<Proveedor, Long>{

}
