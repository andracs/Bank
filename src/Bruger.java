/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/10/2021
 */

public class Bruger {
    String navn;
    double saldo;
    String kodeord;

    Bruger() {}
    public Bruger(String navn, double saldo, String kodeord) {
        this.navn = navn;
        this.saldo = saldo;
        this.kodeord = kodeord;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "navn='" + navn + '\'' +
                ", saldo=" + saldo +
                ", kodeord='" + kodeord + '\'' +
                '}';
    }
}
