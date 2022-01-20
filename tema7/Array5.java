public class Array5 {
    public static void main(String[] args) {
        double[] nota = new double[4];
        System.out.println("Para calcular la nota media necesito saber la ");
        System.out.println("nota de cada uno de tus examenes.");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota del examen nº " + (i+1) + ": ");
            nota[i] = Double.parseDouble(System.console().readLine());
        }
        System.out.print("Tus notas son: ");
        double suma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print(nota[i] + " ");
            suma += nota[i];
        }
        System.out.println("\nLa media es " + suma / 4);


    }
    
}
