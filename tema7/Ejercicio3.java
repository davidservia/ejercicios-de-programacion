import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Introduzca 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero introducido " + (i+1) + ": ");
            num[i] = Integer.parseInt(s.nextLine());
        }
        System.out.println("\nLos numeros introducidos, al reves , son los siguientes: ");
        int i;

        for (i=9; i>=0; i--) {
            System.out.println(num[i]);
        }




    }
    
}
