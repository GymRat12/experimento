package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.InterfaceService.IProdctoService;
import com.cibertec.interfaces.IProductos;
import com.cibertec.modelo.Productos;

@Service
public class ProductoService implements IProdctoService{
	
	@Autowired
	private IProductos data;

	@Override
	public List<Productos> listar() {
		
		return (List<Productos>)data.findAll();
	}

	@Override
	public Optional<Productos> listarId(int idProducto) {
		
		return data.findById(idProducto);
	}

	@Override
	public int save(Productos p) {
		int res=0;
		Productos Productos=data.save(p);
		if(!Productos.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idProducto) {
		data.deleteById(idProducto);
		
	}

	
}
