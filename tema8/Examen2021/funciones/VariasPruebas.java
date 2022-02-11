 import misfunciones.JabrFuncionesLineas;
public class VariasPruebas {
    public static void main(String[] args){
        System.out.print("Introduce la altura de la piramide: ");
        int altura = Integer.parseInt(System.console().readLine());
        int numespacios = altura;
        int base = 1;
        int longitud = 1;
        char extremo = '*';
        char relleno = ' ';
        for (int i = 0; i <= altura -1;i++){
            System.out.print(JabrFuncionesLineas.espaciosPorDelante(numespacios,relleno));
            if (base <= altura -1){
                System.out.println(JabrFuncionesLineas.linea(longitud,extremo,relleno));
            }else{
                relleno = '*';
                System.out.println(JabrFuncionesLineas.linea(longitud,extremo,relleno));
            }
            longitud +=2;
            numespacios--;
            base++;
        }
    }
}
    //Funciones
    public static String linea(int longitud, char extremo, char relleno) {
        String resultado = extremo + "" + extremo;
        for (int i = 0; i< longitud; i++) {
            resultado += "" + relleno;
        }
      return resultado += "" + extremo;
    }
    public static String espacio(int n) {
        return linea(n,' ',' ');
    }
}
