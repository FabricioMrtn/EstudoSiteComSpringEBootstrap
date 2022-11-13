package com.novolar.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.novolar.site.dto.ReqNovoCliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@GetMapping("/cadastro")
	public String cadastroCliente(ReqNovoCliente cliente) {
		return "cliente/cadastro";
	}
	
}
