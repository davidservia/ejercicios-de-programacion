public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero positivo y entero: ");
        int numeroEntero = Integer.parseInt(System.console().readLine());

        if(numeroEntero>0) {
            for(int i=0; i<=100; i++) {
            System.out.println(numeroEntero + i);
        }
    }   else {
        System.out.println("Introduzca un numero positivo");       
    }

    }
    
}
