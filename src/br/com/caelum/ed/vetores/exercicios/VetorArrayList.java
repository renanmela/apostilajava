package br.com.caelum.ed.vetores.exercicios;

import java.util.ArrayList;

import br.com.caelum.ed.Aluno;

public class VetorArrayList {

	ArrayList<String> lista = new ArrayList(1000);
	
	private int totalDeObjetos = 0;

	public void adiciona(String aluno) {
		this.lista.add(aluno);
		this.totalDeObjetos++;
	}

	public void remove(Object objeto) {
		for (int i = this.lista.indexOf(objeto); i < this.totalDeObjetos - 1; i++) {
			this.lista.set(i, this.lista.get(i + 1));
		}
		this.totalDeObjetos--;
	}

	public void clear() {
		for (int i = 0; i < this.totalDeObjetos; i++) {
			this.lista.remove(i);
		}
	}

	public void indexOf(Object objeto) {
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if(this.lista.get(i) == objeto) {
				System.out.println(i);
			}
		}
	}

	public void lastIndexOf(Object objeto) {
		for (int i = this.totalDeObjetos - 1; i > 0; i--) {
			if(this.lista.get(i) == objeto) {
				System.out.println(i);
			}
		}
	}
	
	public String toString() {
		if (this.totalDeObjetos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.totalDeObjetos - 1; i++) {
			builder.append(this.lista.get(i));
			builder.append(", ");
		}

		builder.append(this.lista.get(totalDeObjetos - 1));
		builder.append("]");

		return builder.toString();
	}

}
