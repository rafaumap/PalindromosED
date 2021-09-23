package view;

import javax.swing.JOptionPane;

import com.rafael.utils.pilha.string.*;

import controller.Palindromos;

public class Principal {

	public static void main(String[] args) {
		Palindromos palindromoController = new Palindromos();
		Pilha pilha = new Pilha();
		String mensagem;
		String palavra;
		String palavraInvertida;
		
		palavra = JOptionPane.showInputDialog(null, "Insira uma palavra para verificar se � um pal�ndromo");
		palavraInvertida = palindromoController.invertePalavra(palavra, pilha);
		
		if (palindromoController.palindromo(palavra, palavraInvertida)) {
			mensagem = "� um palindromo";
		} else {
			mensagem = "N�o � um pal�ndromo";
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
