package com.tiendapapelera.Tienda.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiendapapelera.Tienda.interfeceService.IClienteService;
import com.tiendapapelera.Tienda.model.Cliente;

@Controller
@RequestMapping
public class ControladorLogin {


	
	@GetMapping("/login")
	public String listar(Model model)
	{
		return "Login";
	}
	
}
