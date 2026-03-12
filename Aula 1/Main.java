import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n, m;
	    float resultado;
	    String nome;
	    char sit;
	    
	    System.out.print("Insira o seu nome: ");
	    nome = in.nextLine();
	    System.out.print("Casado(c) ou Não Casado(n): ");
	    sit = in.nextLine().charAt(0);
	    System.out.print("Insira o primeiro valor: ");
	    n = in.nextInt();
	    System.out.print("Insira o segundo valor: ");
	    m = in.nextInt();	    
	    resultado = (float)n / m;
		System.out.println("O utilizador " + nome + " com o estado civil " + ((sit =='c' || sit == 'C') ? "é casado" : "não casado") + " solicitou um cálculo que resultou em: " + resultado);
	}
}