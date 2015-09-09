package br.com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springmvc.modelo.Entidade;
import br.com.springmvc.repository.EntidadeRepository;

@Controller
public class SpringDataController {
	
	@Autowired
	private EntidadeRepository repository;

	@RequestMapping("/springdata")
	public String conexaoEstabelecida() {
		repository.save(new Entidade("atributo"));
		System.out.println(repository.findByAtributo("atributo").size());
		return "home";
	}

}