package pruebaEjercicio8;

import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Cartas> c =new ArrayList<Cartas>();

        Cartas carta2 = new Cartas();
        c.add(carta2);

        for (int e = 0; e<13; e++) {
            do {
                carta2 = new Cartas();
                c.add(carta2);
                        carta2 = new Cartas();
                    } while (c.contains(carta2));
                c.add(carta2);
                }
                for (Cartas miCarta: c) {
                    System.out.println(miCarta);
                }
            
        
    }
}
