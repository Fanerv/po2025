package symulator;

public class Silnik extends Komponent{
    public void zatrzymaj(){
        obroty=0;
    }
    public void uruchom(){
        obroty=800;
    }
    public void zmniejszObroty(float val){
        if((obroty-val)>=0) obroty-=val;
    }
    public void zwiększObroty(int val){
        if((obroty+val)<=maxObroty) obroty+=val;
    }
    private float obroty;
    private float maxObroty;

    public Silnik(float waga, float cena, String nazwa, float obroty, float maxObroty) {
        super(waga, cena, nazwa);
        this.obroty = obroty;
        this.maxObroty = maxObroty;
    }
}
