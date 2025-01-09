package Esercizio2;

public class SIM {
    private int numeroDiTelefono;
    private double credito;
    private Chiamata[] callList = new Chiamata[5];


    public SIM(int numeroDiTelefono, double credito, Chiamata[] callList) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = credito;
        this.callList = callList;
    }

    public SIM(int numeroDiTelefono) {
        this.credito = 0;
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public void stampaDati() {
        System.out.println(credito);
        System.out.println(numeroDiTelefono);
        for (int i = 0; i < 5; i++) {
            System.out.println(callList[i].getCall());
        }
    }

}
