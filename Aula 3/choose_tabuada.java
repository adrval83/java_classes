/******************************************************************************

-> Mostrar a tabuada que o utilizador pedir.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n********************************");
        System.out.print("\n*                              *");
        System.out.print("\n*         Tabuada do ??        *");
        System.out.print("\n*                              *");
        System.out.print("\n********************************");
        System.out.print("\n\nEscolha a tabuada que deseja mostrar: ");
        int numero = sc.nextInt();
        
        System.out.println("\nTabuada do " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x ^0" + i + " = " + (numero * i));
        }
        
        sc.close();
    }
}