public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String domicilio;
    

    public String getNombre() {
        return nombre;
    }


    public void saluda(String intensidad) {
        String cadena = "Hola soy " + this.nombre;
        if(this.nombre==null) {
            System.out.println("Hola");
        }else {
            System.out.println("Hola soy " + this.nombre);
        }
        
    
      
        switch(intensidad) {
          case "fuerte":
          cadena = cadena.toUpperCase();
          break;
          case "debil":
          cadena = cadena.toLowerCase();
          break;
          default:
        }
        System.out.println(cadena);
      }
}

