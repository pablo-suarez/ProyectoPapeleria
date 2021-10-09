package com.tiendapapelera.Tienda.controler;

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

import com.tiendapapelera.Tienda.interfeceService.IProductoService;
import com.tiendapapelera.Tienda.model.Producto;

@Controller
@RequestMapping
public class ControladorProductos {
	
	@Autowired
	private IProductoService service;
	
	@GetMapping("/listarProductos")
	public String listar(Model model)
	{
		List<Producto> productos=service.listar();
		//for(int i=0; i<personas.size(); i++)
		//{
		//	System.out.println(personas.get(i).getCedula());
		//}
		model.addAttribute("productos",service.listar());
		return "indexProductos";
	}
	
	@GetMapping("/newProducto")
	public String agregar(Model model)
	{
		model.addAttribute("producto", new Producto());
		return "formProducto";
	}
	
	@PostMapping("/saveProducto")
	public String save(@Validated Producto p, Model model)
	{
		service.save(p);
		return "redirect:/listarProductos";
	}
	
	@GetMapping("/editarProducto/{Codigo}")
	public String editar(@PathVariable long Codigo, Model model)
	{
		Optional<Producto> producto = service.listarId(Codigo);
		model.addAttribute("producto", producto);
		return "formProducto";
	}
	
	@GetMapping("/eliminarProducto/{Codigo}")
	public String delete(Model model, @PathVariable long Codigo)
	{
		service.delete(Codigo);
		return "redirect:/listarProductos";
	}

}
