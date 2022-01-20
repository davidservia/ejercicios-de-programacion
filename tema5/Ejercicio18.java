import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroMin;
        int numeroMax;
        System.out.print("Introduzca dos numeros separados por espacios: ");
         numeroMin = s.nextInt();
         numeroMax = s.nextInt();
         if(numeroMin == numeroMax) {
            System.out.println("Los números introducidos no son válidos, deben ser distintos.");
          }
         while (numeroMin == numeroMax);
        
        // si el primer número es mayor que el segundo, se intercambian los valores
        if (numeroMin > numeroMax) {
          int aux = numeroMin;
          numeroMin = numeroMax;
          numeroMax = aux;
        }
        for (int i = numeroMin; i < numeroMax; i+= 7) {
            System.out.println(i + " ");
        }

    }
}