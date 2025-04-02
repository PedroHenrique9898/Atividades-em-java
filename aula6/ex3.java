package aula6;
import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {
	int[] numeros = new int [10];	
	int  positivo = 0, negativo = 0;
	for(int i = 0; i < 10; i++){
		numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros positivos e negativos: "));
		 
		if(numeros[i] >= 0)
		{
			positivo++;
		}
		if(numeros[i] < 0)
		{
			negativo++;
		}
	}
	for(int i = 0; i < 10; i++)
	{
		JOptionPane.showMessageDialog(null, "os numeros digitados foram:" + numeros[i]);
	}
		JOptionPane.showMessageDialog(null, "os numeros positivos são:" + positivo);
		JOptionPane.showMessageDialog(null, "os numeros  negativos são:" + negativo);
	
	}
}
