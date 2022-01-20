public class Ejercicio4 {
    public static void main(String[] args) {
        int[] num = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        int i;
        for (i = 0; i < 20; i++) {
            num[i] =(int)(Math.random()*101);
            cuadrado[i] = num[i] *num[i];
            cubo[i] = num[i] * num[i];
        }

    System.out.println("\nA continuacion se muestran en tres columnas, un número aleatorio entre 0 y 100, su cuadrado y su cubo:\n");

    System.out.println(" n | n2 | n3\n-----|-------|-------");
    for (i = 0; i < 20; i++) {
        System.out.printf("%4d | %5d |%8d\n", num[i], cuadrado[i], cubo[i]);

    }

    }
    
}
