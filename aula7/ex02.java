package aula77;
import javax.swing.JOptionPane;
public class ex02 {

	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vezes que deseja repetir:"));
		String[] nome = new String[quantidade];
		String[] especialidade = new String[quantidade];
		
		for(int i = 0; i < quantidade; i++){
			nome[i] = JOptionPane.showInputDialog("Digite o nome do funcionario " + (i + 1) + ":");
			especialidade[i] = JOptionPane.showInputDialog("Digite a especialidade desse funcionario: "+ (i + 1) + ":");
		}
		for(int i = 0; i < quantidade; i++){
			JOptionPane.showMessageDialog(null,"O nome do funcionario cadastrado foi:"+ (i+ 1) + nome[i]);
		}
		for(int i = 0; i < quantidade; i++){
			JOptionPane.showMessageDialog(null,"A especialidade do funcionario cadastrado é:"+ (i + 1) + especialidade[i]);
		}
		
	}

}
