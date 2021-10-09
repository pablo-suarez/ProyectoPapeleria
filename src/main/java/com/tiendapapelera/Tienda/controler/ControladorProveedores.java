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

import com.tiendapapelera.Tienda.interfeceService.IProveedorService;
import com.tiendapapelera.Tienda.model.Proveedor;



@Controller
@RequestMapping
public class ControladorProveedores {
	
	@Autowired
	private IProveedorService service;
	
	@GetMapping("/listarProveedores")
	public String listar(Model model)
	{
		List<Proveedor> proveedores=service.listar();
		//for(int i=0; i<personas.size(); i++)
		//{
		//	System.out.println(personas.get(i).getCedula());
		//}
		model.addAttribute("proveedores",service.listar());
		return "indexProveedores";
	}
	
	@GetMapping("/newProveedor")
	public String agregar(Model model)
	{
		model.addAttribute("proveedor", new Proveedor());
		return "formProveedor";
	}
	
	@PostMapping("/saveProveedor")
	public String save(@Validated Proveedor p, Model model)
	{
		service.save(p);
		return "redirect:/listarProveedores";
	}
	
	@GetMapping("/editarProveedor/{NIT}")
	public String editar(@PathVariable long NIT, Model model)
	{
		Optional<Proveedor> proveedor = service.listarId(NIT);
		model.addAttribute("proveedor", proveedor);
		return "formProveedor";
	}
	
	@GetMapping("/eliminarProveedor/{NIT}")
	public String delete(Model model, @PathVariable long NIT)
	{
		service.delete(NIT);
		return "redirect:/listarProveedores";
	}

}
