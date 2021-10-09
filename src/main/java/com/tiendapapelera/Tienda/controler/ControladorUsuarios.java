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

import com.tiendapapelera.Tienda.interfeceService.IUsuarioService;
import com.tiendapapelera.Tienda.model.Usuario;

@Controller
@RequestMapping
public class ControladorUsuarios {
	
	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/listar")
	public String listar(Model model)
	{
		List<Usuario> personas=service.listar();
		//for(int i=0; i<personas.size(); i++)
		//{
		//	System.out.println(personas.get(i).getCedula());
		//}
		model.addAttribute("personas",service.listar());
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model)
	{
		model.addAttribute("persona", new Usuario());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Usuario p, Model model)
	{
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{Cedula}")
	public String editar(@PathVariable int Cedula, Model model)
	{
		Optional<Usuario> persona = service.listarId(Cedula);
		model.addAttribute("persona", persona);
		return "form";
	}
	
	@GetMapping("/eliminar/{Cedula}")
	public String delete(Model model, @PathVariable int Cedula)
	{
		service.delete(Cedula);
		return "redirect:/listar";
	}

}
