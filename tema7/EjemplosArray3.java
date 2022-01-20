public class EjemplosArray3 {
    public static void main(String[] args) {
        String[] frutas = new String[6];
        System.out.println("Introduzca 6 nombres de fruta y vaya pulsando Intro");
        //Lee los datos de teclados
        for (int i = 0; i < 6; i++) {
            frutas[i] = System.console().readLine();

        }
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        } 

    }
    
}
