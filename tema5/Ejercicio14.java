public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero entero para un numero base");
        int numeroBase = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca un numero entero para un exponente");
        int numeroPotencia = Integer.parseInt(System.console().readLine());
        double potencia = 1;
        
        if (numeroPotencia == 0) {
          potencia = 1;
        }
        
        if (numeroPotencia > 0) {
          for (int i = 0; i < numeroPotencia; i++) {
            potencia *= numeroBase;
          }
        }
        
        if (numeroPotencia < 0) {
          for (int i = 0; i < -numeroPotencia; i++) {
            potencia *= numeroBase;
          }
          
          potencia = 1/potencia;
        }
    
        System.out.println(numeroBase + "^" + numeroPotencia + " = " + potencia);
    }
    
}
