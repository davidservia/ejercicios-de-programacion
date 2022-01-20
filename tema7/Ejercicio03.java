public class Ejercicio03 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        System.out.println("Introduzca diez numeros por teclado");
        for (int i = 0; i <10; i++) {
            System.out.print("Introduzca el numeroº " +(i+1)+ ": ");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Los numeros introducidos al reves son los siguientes: ");
        int i;
        for (i = 10; i > 0; i--) {
            System.out.println(numeros[i]);
        }


    }
    
}
