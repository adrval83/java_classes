//Dado um numéro verificar se é impar, par ou zero

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	float m;
    Scanner in = new Scanner(System.in);
	System.out.print("Insira o numero a verificar: ");
	m = in.nextFloat();
	if (m==0)
	{
	   System.out.print("O número inserido "+ m +" é zero");
	}
	else if(m%2==0)
	{
	   System.out.print("O número inserido "+ m +" é par");
	}
	else
	{
	   System.out.print("O número inserido "+ m +" é impar");
	}
	    
	}
}
