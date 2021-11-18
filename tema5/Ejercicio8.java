public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entreo y le mostraré la tabla de multiplicar: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int i = 0;
        while (i <= 10) {
            System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
            i++;

        }
    }
}
