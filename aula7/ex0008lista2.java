import javax.swing.JOptionPane;

public class lista2_ex8 {
    
    // Método que faz a união dos arrays A e B em um array R
    public static int[] unirArrays(int[] A, int[] B) {
        int[] R = new int[10];
        
        // Preenche o array R com os valores de A
        for (int i = 0; i < 5; i++) {
            R[i] = A[i];
        }
        
        // Preenche o array R com os valores de B
        for (int i = 0; i < 5; i++) {
            R[5 + i] = B[i];
        }
        
        return R;
    }

    // Método para ler um array de inteiros usando JOptionPane
    public static int[] lerArray(int n) {
        int[] array = new int[n];
        String input;
        
        // Solicita ao usuário que insira os números
        for (int i = 0; i < n; i++) {
            input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:");
            array[i] = Integer.parseInt(input);  // Converte a entrada para inteiro
        }
        return array;
    }
    

    public static void main(String[] args) {
        // Lê os arrays A e B
        JOptionPane.showMessageDialog(null, "Valores do array A:");
        int[] A = lerArray(5);
        JOptionPane.showMessageDialog(null, "Valores do array B:");
        int[] B = lerArray(5);
        
        // Cria o array R com a união de A e B
        int[] R = unirArrays(A, B);
        
        // Constrói a string para exibir os valores do array R
        StringBuilder resultado = new StringBuilder("Mostrar Array R (união de A e B): ");
        for (int i = 0; i < R.length; i++) {
            resultado.append(R[i]).append(" ");  // Adiciona cada valor de R à string
        }
        
        // Exibe o array resultante em uma caixa de mensagem
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
