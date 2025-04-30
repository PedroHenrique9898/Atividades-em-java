package Aula_010;
import javax.swing.JOptionPane;

// Classe Ave (Filho):
// Esta classe representa uma ave, que um tipo especifico de animal.
public class Ave extends Animal {
    private String tipoDeVoo;

    // Construtor da classe Ave:
    // Este construtor inicializa os atributos da ave com os valores fornecidos.
    public Ave(String nome, String habitat, String reproducao, String fecundacao, float velocidade_media, String coloracao, String locomocao, String respiracao, String tipoDeVoo) {
        super(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao);
        this.tipoDeVoo = tipoDeVoo;
    }

    // Método para exibir os dados da ave:
    // Este método exibe uma mensagem com os dados da ave em uma caixa de diálogo.
    public void dadosAve() {
        super.dados();
        JOptionPane.showMessageDialog(null, "Tipo de Voo: " + tipoDeVoo, "Dados da Ave", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String nome            = JOptionPane.showInputDialog("Digite o nome da ave:");
        String habitat         = JOptionPane.showInputDialog("Digite o habitat da ave:");
        String reproducao      = JOptionPane.showInputDialog("Digite o tipo de reprodu��oo da ave:");
        String fecundacao      = JOptionPane.showInputDialog("Digite o tipo de fecunda��oo da ave:");
        float velocidade_media = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade m�dia da ave (em m/s):"));
        String coloracao       = JOptionPane.showInputDialog("Digite a colora��o da ave:");
        String locomocao       = JOptionPane.showInputDialog("Digite o tipo de locomo��o da ave:");
        String respiracao      = JOptionPane.showInputDialog("Digite o tipo de respira��o da ave:");
        String tipoDeVoo       = JOptionPane.showInputDialog("Digite o tipo de voo da ave:");

        Ave ave = new Ave(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, tipoDeVoo);
        ave.dadosAve();
    }
}
