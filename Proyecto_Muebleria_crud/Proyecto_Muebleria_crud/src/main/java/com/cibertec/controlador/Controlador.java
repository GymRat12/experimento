package com.cibertec.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.InterfaceService.IProdctoService;
import com.cibertec.modelo.Productos;



@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IProdctoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Productos>Productos=service.listar();
		model.addAttribute("Productos",Productos);
		return "index";
	}

	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("Productos",new Productos());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Productos p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{idProducto}")
	public String editar(@PathVariable int idProducto,  Model model) {
		Optional<Productos>Productos=service.listarId(idProducto);
		model.addAttribute("Productos",Productos);
		return "form";
	}
	
	@GetMapping("/eliminar/{idProducto}")
	public String delete(@PathVariable int idProducto,  Model model) {
		service.delete(idProducto);
		return "redirect:/listar";
	}
}
