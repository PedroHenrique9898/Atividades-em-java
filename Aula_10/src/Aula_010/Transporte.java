package Aula_010;
import javax.swing.JOptionPane;

//Classe base Trasporte (Pai):
public class Transporte {
	private String Nome;
	private String Descricao;
	private double Tamanho;
	private double Peso;
	

//Este construtor inicializa os atributos do animal com os valores fornecidos.		
public Transporte(String Nome, String Descricao, double Tamanho, double Peso){
	this.Nome = Nome;
	this.Descricao = Descricao;
	this.Tamanho = Tamanho;
	this.Peso = Peso;
}

//exibindo as informacos na caixa de dialogo
	public void dados(){
		String mensagem = "Dados do Transporte: /n" +
				"Nome: " + Nome +  "/n" +
				"Descricao: " + Descricao + "/n" +
				"Tamanho:   "   + Tamanho + "/n" + 
				"Peso:      " + Peso;
		JOptionPane.showMessageDialog(null, mensagem, "Informaçoes dos Veiculos", JOptionPane.INFORMATION_MESSAGE);
	}

}

