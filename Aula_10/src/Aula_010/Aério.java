package Aula_010;
import javax.swing.JOptionPane;

public class A�rio extends Transporte {
private int nr_passageiros;

public A�rio(String Nome, String Descricao, double Tamanho, double Peso){
	super(Nome,Descricao,Tamanho,Peso);
}

public void dadosA�rio(){
	super.dados();
	this.nr_passageiros = nr_passageiros;
	JOptionPane.showMessageDialog(null,"n_passageiros:" + nr_passageiros, "Dados do transporte A�rio", JOptionPane.INFORMATION_MESSAGE);
}
	public static void main(String[] args) {	
		String Nome = JOptionPane.showInputDialog("Digite o nome do transporte aquatico: ");
		String Descricao = JOptionPane.showInputDialog("Digite a descri��o desse transporte: ");
		double Tamanho = Double.parseDouble("Digite o manaho desse trasporte: ");
		double Peso = Double.parseDouble("Digite o peso desse transporte: ");	
		
		A�rio aerio = new A�rio (Nome, Descricao, Tamanho, Peso);
		aerio.dadosA�rio();
	}

}
