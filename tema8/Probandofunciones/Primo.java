public class Primo {
    public static void main(String[] args) {
        boolean esPrimo = true;
        int[] numeros = new int [50];
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio(1, 100);
        }
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("\nPrimos: ");

        for (int n: numeros) {
            if (esPrimo(n)) {
                System.out.print(n + " ");
            }
        }
}

/*Funciones*/
public static int aleatorio(int inicio, int fin) {
    return (int)(Math.random() * (fin - inicio +1)) + inicio;

}
public static boolean esPrimo(int numero) {
    for (int i = 2; i < numero; i++) {
    if ((numero % i) == 0) {
    return false;
    }
    }
    return true;
    

}

}
