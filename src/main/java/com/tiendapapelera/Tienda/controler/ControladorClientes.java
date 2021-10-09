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

import com.tiendapapelera.Tienda.interfeceService.IClienteService;
import com.tiendapapelera.Tienda.model.Cliente;


@Controller
@RequestMapping
public class ControladorClientes {
	
	@Autowired
	private IClienteService service;
	
	@GetMapping("/listarClientes")
	public String listar(Model model)
	{
		List<Cliente> clientes=service.listar();
		//for(int i=0; i<personas.size(); i++)
		//{
		//	System.out.println(personas.get(i).getCedula());
		//}
		model.addAttribute("clientes",service.listar());
		return "indexClientes";
	}
	
	@GetMapping("/newCliente")
	public String agregar(Model model)
	{
		model.addAttribute("cliente", new Cliente());
		return "formCliente";
	}
	
	@PostMapping("/saveCliente")
	public String save(@Validated Cliente p, Model model)
	{
		service.save(p);
		return "redirect:/listarClientes";
	}
	
	@GetMapping("/editarCliente/{Cedula}")
	public String editar(@PathVariable long Cedula, Model model)
	{
		Optional<Cliente> cliente = service.listarId(Cedula);
		model.addAttribute("cliente", cliente);
		return "formCliente";
	}
	
	@GetMapping("/eliminarCliente/{Cedula}")
	public String delete(Model model, @PathVariable long Cedula)
	{
		service.delete(Cedula);
		return "redirect:/listarClientes";
	}

}
