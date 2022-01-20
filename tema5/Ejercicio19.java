import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce un caracteres para la piramide: ");
       String caracter = s.nextLine();
        System.out.print("Introduce un numero para la altura de la piramide: ");
        int altura = s.nextInt();
        int longitudLinea = 1;
        int planta = 1;
        int espacios = altura -1;

        while (planta <= altura) {

            
            //inserta espacios 
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
             }
             System.out.print(caracter);
            //pinta la linea
            for (int i = 1; i < longitudLinea; i++) {
                System.out.print(caracter);
            }
            System.out.print(caracter);
            System.out.println();
            planta ++;
            espacios --;
            longitudLinea += 2;
            
        }



    }
    
}
