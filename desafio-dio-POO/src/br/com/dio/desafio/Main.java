package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();	
		
		curso1.setTitulo("Banco de Dados");
		curso1.setDescricao("Curso de Banco de Dados da DIO");
		curso1.setCargaHoraria(240);
		
		System.out.println(curso1);
		
		
		Curso curso2 = new Curso();	
		
		curso2.setTitulo("Programação Orientada a Objetos com Java");
		curso2.setDescricao("curso de Programação Orientada a Objetos com a IDE Eclipse ");
		curso2.setCargaHoraria(120);
		
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();	
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Na mentoria de Java você pode tirar suas dúvidas sobre as aulas e atividades, além de conhecer a equipe e alunos do bootcamp.");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);
	}

}
