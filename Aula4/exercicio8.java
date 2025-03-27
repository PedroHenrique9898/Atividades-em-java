import javax.swing.JOptionPane;


public class exercicio8 {

	public static void main(String[] args) {
		String nome;
		double h_trabalhada, v_h_trabalhada, acumulador =0, salario_bruto, desconto,salario_final;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de funcionarios"));
		for (int i = 1; i <= numero; i++){
			nome = JOptionPane.showInputDialog("Digite o nome do funcionario: ");
			h_trabalhada =  Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de horas trabalhadas"));
			v_h_trabalhada = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada"));
			salario_bruto = h_trabalhada * v_h_trabalhada;
			desconto = salario_bruto * 0.02;
			salario_final = salario_bruto - desconto;
			JOptionPane.showMessageDialog(null,"O funcionario" + nome + "teve um salario final de:" + salario_final);
			acumulador = acumulador + salario_final;
		}
		JOptionPane.showMessageDialog(null,"o total foi de:" + acumulador);
	}
}
