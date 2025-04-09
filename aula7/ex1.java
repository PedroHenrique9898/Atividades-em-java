package aula77;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // Criar um array para armazenar 10 temperaturas
        double[] temperaturas = new double[10];

        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner dados = new Scanner(System.in);

        // Armazena a temperatura no array
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a Temperatura: ");
            temperaturas[i] = dados.nextDouble();  
        }
        // Exibindo as temperaturas digitadas
        for (int i = 0; i < 10; i++) {
            System.out.println("Temperaturas: " + temperaturas[i]);
        }
        dados.close();
    }
}

