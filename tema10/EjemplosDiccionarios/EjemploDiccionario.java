import java.util.HashMap;
import java.util.Scanner;

public class EjemploDiccionario {
    public static void main(String[] args) {
        HashMap<String, String> asignaturas = new HashMap<String, String>();
        asignaturas.put("PRO", "Programacion");
        asignaturas.put("LM", "Lenguajes de marcas");
        asignaturas.put("BBDD", "Bases de datos");
        asignaturas.put("ED", "Entorno de desarrollo");
        asignaturas.put("FOL", "Formacion y orientacion laboral");

        Scanner s = new Scanner(System.in);
        do {
        System.out.print("Introudzca el codigo de la asignatura: ");
        String codigoIntroducido = s.nextLine().toUpperCase();

            if (!(asignaturas.containsKey(codigoIntroducido))) {
            System.out.println("No existe esa asignatura registrada");
            System.out.println("Desea registrarla ?, utilize S/N");
            String respuesta = s.nextLine().toUpperCase();

            if((respuesta.equals("S"))){
                System.out.print("Introduzca el nombre de la asignatura: ");
                String asignaturaNueva =s.nextLine();
                asignaturas.put(codigoIntroducido, asignaturaNueva);
            }
            } else {System.out.println("Al codigo " + codigoIntroducido + " le corresponde la asignatura " + asignaturas.get(codigoIntroducido) + ".");
            }
           /* if (quieroRegistrarla = ) {
                System.out.println("Introduzca el codigo separados por coma de su nombre");
                asignaturas.put(s.next());

            }
        } else { */
            }while (!codigoIntroducido.equals("0"));
        }
    }    
        
     
    
}
