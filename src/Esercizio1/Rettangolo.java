package Esercizio1;

public class Rettangolo {
    private int altezza;
    private int base;

    public Rettangolo (int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getBase() {
        return base;
    }

    public int perimetro () {
        return base*2 + altezza*2;
    }

    public int area () {
        return base * altezza;
    }

}
