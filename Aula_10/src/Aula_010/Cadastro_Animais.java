package Aula_010;
import javax.swing.JOptionPane;

// Classe principal Cadastro_Animais:
// Esta classe é responsável por coletar os dados do usuário e criar instâncias de Peixe, Mamífero ou Ave.
public class Cadastro_Animais {
    public static void main(String[] args) {
        String escolhaStr = JOptionPane.showInputDialog("Escolha o tipo de animal:\n1 - Peixe\n2 - Mam�fero\n3 - Ave");
        int escolha       = Integer.parseInt(escolhaStr);

        String nome            = JOptionPane.showInputDialog("Nome: ");
        String habitat         = JOptionPane.showInputDialog("Habitat: ");
        String reproducao      = JOptionPane.showInputDialog("Tipo de reprodu��o: ");
        String fecundacao      = JOptionPane.showInputDialog("Tipo de fecunda��o: ");
        float velocidade_media = Float.parseFloat(JOptionPane.showInputDialog("Velocidade m�dia (m/s): "));
        String coloracao       = JOptionPane.showInputDialog("Colora��o: ");
        String locomocao       = JOptionPane.showInputDialog("Tipo de locomo��o: ");
        String respiracao      = JOptionPane.showInputDialog("Tipo de respira��o: ");

        if (escolha == 1) {
            String caracteristica = JOptionPane.showInputDialog("Caracter�stica do peixe: ");
            Peixe peixe = new Peixe(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, caracteristica);
            peixe.dadosPeixe();
        } else if (escolha == 2) {
            String alimento = JOptionPane.showInputDialog("Alimento do mamífero: ");
            Mamifero mamifero = new Mamifero(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, alimento);
            mamifero.dadosMamifero();
        } else if (escolha == 3) {
            String tipoDeVoo = JOptionPane.showInputDialog("Tipo de voo da ave: ");
            Ave ave = new Ave(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, tipoDeVoo);
            ave.dadosAve();
        } else {
            JOptionPane.showMessageDialog(null, "Op��o inv�lida! Escolha 1 para Peixe, 2 para Mam�fero ou 3 para Ave.");
        }
    }
}
