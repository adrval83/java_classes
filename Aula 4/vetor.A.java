/******************************************************************************

-> Arrays, Matrizes, Vetores, e afins

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
 	    Scanner sc = new Scanner(System.in);
        int i; //contador de voltas no ciclo
        float media, soma=0;
	    System.out.println("Quantas notas pretende registar?");
	    int tam = sc.nextInt();
	    float[] notas=new float[tam];
	    for(i=0;i<notas.length;i++)
	    {
	        System.out.println("Insira a nota " + (i+1) + ":");
	        notas[i] = sc.nextInt();
//	        soma = soma + notas[i];
            soma += notas[i];
	    }
	    media = soma / tam;
//      media = soma / i;
	    System.out.print("Os elementos recebindos foram: ");
	    for(i=0;i<notas.length;i++)
        {
            System.out.print(notas[i] + " ");
        }	    
//	    System.out.printf("\nA média é: %5.2f",media);
	    System.out.printf("\nA média é:\t %.2f",media);
	}
}
