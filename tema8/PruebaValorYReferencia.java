public class PruebaValorYReferencia {
    public static void main(String[] args) {
        int x = 50;
        suma5(x);
        System.out.println("x del main: " + x);
        int[] numeros = {4, 7, 11, 22, 55, 60};
        suma5(numeros);
        System.out.println("n del main: " + numeros);
        for( int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println();
        
    }
// se pasa la x como parametro como valor
public static void suma5(int x) {
    x = x + 5;
    System.out.println("x desde suma5: " + x);
    
}
public static void suma5(int[] n) {
    for (int i = 0; i<n.length; i++) {
        n[i] = n[i] + 5;
    }
    System.out.print("n desde suma5: ");
    for (int i: n) {
        System.out.print(i + " ");
    }
System.out.println("n desde suma5: " + n);
}
}
