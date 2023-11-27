package com.cibertec.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.modelo.Productos;

@Repository
public interface IProductos extends CrudRepository<Productos, Integer>{

}
