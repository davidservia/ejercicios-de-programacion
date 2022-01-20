import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        int minimo = Integer.MIN_VALUE;
        int maximo = Integer.MAX_VALUE;
        System.out.println("Introduzca diez numeros por pantalla");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero Introducido " + (i + 1) + ": ");
            num[i] = Integer.parseInt(s.nextLine());



            if (num[i] < minimo) {
                minimo = num[i];
            }
            if (num[i] > maximo) {
                maximo = num[i];
            }
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i]);
            if (num[i] == maximo) {
                System.out.print(" maximo");
            }
            if (num[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }
    }
}
