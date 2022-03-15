package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

public class TestePerformanceFilas {

	public static void main(String[] args) {

		FilaParametrizada<Aluno> filaDeAlunos = new FilaParametrizada<Aluno>();

		FilaParametrizadaArray<Aluno> filaDeAlunosArray = new FilaParametrizadaArray<Aluno>();

		int numeroDeElementos = 40000;

		Aluno aluno = new Aluno();
		//INSERE
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			filaDeAlunos.insere(aluno);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Insere com LinkedList: " + (fim - inicio) / 1000.0);
		
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			filaDeAlunosArray.insere(aluno);
		}
		fim = System.currentTimeMillis();
		System.out.println("Insere com ArrayList: " + (fim - inicio) / 1000.0);
		
		
		//REMOVE
		Aluno alunoRemovido = new Aluno();
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
		alunoRemovido = filaDeAlunos.remove();
		}
		fim = System.currentTimeMillis();
		System.out.println("Remove com LinkedList: " + (fim - inicio) / 1000.0);
		
		Aluno alunoRemovidoArray = new Aluno();
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			alunoRemovidoArray = filaDeAlunosArray.remove();
		}
		fim = System.currentTimeMillis();
		System.out.println("Remove com ArrayList: " + (fim - inicio) / 1000.0);
	}

}
