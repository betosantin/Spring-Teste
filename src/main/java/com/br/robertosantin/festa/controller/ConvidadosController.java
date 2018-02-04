package com.br.robertosantin.festa.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.robertosantin.festa.model.Convidado;
import com.br.robertosantin.festa.model.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	@Autowired
	private Convidados convidados;

	@GetMapping
	public ModelAndView listar() {
		Convidado a = new Convidado(1, "Pedro", 5);
		Convidado b = new Convidado(2, "João", 3);
		Convidado c = new Convidado(3, "José", 2);

		List<Convidado> con = Arrays.asList(a, b, c);

		ModelAndView modelAndView = new ModelAndView("ListaConvidados");

		modelAndView.addObject("convidados", con);

		modelAndView.addObject(new Convidado());

		return modelAndView;
	}

	@PostMapping
	public String salvar(Convidado convidado) {
		
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}

}
