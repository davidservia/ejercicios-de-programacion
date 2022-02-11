package superanimales;
public class Perro extends Mamifero {
    private String tipoDeLadrido;

    public Perro(String nombre, String color, int mesesDeGestacion, String tipoDeLadrido) {
        super(nombre, color, mesesDeGestacion);
        this.tipoDeLadrido = tipoDeLadrido;
    }

    
    
}
