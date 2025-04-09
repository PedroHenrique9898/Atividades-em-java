package aula77;
import javax.swing.JOptionPane;

	public class ex0008lista2 {
	    public static void main(String[] args) {
	        // Cria um array de tamanho 10 para armazenar os nomes
	        String[] pessoas = new String[10];
	        
	        // vari�vel para verificar nome (true ou false)
	        boolean nomeencontrado = false;

	        // Solicita ao usu�rio que insira 10 nomes
	        for (int i = 0; i < 10; i++) {
	            String nome = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + " de 10:");
	            pessoas[i] = nome;  // Armazena o nome no array
	        }

	        // Solicita ao usu�rio que insira o nome a ser verificado
	        String nomeVerificar = JOptionPane.showInputDialog("Digite o nome para pesquisar se j� foi cadastrado:");

	        // Pesquisa se o nome informado j� foi cadastrado no array
	        for (int i = 0; i < 10; i++) {
	            if (pessoas[i].equalsIgnoreCase(nomeVerificar)) {
	                nomeencontrado = true;
	                break;
	            }
	        }

	        // Exibe o resultado da verifica��o
	        if (nomeencontrado) {
	            JOptionPane.showMessageDialog(null, "O nome " + nomeVerificar + " j� foi cadastrado.");
	        } else {
	            JOptionPane.showMessageDialog(null, "O nome " + nomeVerificar + " n�o foi cadastrado.");
	        }
	    }
	}

