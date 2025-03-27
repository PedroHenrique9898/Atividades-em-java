package aula5;
import javax.swing.JOptionPane;
public class ex5 {

	public static void main(String[] args) {
		estadoCivil();
		System.exit(0);
	}
	
	public static void estadoCivil(){
		String nome;
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String estado = JOptionPane.showInputDialog("    S - Solteiro "
													+ " C - Casado "
													+ " V - Viuvo  "
													+ " D - Divorciado "
													+ " digite a op desejda");
		switch (estado){
		case "S":
			System.out.println("O(A)" + nome + "tem o estado civil solteiro");
			break;
		case "C":
			System.out.println("O(A)" + nome + "tem o estado civil casado(a)");
			break;
		case "V":
			System.out.println("O(A)" + nome + "tem o estado civil casado(a)");
			break;
		case "D":
			System.out.println("O(A)" + nome + "tem o estado civil divorciado(a)");
			break;	
		}
	}

}
