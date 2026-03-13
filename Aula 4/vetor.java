/******************************************************************************

-> Arrays, Matrizes, Vetores, e afins

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
 	    Scanner sc = new Scanner(System.in);
        int i; //contador de voltas no ciclo	    
	    System.out.println("Quantas notas pretende registar?");
	    int tam = sc.nextInt();
	    int[] notas=new int[tam];
	    for(i=0;i<notas.length;i++)
	    {
	        System.out.println("Insira a nota " + (i+1) + ":");
	        notas[i] = sc.nextInt();
	    }
	    System.out.print("Os elementos recebindos foram: ");
	    for(i=0;i<notas.length;i++)
        {
            System.out.print(notas[i] + " ");
        }	    
	    
//	    System.out.println("Número de posições do vetor notas: " + notas.length);
	    
	    
	    
	    
//	    int[] nota = new int[10]; (também pode ser assim)
//		int nota[] = new int[10]; //(guarda 10 posições de memória)
	}
}
