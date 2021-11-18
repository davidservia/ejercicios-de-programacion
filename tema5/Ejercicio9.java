public class Ejercicio9 {
    public static void main(String[] args) {
     System.out.print("Introduce num: ");
     int num = Integer.parseInt(System.console().readLine());
      int i = 0;
      do {
          num = num / 10;
          i++;
      } while (num > 0);

      System.out.println("Num digitos: " + i);
      
    }
    
}
