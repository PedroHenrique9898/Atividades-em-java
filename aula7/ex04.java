package aula77;
import javax.swing.JOptionPane;
public class ex04 {
	public static void main(String[] args) {
		int [] numeros = new int [10];
		
		for (int i = 0; i < 10; i++){
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores inteiros:"));
		}
		valores(numeros);
		System.exit(0);
	}
	
	public static void valores(int [] numeros){
		for(int ii = 0; ii < 10; ii++){
			if(numeros[ii] % 2 != 0){
				JOptionPane.showMessageDialog(null,"Os valores impares digitados são:" + numeros[ii]);
			}
		}
	}

}
