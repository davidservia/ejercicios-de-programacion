package misfunciones;
public class Matematicas {
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

/*Calcula la media aritmetica de 3 numeros */


public static double media(double n1, double n2, double n3) {
    return (n1 +n2+n3)/3;
}
public static double media (int n1, int n2, int n3) {
    return media((double)n1, (double)n2, (double)n3);
}
}   

