package br.com.caelum.ed.pilhas;

public class TesteCript {

	public static void main(String[] args) {
		
		PilhaCharacter pilhaDeLetras = new PilhaCharacter();

		String mensagem = "Uma mensagem confidencial";
		
		pilhaDeLetras.insereCript(mensagem.split(" "));
		
		System.out.println("Criptografado --> " + pilhaDeLetras);
		
		pilhaDeLetras.insereDescript(pilhaDeLetras.toString().split(" "));
		
		System.out.println("Descriptografado --> " + pilhaDeLetras);
	}

}
