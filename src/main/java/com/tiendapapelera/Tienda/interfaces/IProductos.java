package com.tiendapapelera.Tienda.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiendapapelera.Tienda.model.Producto;

@Repository
public interface IProductos extends CrudRepository<Producto, Long>{

}
