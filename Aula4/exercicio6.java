import javax.swing.JOptionPane;

public class exercicio6 {

	public static void main(String[] args) {
		double altura, base, area, resultado;

base = Double.parseDouble(JOptionPane.showInputDialog("digite o valor da base"));
altura = Double.parseDouble(JOptionPane.showInputDialog("digite a altura do triangulo"));
area = (base * altura)/2; 
JOptionPane.showMessageDialog(null,"o valor da area do triangulo vai ser: " + area);

	}

}
