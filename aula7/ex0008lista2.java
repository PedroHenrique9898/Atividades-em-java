import javax.swing.JOptionPane;

public class lista2_ex8 {
    
    // M�todo que faz a uni�o dos arrays A e B em um array R
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

    // M�todo para ler um array de inteiros usando JOptionPane
    public static int[] lerArray(int n) {
        int[] array = new int[n];
        String input;
        
        // Solicita ao usu�rio que insira os n�meros
        for (int i = 0; i < n; i++) {
            input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "� n�mero:");
            array[i] = Integer.parseInt(input);  // Converte a entrada para inteiro
        }
        return array;
    }
    

    public static void main(String[] args) {
        // L� os arrays A e B
        JOptionPane.showMessageDialog(null, "Valores do array A:");
        int[] A = lerArray(5);
        JOptionPane.showMessageDialog(null, "Valores do array B:");
        int[] B = lerArray(5);
        
        // Cria o array R com a uni�o de A e B
        int[] R = unirArrays(A, B);
        
        // Constr�i a string para exibir os valores do array R
        StringBuilder resultado = new StringBuilder("Mostrar Array R (uni�o de A e B): ");
        for (int i = 0; i < R.length; i++) {
            resultado.append(R[i]).append(" ");  // Adiciona cada valor de R � string
        }
        
        // Exibe o array resultante em uma caixa de mensagem
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
