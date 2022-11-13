package com.novolar.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.novolar.site.model.Produto;
import com.novolar.site.service.interfaces.ProdutoRepository;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/todos")
	public String home(Model model) {
		List<Produto> produtos = produtoRepository.findAll();
		model.addAttribute("produtos", produtos);
		return "produto/produtos";
	}
	
	@GetMapping("/acao")
	public String buscaProdutoPorNome() {
		List<Produto> produto = produtoRepository.findBy(null, null);
		return "produto/produtos";
	}
	
	
}
