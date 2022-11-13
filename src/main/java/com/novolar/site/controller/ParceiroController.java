package com.novolar.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parceiro")
public class ParceiroController {
	
	@GetMapping("/home")
	public String homeParceiro() {
		return "home";
	}
	
	@GetMapping("/cadastroProduto")
	public String cadastroProduto() {
		
		return "produto/formularioNovoProduto";
	}
}
