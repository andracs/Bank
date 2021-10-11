import java.util.ArrayList;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/10/2021
 */

public class KundeKatalog {
    static ArrayList<Bruger> alleKunder = new ArrayList<>();

    public static void main(String[] args) {
        Bruger søren = new Bruger();
        Bruger marcus = new Bruger();

        alleKunder.add(søren);
        alleKunder.add(marcus);

        alleKunder.add(new Bruger("András", 1000, "123"));

        System.out.println(alleKunder);
        
    }
}
