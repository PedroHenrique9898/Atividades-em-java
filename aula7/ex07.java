//Construir um programa JAVA que contenha um m�todo que recebe como par�metro um array de 10 n�meros inteiros e ap�s, mostre 
//somente os valores negativos digitados.
package aula77;
import javax.swing.JOptionPane;
public class ex07 {

	public static void main(String[] args) {
		int [] numeros = new int [10];
		
		for(int i = 0; i < 10; i++){
			
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valores negativos e positivos: "));
			
		}
		valores(numeros);
		System.exit(0);
	}
	
	public static void valores(int [] numeros){
		
		for(int ii = 0; ii < 10; ii++){
			
			if(numeros[ii] < 0){
				JOptionPane.showMessageDialog(null,"O valor � negativo" + numeros[ii]);
			} 
		}
	}

}
