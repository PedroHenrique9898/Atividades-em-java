package aula5;
import javax.swing.JOptionPane;

public class ex6{

	public static void main(String[] args) {
	calculadora();
	System.exit(0);
}

	public static void calculadora(){
	Double valor1, valor2, resultado;
	valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1"));
	valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2"));
	String op = JOptionPane.showInputDialog("  A - adi��o "
											+ " S - Subitra��o "
											+ " D - Divisao "
											+ " M - multipica��o  "
											+ " digite a op desejda");
	if (op.equals("a"))
	{
		resultado = (valor1 + valor2);
		System.out.println("O resultado �:" + resultado);
	}
	else if (op.equals("s"))	
	{
			resultado = (valor1 - valor2);
			System.out.println("O resultado �:" + resultado);
	}
	else if (op.equals("d"))	
	{
			resultado = (valor1 / valor2);
			System.out.println("O resultado �:" + resultado);
	}
	else if (op.equals("m"))	
	{
			resultado = (valor1 * valor2);
			System.out.println("O resultado �:" + resultado);
	}
}
}
