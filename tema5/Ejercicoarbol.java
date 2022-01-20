
public class Ejercicoarbol {
    public static void main(String[] args) {
       System.out.println("Introduzca la altura");
       int alturaIntroducida = Integer.parseInt(System.console().readLine());
       System.out.println("Introduzca la base");
       int baseIntroducida = Integer.parseInt(System.console().readLine());

       int espaciosPorDelante = alturaIntroducida -3;
       int espaciosInternos = 0;
       for (int i = 0; i < espaciosPorDelante; i++) {
           System.out.print(" ");
       }
       System.out.println("*");

       //fila de estrella
       int altura = 2;

       while (altura < alturaIntroducida -1) {
           for (int i = 1; i<=espaciosPorDelante; i++) {
               System.out.print (" ");
           }
           System.out.print("/");
           for (int i = 1; i<=espaciosInternos; i++) {
               System.out.print(" ");
           }
           if (altura > 2) {
               System.out.print("/");
           }
           System.out.println();
           altura++;
           espaciosPorDelante--;
           espaciosInternos +=2;
       }
         // base de la pirámide
    for (int i = 1; i < altura * 2 - 2; i++) {
        System.out.print("/");
      }
      System.out.println();
  
      // Pinta el tronco
      espaciosPorDelante = alturaIntroducida - 3;
      
      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      System.out.println("#");

      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      System.out.println("#");
    }
    
}
