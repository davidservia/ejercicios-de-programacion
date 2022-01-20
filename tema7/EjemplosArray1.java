public class EjemplosArray1 {
    public static void main(String[] args) {
        String articulo;
        double[] precios;
         //define la estructura del array
        precios = new double[5]; //memoria del array
        articulo ="PS5";
        precios[0] = 350;
        precios[1] = 500;
        precios[2] = 499;
        precios[3] = 300;
        precios[4] = 400;

     //   double[] precios = new double[5] version corta.

     for (int i = 0; i < precios.length; i++) {
         System.out.printf("%.2f\n", precios[0]);
     }
       // System.out.printf("%.2f\n", precios[0]);
       // System.out.printf("%.2f\n", precios[2]);
    }
}