public class PruebaValorYReferenciaCorregido {
    public static void main(String[] args) {
      // int x = 50;
      // suma5(x);
      // System.out.println("x del main: " + x);
  
      int[] numeros = {4, 7, 11, 22, 55, 60};
      suma5(numeros);
      System.out.println();
      System.out.print("n desde el main: ");
      for (int i : numeros) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  
    // Se pasa la x como parámetro por valor
    public static void suma5(int x) {
      x = x + 5;
      System.out.println("x desde suma5: " + x);
    }
  
    public static int[] suma5(int[] n) {
      int[] resultado = new int[n.length];
  
      for (int i = 0; i < n.length; i++) {
        resultado[i] = n[i] + 5;
      }
  
      System.out.print("n desde suma5: ");
      for (int i : resultado) {
        System.out.print(i + " ");
      }
  
      return resultado;
    }
  }