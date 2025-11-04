package symulator;

public abstract class Komponent {
    public String getNazwa() {
        return nazwa;
    }

    public float getCena() {
        return cena;
    }

    public float getWaga() {
        return waga;
    }

    protected String nazwa;
    protected float waga;
    protected float cena;

    public Komponent(float waga, float cena, String nazwa) {
        this.waga = waga;
        this.cena = cena;
        this.nazwa = nazwa;
    }
}
