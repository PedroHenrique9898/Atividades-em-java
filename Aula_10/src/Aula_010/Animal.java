package Aula_010;
import javax.swing.JOptionPane;

// Classe base Animal (Pai):
// Esta classe representa um animal genÃ©rico com atributos comuns a todos os animais.
public class Animal {
    private String nome            ;
    private String habitat         ;
    private String reproducao      ;
    private String fecundacao      ; 
    private float  velocidade_media;
    private String coloracao       ;
    private String locomocao       ;
    private String respiracao      ;

    // Construtor da classe Animal:
    // Este construtor inicializa os atributos do animal com os valores fornecidos.
    public Animal(String nome, String habitat, String reproducao, String fecundacao, float velocidade_media, String coloracao, String locomocao, String respiracao) {
        this.nome             = nome            ;
        this.habitat          = habitat         ;
        this.reproducao       = reproducao      ;
        this.fecundacao       = fecundacao      ;
        this.velocidade_media = velocidade_media;
        this.coloracao        = coloracao       ;
        this.locomocao        = locomocao       ;
        this.respiracao       = respiracao      ;
    }

    // MÃ©todo para exibir os dados do animal:
    // Este mÃ©todo exibe uma mensagem com os dados do animal em uma caixa de diÃ¡logo.
    public void dados() {
        String mensagem = "- Dados do Animal:\n" +
                          "Nome: "             + nome             + "\n"     +
                          "Habitat: "          + habitat          + "\n"     +
                          "Reprodução: "       + reproducao       + "\n"     +
                          "Fecundação: "       + fecundacao       + "\n"     +
                          "Velocidade média: " + velocidade_media + " m/s\n" +
                          "Coloração: "        + coloracao        + "\n"     +
                          "Locomoção: "        + locomocao        + "\n"     +
                          "Respiração: "       + respiracao;
        JOptionPane.showMessageDialog(null, mensagem, "Informações do Animal", JOptionPane.INFORMATION_MESSAGE);
    }
}
