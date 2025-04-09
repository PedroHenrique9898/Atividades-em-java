package aula77;
import javax.swing.JOptionPane;
public class ex01 {

	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vezes que deseja repetir:"));
		String[] nome = new String[quantidade];
		String[] cargos = new String[quantidade];
		double[] salarios = new double[quantidade];
		
		for(int i = 0; i < quantidade; i++){
			nome[i] = JOptionPane.showInputDialog("Digite o nome do funcionario " + (i + 1) + ":");
			cargos[i] = JOptionPane.showInputDialog("Digite o cargo desse funcionario: "+ (i + 1) + ":");
			salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario desse funcionario:"+ (i + 1) + ":"));
		}
		for(int i = 0; i < quantidade; i++){
			JOptionPane.showMessageDialog(null,"O nome do funcionario cadastrado foi:"+ (i+ 1) + nome[i]);
		}
		for(int i = 0; i < quantidade; i++){
			JOptionPane.showMessageDialog(null,"O cargo do funcionario cadastrado é:"+ (i + 1) + cargos[i]);
		}
		for(int i = 0; i < quantidade; i++){
			JOptionPane.showMessageDialog(null,"O salario do funcionario cadastrado é:" + ( i + 1) + salarios[i]);
		}
	}

}
