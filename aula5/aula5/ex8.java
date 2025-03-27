package aula5;
import javax.swing.JOptionPane;
public class ex8 {

	public static void main(String[] args) {
		ensino();
		System.exit(0);
	}
	public static void ensino() {
		int  totalMedio = 0, totalTecnico = 0, totalFundamental = 0;
		String nome, formando; 
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionarios que deseja calcular: "));
		for (int i = 1;i <= quantidade; i++){
		
		nome = JOptionPane.showInputDialog("Digite o seu nome:");
		formando = JOptionPane.showInputDialog("  F - Ensino Fundamentl" + "/n" + 
				                                " M - Ensino Médio    " + "/n"  +
				                                " T - Ensino Técinico " + "/n" +
				                                " digite a sua escolha: ");
		switch(formando){
		case "f":
			JOptionPane.showMessageDialog(null,nome +  "faz parte do ensino fundamental.");
			totalFundamental = totalFundamental + 1;
			break;
		case "m":
			JOptionPane.showMessageDialog(null, nome + "faz parte do Ensino Médio" );
			totalMedio = totalMedio + 1;
			break;
		case "t":
			JOptionPane.showMessageDialog(null, nome + "faz parte do Ensino Técnico" );
			totalTecnico = totalTecnico + 1;
			break;
		}
		JOptionPane.showMessageDialog(null,"o total de alunos que fazem parte do Ensino Médio:" + totalMedio  + "/n" +
		                              " o total de alunos que fazem parte do Ensino Técnico: " + totalTecnico + "/n" +
									  " o total de alunos que fazem parte do Ensino Fundametal: " + totalFundamental);
		}
	}

}
