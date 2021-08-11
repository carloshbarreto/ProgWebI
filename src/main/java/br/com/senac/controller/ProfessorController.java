package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.service.ProfessorService;

@Controller
@RequestMapping("professor")
public class ProfessorController {
	
	@Autowired
	ProfessorService professorService;
	
	
	@GetMapping("/listarProfessor")
	public ModelAndView listarTodosProfessores() {
		ModelAndView mvp = new ModelAndView("professor/paginaListaProfessor");
		mvp.addObject("professores", professorService.buscarTodosProfessores());
		return mvp;
		
	}
	
	

}
