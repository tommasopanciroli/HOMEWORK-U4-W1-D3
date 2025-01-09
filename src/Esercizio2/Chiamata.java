package Esercizio2;

public class Chiamata {
    private double minuti;
    private int newNumber;

    public Chiamata (double minuti, int newNumber) {
        this.minuti = minuti;
        this.newNumber = newNumber;
    }

    public String getCall () {
        return minuti+ "minuti" + ", " + "Numero di telefono:" + newNumber;
    }
}
