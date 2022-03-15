package br.com.caelum.ed.vetores.exercicios;

import java.util.ArrayList;
import java.util.Vector;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class ExercicioVetor {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		System.out.println(vetor.tamanho());

		for (int i = 0; i < 1000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}

		System.out.println(vetor.tamanho());

		Vector<Object> vector = new Vector<Object>();
		System.out.println(vector.size());

		for (int i = 0; i < 1000; i++) {
			vector.add(vetor.pega(i));
		}

		System.out.println(vector.size());

		ArrayList<Object> list = new ArrayList();
		System.out.println(list.size());

		for (int i = 0; i < 1000; i++) {
			list.add(vector.get(i));
		}
		
		System.out.println(list.size());
		
	}
}
