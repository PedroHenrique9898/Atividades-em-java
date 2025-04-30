package Aula_010;
import javax.swing.JOptionPane;

//Classe principal Cadastro_Animais:
public class Cadastro_Trasnporte {
	public static void main(String[] args) {
		String escolhaStr = JOptionPane.showInputDialog("Escolha o tipo de Trasporte:\n1 - Aquatico\n2 - Terrestre\n3 - A�rio");
	    int escolha       = Integer.parseInt(escolhaStr);
	    String nome            = JOptionPane.showInputDialog("Nome: ");
	    String Descricao       = JOptionPane.showInputDialog("Descricao: ");
	    double Tamanho         = Double.parseDouble(JOptionPane.showInputDialog("Tamanho: "));
	    double Peso            = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
	    
	    if (escolha == 1) {
            String Altura = JOptionPane.showInputDialog("Altura do Aquatico: ");
            Aquatico aquatico = new Aquatico(nome, Descricao, Tamanho, Peso);
            aquatico.dadosAquatico();
        } else if (escolha == 2) {
            String nr_rodas = JOptionPane.showInputDialog("Digite o numero de rodas: ");
            Terrestre terrestre = new Terrestre(nome, Descricao , Tamanho,Peso);
            terrestre.dadosTerrestre();
        } else if (escolha == 3) {
            String nr_passageiros= JOptionPane.showInputDialog("Numero de passageiros: ");
            A�rio aerio = new A�rio(nome, Descricao, Tamanho, Peso);
            aerio.dadosA�rio();
        } else {
            JOptionPane.showMessageDialog(null, "Op��o inv�lida! Escolha 1 para Peixe, 2 para Mam�fero ou 3 para Ave.");
        }
	    
	}

}
