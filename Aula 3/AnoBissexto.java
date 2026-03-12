/******************************************************************************

->Dado um ano, é bissexto?

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("\n********************************");
        System.out.print("\n*                              *");
        System.out.print("\n* Verificadora de Ano Bissexto *");
        System.out.print("\n*                              *");
        System.out.print("\n********************************");
        System.out.print("\n\nInsira um ano: ");
        int ano = in.nextInt();

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            System.out.println("\n\nO ano  " + ano + ", é bissexto.");
        } else {
            System.out.println("\n\nO ano  " + ano + ", não é bissexto.");
        }

        in.close();
    }
}