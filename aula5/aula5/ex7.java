package aula5;
import javax.swing.JOptionPane;

public class ex7 {

	public static void main(String[] args) {
		funcionarios();
		System.exit(0);
	}
	
	public static void funcionarios(){
	String nome;
	double salario;
	int quantidade, menor3k = 0, maior3k = 0, maior5k = 0;
	
	quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionarios que deseja calcular: "));
		
	for (int i = 1;i <= quantidade; i++){
		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
		
		if ((salario >= 0) && (salario < 3000))
		{
			System.out.println( );
			JOptionPane.showMessageDialog(null, nome + "Vc ganham menos que 3k");
			menor3k = menor3k + 1;
		}
		if ((salario >= 3000) && (salario <= 5000))
		{
			JOptionPane.showMessageDialog(null, nome + "Vc ganham entre 3k e 5k");
			maior3k = maior3k + 1;
		}
		if (salario > 5000)
		{
			JOptionPane.showMessageDialog(null, nome + "Vc ganham mais que 5k");
			maior5k = maior5k + 1;
		}	
	}
	JOptionPane.showMessageDialog(null,
			"O total de funcionarios que ganham menos de 3k "           + menor3k + "\n" +
			"o total de funcionarios que ganham entre 3k e 5k sao de: " + maior3k + "\n" +
			"o total de funcionarios que ganham mais de 5k são de: "    + maior5k);
	}
}
