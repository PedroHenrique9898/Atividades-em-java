package Aula_010;
import javax.swing.JOptionPane;

// Classe Mamifero (Filho):
// Esta classe representa um mamífero, que é um tipo específico de animal.
public class Mamifero extends Animal {
    private String alimento;

    // Construtor da classe Mamifero:
    // Este construtor inicializa os atributos do mamífero com os valores fornecidos.
    public Mamifero(String nome, String habitat, String reproducao, String fecundacao, float velocidade_media, String coloracao, String locomocao, String respiracao, String alimento) {
        super(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao);
        this.alimento = alimento;
    }

    // Método para exibir os dados do mamífero:
    // Este método exibe uma mensagem com os dados do mamífero em uma caixa de diálogo.
    public void dadosMamifero() {
        super.dados();
        JOptionPane.showMessageDialog(null, "Alimento: " + alimento, "Informa��o do Mam�fero", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String nome             = JOptionPane.showInputDialog("Digite o nome do mam�fero:")                                        ;
        String habitat          = JOptionPane.showInputDialog("Digite o habitat do mam�fero:")                                     ;
        String reproducao       = JOptionPane.showInputDialog("Digite o tipo de reprodu��o do mam�fero:")                          ;
        String fecundacao       = JOptionPane.showInputDialog("Digite o tipo de fecunda��o do mam�fero:")                          ;
        float  velocidade_media = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade m�dia do mam�fero (em m/s):"));
        String coloracao        = JOptionPane.showInputDialog("Digite a colora��o do mam�fero:");
        String locomocao        = JOptionPane.showInputDialog("Digite o tipo de locomo��o do mam�fero:");
        String respiracao       = JOptionPane.showInputDialog("Digite o tipo de respira��o do mam�fero:");
        String alimento         = JOptionPane.showInputDialog("Digite o alimento do mam�fero:");

        Mamifero mamifero = new Mamifero(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, alimento);
        mamifero.dadosMamifero();
    }
}