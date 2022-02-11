/*Ejercicio 1*/
//Autor @David Servia Morales
import matematicas.Varias;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        //primer apartado capicua////
        System.out.print("Introduce un numero para comprobar si es capicua: ");
        int a = Integer.parseInt(System.console().readLine());
        if (matematicas.Varias.esCapicua(a)) {
            System.out.println("El " + a + " es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }

        //segundo apartado primo////////////////////////////////
        System.out.print("Introduce un numero para comprobar si es primo: ");
        int b= Integer.parseInt(System.console().readLine());
        if (matematicas.Varias.esPrimo(b)) {
            System.out.println("El " + b + " es primo");
        } else {
            System.out.println("El numero no es primo");
        }

        // siguientePrimo /////////////////////////////
        System.out.print("Introduzca un numero y le dira el siguiente primo a ese numero: ");
        int c = Integer.parseInt(System.console().readLine());
        System.out.println("El siguiente primo mayor al numero introducido es: " + matematicas.Varias.siguientePrimo(c));

        //potencia//////////////////
        System.out.print("Introduzca dos numeros seguidos por espacio y le dira el resultado de su potencia: ");
        int d= s.nextInt();
        int e= s.nextInt();
        System.out.println(d + "^" + e + " = " + matematicas.Varias.potencia(d, e));
        
        // digitos //////////////////////////////////
        System.out.print("Introduzca un numero para utilizar el cuenta digitos: ");
        int f= Integer.parseInt(System.console().readLine());
        System.out.println("El numero " + f + " tiene " + matematicas.Varias.digitos(f)+ " digitos");

        //voltea///////////
        System.out.print("Introduzca un numero para utilizar el cuenta digitos: ");
        int g=Integer.parseInt(System.console().readLine());
        System.out.println("El numero " + e + " volteado es " + matematicas.Varias.voltea(e));

        //digitoN////////////
        System.out.print("Introduzca un numero para utilizar en el localizador de posicion");
        int h=Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca con un numero la posicion");
        int i=Integer.parseInt(System.console().readLine());
        System.out.println("En el numero " + h + " en la posicion " + i + " se encuentra " + matematicas.Varias.digitoN(h, i));

        //posicionDeDigito//////////////////
        System.out.print("Introduzca un numero para utilizar en el localizador de posicion");
        int j=Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca con un numero la posicion");
        int k=Integer.parseInt(System.console().readLine());
        System.out.println("En el numero " + h + " en la posicion " + i + " se encuentra " + matematicas.Varias.posicionDeDigito(h, i));

        //quitaPorDetras/////////////
        System.out.print("Introduzca un numero para utilizar en quitapordetras");
        int l=Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca cuantos digitos quiere quitar");
        int m=Integer.parseInt(System.console().readLine());
        System.out.println("Si al " + l + " se le quitan por detras " + m + " se queda como " + matematicas.Varias.quitaPorDetras(l, m));

        //quitaPorDelante//////////
        System.out.println("Introduzca un numero para utilizar en quitapordelante");
        int n= Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca cuantos digitos quiere quitar");
        int o= Integer.parseInt(System.console().readLine());
        System.out.println("Si al numero " + n + " se le quita por delante " + o + " se queda como " + matematicas.Varias.quitaPorDelante(n,o));

        //pegaPorDetras///////////
        System.out.println("Introduzca un numero para utilizar en pegaPorDetras");
        int p= Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca los digitos a pegar por detras");
        int q= Integer.parseInt(System.console().readLine());
        System.out.println("Si al " + p + " se le pega por detras el " + q + " da el " + matematicas.Varias.pegaPorDetras(p,q));

        //pegaPorDelante/////////
        System.out.println("Introduzca un numero para utilizar en pegaPorDelante");
        int r = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca los digitos a pegar por delante");
        int t = Integer.parseInt(System.console().readLine());
        System.out.println("Si al " + r + " se le pega por delante el " + t + " da el " + matematicas.Varias.pegaPorDelante(r,t));

        //trozoDeNumero///////////
        System.out.println("Introduzca un numero para utilizar en TrozoDeNumero");
        int v = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca en numero que parte quiere cortar");
        int w =Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca en que posicion desea dejarlo");
        int x = Integer.parseInt(System.console().readLine());
        System.out.println("Al " + v + " le cojo el trozo que va de la posicion " + w + " a la " + x + " : " + matematicas.Varias.trozoDeNumero(v,w,x));

        //juntaNumeros///////////
        System.out.println("Introduzca un numero para utilizar el juntaNumeros");
        int y = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca otra numero a juntar");
        int z = Integer.parseInt(System.console().readLine());
        System.out.println("Juntando el 21 y el 40 da el  " + matematicas.Varias.juntaNumeros(y,z));












        



       



        
    
    }
}