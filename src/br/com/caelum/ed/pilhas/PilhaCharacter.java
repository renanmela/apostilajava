package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.ed.Peca;
import br.com.caelum.ed.listasligadas.Celula;

public class PilhaCharacter {

	private List<Character> letras = new LinkedList<Character>();
	private int totalDePalavras = 0;
	private int totalDeLetras = 0;
	

	public void insereCript(String[] mensagem) {
		letras.clear();
		totalDeLetras = 0;
		totalDePalavras = mensagem.length;
		for (int i = 0; i < mensagem.length; i++) {
			String palavra = mensagem[i];
			for(int j = palavra.length() - 1; j >= 0; j--) {
			this.letras.add(palavra.charAt(j));
			totalDeLetras++;
			}
			this.addEspaco();
			totalDePalavras--;
		}
	}

	public void insereDescript(String[] mensagem) {
		letras.clear();
		totalDeLetras = 0;
		totalDePalavras = mensagem.length;
		
		for (int i = 0; i < mensagem.length; i++) {
			String palavra = mensagem[i];
			for(int j = palavra.length() - 1; j >= 0; j--) {
			this.letras.add(palavra.charAt(j));
			totalDeLetras++;
			}
			this.addEspaco();
			totalDePalavras--;
		}
	}
	
	private void addEspaco() {
		if (!(totalDePalavras == 0)) {
			this.letras.add(' ');
			totalDeLetras++;
		}
	}
	
	public Character remove() {
		return this.letras.remove(this.letras.size() - 1);
	}
	
	public String toString() {
		// Verificando se a Lista está vazia
		if (this.letras.isEmpty()) {
			return "Não tem nenhuma letra armazenada";
		}

		StringBuilder builder = new StringBuilder();
		
		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < this.totalDeLetras - 1; i++) {
			builder.append(letras.get(i));
		}

		return builder.toString();
	}
}
