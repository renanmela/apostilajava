package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

public class TestePilhaGenericaOpcional {

	public static void main(String[] args) {
		
		PilhaParametrizada<Peca> pilhaDePecas = new PilhaParametrizada<Peca>();
		
		int numeroDeElementos = 4000000;
		

		Peca peca = new Peca();
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
		pilhaDePecas.insere(peca);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Insere com LinkedList: " + (fim - inicio) / 1000.0);
		System.out.println("Tamanho: " + pilhaDePecas.tamanho());
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
		Peca pecaRemovida = pilhaDePecas.remove();
		}
		fim = System.currentTimeMillis();
		System.out.println("Remove com LinkedList: " + (fim - inicio) / 1000.0);
		System.out.println("Tamanho da pilha: " + pilhaDePecas.tamanho());
		
		
		PilhaParametrizada<String> pilhaDeString = new PilhaParametrizada<String>();
		
		pilhaDeString.insere("Rafael Cosentino");
		pilhaDeString.insere("Paulo Silveira");
		
		System.out.println(pilhaDeString.remove());
		System.out.println(pilhaDeString.remove());

	}

}
