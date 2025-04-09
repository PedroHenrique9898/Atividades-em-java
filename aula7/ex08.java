package aula77;

import javax.swing.JOptionPane;

public class ex08 {

    // Método para ler um array de 10 elementos
    public static int[] lerArray(int tamanho) {
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            String input = JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + ":");
            array[i] = Integer.parseInt(input);  // Converte a entrada para inteiro
        }
        return array;
    }

    // Método para gerar o array C somando os valores de A e B
    public static int[] somarArrays(int[] A, int[] B) {
        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i]; // Soma os elementos de A e B
        }
        return C;
    }

    public static void main(String[] args) {

        // Lê os arrays A e B
        JOptionPane.showMessageDialog(null, "Digite os elementos do array A");
        int[] A = lerArray(10);
        JOptionPane.showMessageDialog(null, "Digite os elementos do array B");
        int[] B = lerArray(10);

        // Gera o array C
        int[] C = somarArrays(A, B);

        // Cria uma string para exibir o resultado do array C
        StringBuilder resultado = new StringBuilder("Os elementos do array C são:\n");
        for (int i = 0; i < C.length; i++) {
            resultado.append(C[i]).append(" ");  // Concatena os elementos em uma string
        }

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
