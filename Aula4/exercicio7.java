import javax.swing.JOptionPane;


public class exercicio7 {

	public static void main(String[] args) {
		String nome;
		double peso, altura, imc;
		int idade;

nome = JOptionPane.showInputDialog("Digite o seu nome: ");
peso = Double.parseDouble(JOptionPane.showInputDialog("digite o seu peso: "));
altura = Double.parseDouble(JOptionPane.showInputDialog("digite a sua altura: "));
idade = Integer.parseInt(JOptionPane.showInputDialog("digite o seu idade: "));

imc = peso / (altura * altura);
JOptionPane.showMessageDialog(null,nome + "tem o peso de " + peso +" e a altura de" + altura + "com isso seu imc: " + imc);
	}

}
