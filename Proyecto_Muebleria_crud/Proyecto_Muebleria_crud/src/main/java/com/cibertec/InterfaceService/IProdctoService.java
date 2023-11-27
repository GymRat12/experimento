package com.cibertec.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.cibertec.modelo.Productos;

public interface IProdctoService {
      public List<Productos>listar();
      public Optional<Productos>listarId(int id);
      public int save(Productos p);
      public void delete(int id);
	
}
