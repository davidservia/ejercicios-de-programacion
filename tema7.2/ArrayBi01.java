public class ArrayBi01 {
public static void main(String[] args)
throws InterruptedException {

    int[] [] n = new int [3] [2];
    n[0] [0]=20;
    n[1] [0]=67;
    n[1] [1]=33;
    n[2] [1]=7;

    int fila, columna;

    for(fila = 0; fila <3; fila++) {
        System.out.print("Fila: " + fila);
    
    for (columna=0; columna < 2; columna++) {
        System.out.printf("%10d ", n[fila] [columna]);
        Thread.sleep(1000);
    }
    System.out.println();
    }
}
}
/**Para saber el numero para saber como de grande es el array 
 System.out.println("Filas: " + n.legth);
 System.out.println("Columnas: " + n[0].length);
*/