import java.util.Scanner;
public class CuentaPositivos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Por favor, vaya introduciendo numeros y pulsando Intro.");
        System.out.println("Para terminar, introduzca un numero negativo.");
        int numeroIntroducido = 0;
        int cuentaNumeros = 0;
        int suma = 0;

        while (numeroIntroducido >= 0) {
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            cuentaNumeros++;
            suma += numeroIntroducido;

            System.out.println("Has introducido " + (cuentaNumeros - 1) + " numeros positivos");
            System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));
        }
    }
    
}
