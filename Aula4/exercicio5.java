import javax.swing.JOptionPane;

public class exercicio5 {

	public static void main(String[] args) {
		String nome,cargo;
		double salario,acumulador = 0;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de funcionarios"));
		for (int i = 1; i <= numero; i++){
			
		nome = JOptionPane.showInputDialog("Nome do funcionario");
		cargo = JOptionPane.showInputDialog("Cargo do funcionario");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario"));
		
		double aumento = salario * 0.05;
		double novo_salario = salario + (salario * aumento);
		acumulador = acumulador + novo_salario;
		}
		JOptionPane.showMessageDialog(null,"O salario final do funcionario: " + acumulador);
	}
}

	
