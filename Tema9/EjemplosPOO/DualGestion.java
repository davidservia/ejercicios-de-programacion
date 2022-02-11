public class DualGestion {
    public static void main(String[] args) {
        System.out.println("Dual Gestion");
        System.out.println("=============");

        
        Alumno alumno1 = new Alumno();
        /*Alumno pepillo = new Alumno(1234, "José", "Pérez López");
        Alumno alan = new Alumno(6789, "Alan", "Brito Delgado", "555 12345", "SMR", 2000, false);*/

       /* System.out.println(pepillo);
        pepillo.saluda("fuerte");
        alan.saluda();
        System.out.println(pepillo.getNombre());*/
        Persona unMenda = new Persona();
        Profesor profe1 = new Profesor();

        alumno1.saluda();
        alumno1.atiende();
        profe1.explica();
        profe1.saluda();
    }
}
