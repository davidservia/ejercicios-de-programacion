package pruebaEjercicio8;

import java.util.Objects;

public class Cartas {
    private static String[] n = {"as","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","joker","reina","rey"};
    private static String[] p = {"picas","trebol","corazones","rombo"};

    private String numero;
    private String palo;

    public Cartas() {
       this.numero = n[(int)(Math.random()*13)];
       this.palo = p[(int)(Math.random()*4)];
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return this.numero + " de " + this.palo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cartas other = (Cartas) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return true;

        }
    }
  

    
    
    
    



