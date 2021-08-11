package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.domain.Professor;
import br.com.senac.repository.ProfessorRepositorio;

@Service
public class ProfessorService {
	
	@Autowired
	ProfessorRepositorio repoProf;
	
	public Professor salvarProf(Professor professor) {
		return repoProf.save(professor);
	}
	
	public List<Professor> buscarTodosProfessores(){
		return repoProf.findAll();
	}

}
