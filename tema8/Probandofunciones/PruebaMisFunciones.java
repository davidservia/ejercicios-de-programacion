import java.util.Scanner;
public class PruebaMisFunciones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la nota del primer trimestre");
        double nota1 = Double.parseDouble(s.nextLine());
        System.out.println("Introduzca la nota del primer trimestre");
        double nota2 = Double.parseDouble(s.nextLine());

        double mediaTrimestre = nota1 * 0.4 + nota2 *0.6;

        System.out.println("La nota del trimestre es " + mediaTrimestre);
    
    }
    
}
