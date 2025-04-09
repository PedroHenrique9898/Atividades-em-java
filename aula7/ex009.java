package aula77;
import javax.swing.JOptionPane;

public class ex009 {
    public static void main(String[] args) {
        int[] A = new int[10];
        
        // Solicita ao usuário que insira 10 valores para o array A
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + " para o array A:");
            A[i] = Integer.parseInt(input);  // Converte o valor inserido para inteiro
        }
        
        // Criação do array B com o mesmo tamanho do array A
        int[] B = new int[A.length];
        
        // Usando System.arraycopy para copiar os valores de A para B
        System.arraycopy(A, 0, B, 0, A.length);
        
        // Exibe os valores do array B
        StringBuilder resultado = new StringBuilder("Mostrar Array B: ");
        for (int i = 0; i < B.length; i++) {
            resultado.append(B[i]).append(" ");  // Adiciona cada valor de B à string de resultado
        }
        
        // Exibe o resultado em uma caixa de mensagem
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}

