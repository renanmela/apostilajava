package br.com.caelum.ed.vetores.exercicios;

import br.com.caelum.ed.Aluno;

public class ExercicioVetorOpcional {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		a1.setNome("Rafael");

		VetorArrayList lista = new VetorArrayList();

		lista.adiciona("Aluno 1");
		lista.adiciona("Aluno 2");
		lista.adiciona(a1.getNome());
		
		lista.indexOf(a1.getNome());
		
		System.out.println(lista);

		lista.remove("Aluno 1");
		System.out.println(lista);
		
		lista.lastIndexOf(a1.getNome());
		
		lista.clear();
		
	}

}
