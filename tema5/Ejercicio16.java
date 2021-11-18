public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Introduzca por teclado un numero");
        int numPrimos = Integer.parseInt(System.console().readLine());
        boolean esPrimo = true;

        for (int i = 2; i < numPrimos; i++) {
            if ((numPrimos% i) == 0) {
                esPrimo = false;
            }
        }
        if (esPrimo) {
            System.out.println("El numero es Primo");
        } else {
            System.out.println("El numero introducido no es primo");
        }
        }
    }
    
    

