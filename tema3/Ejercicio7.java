/**
 * 3. Lectura de datos desde teclado
 *
 * 7. Escribe un programa que calcule el total de una factura a partir
 *    de la base imponible.
 *
 * @author David Servia Morales
 */

public class Ejercicio7 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
    double baseImponible = Double.parseDouble(System.console().readLine());

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
  }
}
