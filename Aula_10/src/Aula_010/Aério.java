package Aula_010;
import javax.swing.JOptionPane;

public class Aério extends Transporte {
private int nr_passageiros;

public Aério(String Nome, String Descricao, double Tamanho, double Peso){
	super(Nome,Descricao,Tamanho,Peso);
}

public void dadosAério(){
	super.dados();
	this.nr_passageiros = nr_passageiros;
	JOptionPane.showMessageDialog(null,"n_passageiros:" + nr_passageiros, "Dados do transporte Aério", JOptionPane.INFORMATION_MESSAGE);
}
	public static void main(String[] args) {	
		String Nome = JOptionPane.showInputDialog("Digite o nome do transporte aquatico: ");
		String Descricao = JOptionPane.showInputDialog("Digite a descrição desse transporte: ");
		double Tamanho = Double.parseDouble("Digite o manaho desse trasporte: ");
		double Peso = Double.parseDouble("Digite o peso desse transporte: ");	
		
		Aério aerio = new Aério (Nome, Descricao, Tamanho, Peso);
		aerio.dadosAério();
	}

}
