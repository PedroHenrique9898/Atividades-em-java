package Aula_010;

import javax.swing.JOptionPane;

public class Terrestre extends Transporte {
private int n_rodas;


public Terrestre(String Nome, String Descricao, double Tamanho, double Peso){
	super(Nome,Descricao, Tamanho, Peso);
}
public void dadosTerrestre(){
	super.dados();
	this.n_rodas = n_rodas;
	JOptionPane.showMessageDialog(null,"n_rodas:" + n_rodas, "Dados do transporte Terrestre", JOptionPane.INFORMATION_MESSAGE);
}
	public static void main(String[] args) {
		String Nome = JOptionPane.showInputDialog("Digite o nome do transporte aquatico: ");
		String Descricao = JOptionPane.showInputDialog("Digite a descrição desse transporte: ");
		double Tamanho = Double.parseDouble("Digite o manaho desse trasporte: ");
		double Peso = Double.parseDouble("Digite o peso desse transporte: ");
		
		Terrestre terrestre = new Terrestre(Nome, Descricao, Tamanho, Peso);
		terrestre.dadosTerrestre();
	}
}