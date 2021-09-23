package controller;

import com.rafael.utils.pilha.string.*;

public class Palindromos {

	public Palindromos() {
		super();
	}
	
	public String invertePalavra(String palavra, Pilha pilha) {
		String palavraInvertida = "";
		
		for (int i = 0; i < palavra.length(); i++) {
			pilha.push(palavra.substring(i, i + 1));
		}
		
		while (!pilha.isEmpty()) {
			try {
				palavraInvertida = palavraInvertida + pilha.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return palavraInvertida;
	}
	
	public boolean palindromo(String palavra, String palavraInvertida) {
		if (palavra.equals(palavraInvertida)) {
			return true;
		}
		
		return false;
	}
}