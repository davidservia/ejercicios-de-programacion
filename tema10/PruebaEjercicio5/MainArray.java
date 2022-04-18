package PruebaEjercicio5;

import java.util.ArrayList;
import java.util.Scanner;



/*pero tengo un problema que tengo que estar revisando
 mucho los ejercicios de usted porque no soy capaz de procesarlos por mi solo los practico y los entiendo */

public class MainArray {
    public static void main(String[] args){

        ArrayList<Disco> album = new ArrayList<Disco>();

        int i;
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        String duracionIntroducidaString;
        int opcion;
        int opcionListado;
        int duracionIntroducida;
        int limiteInferior;
        int limiteSuperior;

        Scanner s = new Scanner(System.in);

        album.add(new Disco("1", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        album.add(new Disco("2","pepito","el album de pepito","banda sonora",35));
        album.add(new Disco("3","manolito","el album de manolito","album de manolito", 45));

        do {
            System.out.println("\n\nCOLECCION DE DISCOS");
            System.out.println("==================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opcion: ");
            opcion = Integer.parseInt(System.console().readLine());

            switch(opcion) {
                //Listar///////////////////
               case 1:
               do {
                System.out.println("\n\nCOLECCION DE DISCOS");
                System.out.println("==================");
                System.out.println("1. Completo");
                System.out.println("2. Por autor");
                System.out.println("3. Por genero");
                System.out.println("4. En un rango de duracion");
                System.out.println("5. Menu principal");
                System.out.print("Introduzca una opcion: ");
                opcionListado = Integer.parseInt(System.console().readLine());

                switch(opcionListado) {
                    case 1: //listado completo////
                    for(Disco d: album) {
                        System.out.println(d);
                    }
                    break;

                    case 2: //lsitado por autor//////
                    
                    System.out.print("Introduce el autor: ");
                    autorIntroducido = s.nextLine();

                    for (Disco d : album) {
                        if(d.getAutor().equals(autorIntroducido)) {
                            System.out.println(d);
                        }

                    }
                    break;

                    case 3: //listado por genero//////
                    System.out.print("Introduzca el género: ");
                    generoIntroducido = s.nextLine();

                    for(Disco d : album) {
                        if(d.getGenero().equals(generoIntroducido)) {
                            System.out.println(d);
                        }
                    }
                    break;

                    case 4: //listado de rango de duracion //

                    System.out.println("Introduzca un intervalo de duracion");
                    System.out.print("Introduzca el limite inferior");
                    limiteInferior = Integer.parseInt(s.nextLine());
                    System.out.print("Introduce el limite superior");
                    limiteSuperior= Integer.parseInt(s.nextLine());

                    for (Disco d: album){
                        //if ((d.getDuracion() <= limiteSuperior) && (d.getDuracion() >= limiteInferior)) {
                          //  System.out.println(d);

                        }
                    }





                }

            }
        }

    }
    
}
}
