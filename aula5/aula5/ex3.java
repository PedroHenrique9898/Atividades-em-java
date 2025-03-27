package aula5;
import javax.swing.JOptionPane;

public class ex3 {
	public static void main(String[] args){
		verificarIMC();
		System.exit(0);
	}
	
	public static void verificarIMC() {
		String nome;
		double peso, altura;
		
		nome = JOptionPane.showInputDialog("nome: ");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		
		double valorIMC = peso/(altura *altura);
		JOptionPane.showMessageDialog(null, "nome: " + nome + "IMC: " + valorIMC) ;
	}

}
