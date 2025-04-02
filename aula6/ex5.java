package aula6;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
	int[] numeros = new int[5];
	
	for(int i = 0; i < 5; i++){
		numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros inteiros: "));
		
		
	}
	
	for(int i = 0; i < 5; i++){
		JOptionPane.showMessageDialog(null, " o maior nuemros do array" );
	}
	}
	
}
