package misfunciones;

/**
 * 
 * Realiza figuras
 * 
 */

public class Figuras {
/**
 * Crea una linea de astericos con una longitud determinada.
 * 
 * @param longitud tamaño de la línea.
 * @return una linea de astericos
 */
    public static String linea(int longitud) {
        String resultado = "";

        for (int i = 0; i< longitud; i++) {
            resultado += "*";
        }

        return resultado;
    }
        
    }
    

