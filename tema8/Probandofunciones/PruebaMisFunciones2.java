import java.util.Scanner;
public class PruebaMisFunciones2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int [50];
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio(1, 100);
        }
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("Primos: ");

        for (int n: numeros) {
            if (esPrimo(n)) {
                System.out.print(n + " ");
            }
        }
        
        /*System.out.println("Introduzca la nota de los examenes separada por espacios");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        s.nextLine();
        double mediaTrimestre = nota1 * 0.4 + nota2 *0.6;

        System.out.println("La nota del trimestre es " + mediaTrimestre(nota1, nota2));
        */
    }
    
    // Funciones ////////////

    /**
     * Genera un valor entero aleatorio entre <code>inicio</code> y <code>fin</code> 
     * @param inicio valor minimo a devolver
     * @param fin valor maximo a devolver
     * @return un numero aleatorio entre <code>inicio</code> y <code>fin</code>
     */
public static double mediaTrimestre(double notaControl1, double notaControl2) {
        double resultado = notaControl1 *0.4 + notaControl2*0.6;
        return resultado;

}
public static int aleatorio(int inicio, int fin) {
    return (int)(Math.random() * (fin - inicio +1)) + inicio;

}

/**
 * Nos dice si un numero entero es o no primo,
 * es decir, si es divisble unicamente entre
 * si mismo y la unidad.
 * 
 * @param numero entero positivo
 * @return <code>true</code> si<code>numero</code> es primo y false en caso contrario.
 * 
 */
public static boolean esPrimo(int numero) {
    for (int i = 2; i < numero; i++) {
    if ((numero % i) == 0) {
    return false;
    }
    }
    return true;
    

}
}
    

