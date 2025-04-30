package Aula_010;
import javax.swing.JOptionPane;
public class Aquatico extends Transporte {
 private String altura;

	public Aquatico(String Nome, String Descricao, double Tamanho, double Peso){
		super(Nome, Descricao, Tamanho, Peso);
	}
	
	public void dadosAquatico(){
		super.dados();
		this.altura = altura;
		JOptionPane.showMessageDialog(null,"altura:" + altura, "Dados do transporte Aquatico", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) {
		String Nome = JOptionPane.showInputDialog("Digite o nome do transporte aquatico: ");
		String Descricao = JOptionPane.showInputDialog("Digite a descrição desse transporte: ");
		double Tamanho = Double.parseDouble("Digite o manaho desse trasporte: ");
		double Peso = Double.parseDouble("Digite o peso desse transporte: ");
		
		Aquatico aquatico = new Aquatico(Nome, Descricao, Tamanho, Peso);
		aquatico.dadosAquatico();
	}
}

