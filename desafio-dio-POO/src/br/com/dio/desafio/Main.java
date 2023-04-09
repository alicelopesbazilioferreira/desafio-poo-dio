package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();	
		
		curso1.setTitulo("Banco de Dados");
		curso1.setDescricao("Curso de Banco de Dados da DIO");
		curso1.setCargaHoraria(4);
		System.out.println(curso1);		
		
		
		Curso curso2 = new Curso();	
		
		curso2.setTitulo("Programação Orientada a Objetos com Java");
		curso2.setDescricao("curso de Programação Orientada a Objetos com a IDE Eclipse ");
		curso2.setCargaHoraria(4);
		System.out.println(curso2);
		
		
		
		
		Mentoria mentoria = new Mentoria();	
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Na mentoria de Java você pode tirar suas dúvidas sobre as aulas e atividades, além de conhecer a equipe e alunos do bootcamp.");
		mentoria.setData(LocalDate.now());
		System.out.println(mentoria);
		
		
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp de Java da DIO");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		
		Dev devAlice = new Dev();
		devAlice.setNome("Alice Lopes");
		devAlice.inscreverBootcamp(bootcamp);
		devAlice.progredir();
		System.out.println("conteudos Inscritos: " + devAlice.getConteudosInscritos());
		System.out.println("conteudos Concluidos: " + devAlice.getConteudosConcluidos());
		System.out.println("XP Alice: " + devAlice.calcularTotalXp());
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila Santos");
		devCamila.inscreverBootcamp(bootcamp);
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("conteudos Inscritos: " + devCamila.getConteudosInscritos());
		System.out.println("conteudos Concluidos: " + devCamila.getConteudosConcluidos());
		System.out.println("XP Camila: " + devCamila.calcularTotalXp());


	}

}
