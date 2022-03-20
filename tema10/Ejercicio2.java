import java.util.ArrayList;
public class Ejercicio2 {
    public static void main(String[] args) {
        int suma = 0;
        int minimo = 100;
        int maximo = 0;
        int tamano = (int) (Math.random() *11+10);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < tamano; i++) {
            list.add((int)(Math.random()*101));
        }

        System.out.println("Lista" + list);

        for (int n : list) {
            suma += n;
        
        if (n < minimo) {
            minimo= n;
        }
        if (n > maximo) {
            maximo= n;
        }
        }
        System.out.println("La suma total es: " + suma);
        System.out.println("La media es : " + suma / tamano);
        System.out.println("El minimo es : " + minimo);
        System.out.println("El maximo es : " + maximo);



    }
    
}
