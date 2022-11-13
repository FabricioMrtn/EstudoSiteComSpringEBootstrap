package com.novolar.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.novolar.site.service.interfaces.ProdutoRepository;

@Controller
public class HomeController {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("/home")
	public String Home() {
		
		return "home";
	}
	
	@GetMapping("/login")
	public String Login(){
		
		return "";
	}
	
	@GetMapping("/cliente")
	public String CadastroCliente() {
		return "cliente/cadastro";
	}
	
}
