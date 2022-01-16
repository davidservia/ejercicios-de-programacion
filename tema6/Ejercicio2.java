

public class Ejercicio2 {
    public static void main(String[] args) {
    
        String palodeCarta= "";
        String carta= "";

          int  tipodePalo = (int) (Math.random()*4) + 1;
        
            
            switch (tipodePalo) {
            case 1:
            palodeCarta = "picas";
            break;

            case 2:
            palodeCarta = "corazones";
            break;

            case 3:
            palodeCarta = "diamantes";
            break;

            case 4:
            palodeCarta = "treboles";
            break;

            default:
        }

        int numeroCarta = (int) (Math.random()*13)+1;

        switch (numeroCarta) {
            case 1:
            carta = "As";
            break;

            case 11:
            carta = "J";
            break;

            case 12:
            carta = "Q";
            break;

            case 13:
            carta = "Q";
            break;

            default:
            carta = String.valueOf(numeroCarta);
        }
        System.out.println(carta + " de  " + palodeCarta);
        }
    }

        

    
    
    

