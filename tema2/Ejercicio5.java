/**
 * 2. Variables
 *
 * 5. Realiza un conversor de pesetas a euros. La cantidad en pesetas
 *    que se quiere convertir deberá estar almacenada en una variable.
 *
 * @author LDavid Servia Morales
 */
public class Ejercicio5 {
  public static void main(String[] args) {
    int pesetas = 10000;
    double euros = pesetas / 166.386;
    
    System.out.println(pesetas + " pesetas son " + euros + " euros.");
    // Para mostrar dos decimales se puede usar "printf"
    // en lugar de "print" o "println"
    System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
  }
}
