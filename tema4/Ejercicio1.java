/**
 * 4. Sentencia Condicional
 *
 * 1. Escribe un programa que pida por teclado un día de la semana
 *    y que diga qué asignatura toca a primera hora ese día.
 *
 * @author David Servia Morales
 */

public class Ejercicio1 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
    dia = (System.console().readLine()); 
    dia.toLowerCase(); // convierto a minúsculas todas las letras
    
    switch(dia) {
      case "lunes":
        System.out.println("Lenguaje de Marca");
        break;
      case "martes":
        System.out.println("Entorno de desarrollo");
        break;
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Sistemas Informáticos");
        break;
      case "viernes":
        System.out.println("Bases de Datos");
        break;
      case "sábado":
        System.out.println("FIESTAAAAAAAAA");
        break;
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
  }
}
