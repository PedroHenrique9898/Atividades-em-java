package aula77;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int maior = 0, menor = 99;
    int[] numeros = new int[10];
        Scanner dados = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = dados.nextInt();
            if (numeros[i] > maior) {
            maior = numeros[i];
            }
            if (numeros[i] < menor) {
            menor = numeros[i];
            }            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Numeros: " + numeros[i]);
        }
        System.out.println("Maior valor do array: " + maior);        
        System.out.println("Menor valor do array: " + menor);
        dados.close();
    }
}

