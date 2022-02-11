public class Alumno extends Persona {
  int numeroExpediente;
  String estudiosPrevios= "Bachillerato";
  int anoNacimiento;
  boolean esRepetidor;

  public Alumno(){
    
  }
  public Alumno(int numeroExpediente, String nombre, String apellidos) {
    this.numeroExpediente = numeroExpediente;
  }
  /*public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, String estudiosPrevios,
      int anoNacimiento, boolean esRepetidor) {
    this.numeroExpediente = numeroExpediente;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.estudiosPrevios = estudiosPrevios;
    this.anoNacimiento = anoNacimiento;
    this.esRepetidor = esRepetidor;
  }*/

public void saluda() {
  System.out.println("Hola soy " + this.getNombre());
}

public void atiende() {
  System.out.println("Estoy atendiendo en clase");
}
public void saluda(String intensidad) {
  String cadena = "Hola soy " + this.getNombre();

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

public String getNombre() {
  return this.getNombre();
}


public void presenta(){

  String cadena = "Hola, mi nombre es " + this.getNombre() + " " + this.apellidos + ", tengo " + (2022 - this.anoNacimiento) + " años";

  if(this.esRepetidor){
      cadena += " ,soy repetidor ";
  } else{
      cadena += " ,este es mi primer año ";
  }

  cadena += "y lo último que estudié fue " + this.estudiosPrevios + ", por cierto, mi número de teléfono es " + this.telefono;

  System.out.println(cadena);
}

public int dameEdad(){
  return 2022 - this.anoNacimiento;
}
}