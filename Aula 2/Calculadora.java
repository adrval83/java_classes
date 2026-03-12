//Realize 1 das 4 opreações aritméticas, escolhida pelo utilizador

import java.util.Scanner;
public class Calculadora
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    char op;
	    float n1, n2, res;

	    System.out.print("Insira o primeiro valor: ");
	    n1 = in.nextFloat();
	    System.out.print("Insira o segundo valor: ");
	    n2 = in.nextFloat();
	    System.out.print("Escolha a operação a realizar \nSomar(+), Subtrair(-), Multiplicar(*) ou Dividir(/): ");
	    op = in.next().charAt(0);
	    
	    switch(op)
	    {
	        case'+':
                System.out.println(res=n1+n2);
                break;
                
            case'-':
                System.out.println(res=n1-n2);
                break;
                
            case'*':
                System.out.println(res=n1*n2);
                break;
                
            case'/':
                if(n2 == 0)
                    System.out.println("Não é possível dividir um número por 0");
                   
                else 
                    System.out.println(res=n1/n2);
                    break;
                
	       default:
	   	       System.out.println("Resultado inválido"); 
	           
	        
	    }
	}
}