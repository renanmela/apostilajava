package br.com.caelum.ed.pilhas;

import java.util.ArrayList;
import java.util.List;

public class PilhaParametrizadaArray<T> {
	
	private List<T> objetos = new ArrayList<T>();

	public void insere(T t) {
		this.objetos.add(t);
	}

	public T remove() {
		return this.objetos.remove(this.objetos.size() - 1);
	}

	public boolean vazia() {
		return this.objetos.size() == 0;
	}
	
	public int tamanho() {
		return objetos.size();
	}
}
