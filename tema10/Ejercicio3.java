import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Introduzca 10 números enteros: ");

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(System.console().readLine()));
        }

        System.out.println("Lista original: " + list);
        Collections.sort(list);

        System.out.println("Lista ordenada de menor a mayor: " + list);
    }
    
}
