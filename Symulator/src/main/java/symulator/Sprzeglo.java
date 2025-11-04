package symulator;

public class Sprzeglo extends Komponent {
    public void wcisnij(){
        sprzegloWcisniete =true;
    }
    public void zwolnij(){
        sprzegloWcisniete =false;
    }
    private boolean sprzegloWcisniete;

    public Sprzeglo(float waga, float cena, String nazwa) {
        super(waga, cena, nazwa);
        sprzegloWcisniete = false;
    }
}
