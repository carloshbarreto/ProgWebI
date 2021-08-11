package br.com.senac.inicializacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.domain.Aluno;
import br.com.senac.domain.Professor;
import br.com.senac.service.AlunoService;
import br.com.senac.service.ProfessorService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	AlunoService alunoService;
	
	@Autowired
	ProfessorService profService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Carlos");
		alunoService.salvar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Marcus");
		alunoService.salvar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Victor");
		alunoService.salvar(aluno3);
		
		Professor professor1 = new Professor();
		professor1.setNome("Marcelo");
		profService.salvarProf(professor1);
		
		Professor professor2 = new Professor();
		professor2.setNome("Priscila");
		profService.salvarProf(professor2);
		
		Professor professor3 = new Professor();
		professor3.setNome("Agnaldo");
		profService.salvarProf(professor3);
		
		List<Aluno> listaAlunos = alunoService.buscarTodosAlunos();
		
		for(Aluno aluno :listaAlunos) {
			System.out.println(aluno.getNome());
		}
		
		List<Professor> listaProfessores = profService.buscarTodosProfessores();
		
		for(Professor professor :listaProfessores) {
			System.out.println(professor.getNome());
		}
		
	}
	
	

}
