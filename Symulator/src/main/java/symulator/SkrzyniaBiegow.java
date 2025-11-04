package symulator;

public class SkrzyniaBiegow extends Komponent {
    public void zwiekszBieg(){
        if(aktualnyBieg<iloscBiegow) aktualnyBieg++;

    }
    public void zmniejszBieg(){
        if(aktualnyBieg>1) aktualnyBieg--;
    }
    public int getAktBieg(){
        return aktualnyBieg;
    }
    public float getAktPrzelozenie(){
        return aktualnePrzelozenie;
    }
    private int aktualnyBieg;
    private int iloscBiegow;
    private float aktualnePrzelozenie;

    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(float waga, float cena, String nazwa, int aktualnyBieg, int iloscBiegow, float aktualnePrzelozenie, Sprzeglo sprzeglo) {
        super(waga, cena, nazwa);
        this.aktualnyBieg = aktualnyBieg;
        this.iloscBiegow = iloscBiegow;
        this.aktualnePrzelozenie = aktualnePrzelozenie;
        this.sprzeglo = sprzeglo;
    }
}
