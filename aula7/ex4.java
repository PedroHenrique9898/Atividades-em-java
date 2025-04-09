package aula77;
import javax.swing.JOptionPane;
public class ex4 {

	public static void main(String[] args) {
		int pares = 0, impares = 0;
		int [] valores = new int [10];
		
		for (int i = 0; i < 10; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros impares e pares:"));
			
			if (valores[i] % 2 == 0){
				pares++;
			}else{
				impares++;
			}   
		}
		JOptionPane.showMessageDialog(null, "Os valores impares são:" + impares + "os valores pares são:" + pares);
	}
} 


