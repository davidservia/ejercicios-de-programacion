import java.util.Scanner;
public class Ejercicio6prueba {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[15];
        int i;
        System.out.printf("\nVaya introduciendo números enteros : \n");
        
        for (i = 0; i < numero.length; i++) {
            numero[i]=Integer.parseInt(s.nextLine());
        }

        System.out.println("Array original");
        for (i = 0; i < numero.length; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        for (i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");

    }
    
}
