package PruebaEjercicio5;
public class Disco {
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duración total en minutos
  
    public Disco(String c, String a, String t, String g, int d) {
      this.codigo = c;
      this.autor = a;
      this.titulo = t;
      this.genero = g;
      this.duracion = d;
    }
  
    public String getCodigo() {
      return codigo;
    }
  
    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }
    
    public String getAutor() {
      return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        String cadena = "\n-------------------------";
        cadena += "\nCodigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTitulo: " + this.titulo;
        cadena += "\nGenero: " + this.genero;
        cadena += "\nDuracion: " + this.duracion;
        cadena += "\n--------------------------------";

        return cadena;
    }
    @Override
    public boolean equals(Object d) {
        return(this.codigo).equals(((Disco)d).getCodigo());
    }


}