package aula5;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		calcularMedia();
		System.exit(0);
	}
	
	public static void calcularMedia(){
		String nome;
		double media1, media2, media3;
		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		media1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira média:"));
		media2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda média: "));
		media3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua terceira média: "));
		
		double mediaFinal = (media1 + media2 + media3) / 3; 
	
		if (mediaFinal <= 5 ){
			System.out.println("situação reprovado!");
		}
		if ((mediaFinal >= 5) && (mediaFinal <= 7)){
			System.out.println("Situação recuperação!");
		}
		if (mediaFinal >= 7){
			System.out.println("Situação aprovado!");
		}
	}

}
