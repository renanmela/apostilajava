package br.com.caelum.ed.conjuntos;

import java.util.List;

public class Testes {

	public static void main(String[] args) {
ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		System.out.println();
		
		List<String> palavras = conjunto.pegaTodas();
		System.out.println("antes de remover");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		conjunto.remove("Rafael");
		
		palavras = conjunto.pegaTodas();
		System.out.println("depois de remover");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		System.out.println();
		conjunto.adiciona("Rafael");
		System.out.println("Tamanho: " + conjunto.tamanho());
		
		conjunto.adiciona("Paulo");

	}

}
