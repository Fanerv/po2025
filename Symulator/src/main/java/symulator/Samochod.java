package symulator;

public class Samochod {
    public void wlacz(){
        silnik.uruchom();
    }
    public void wylacz(){
        silnik.zatrzymaj();
    }
    public void jedzDo(Pozycja cel){

    }
    public void getAktPredkosc(){

    }
    public void getAktPozycja(){

    }

    private boolean stanWlaczenia;
    private int nrRejest;
    private String model;
    private float maxPredkosc;

    private SkrzyniaBiegow skrzynia;
    private Silnik silnik;
    private Pozycja aktPozycja;

    public Samochod(Silnik sil,SkrzyniaBiegow sb,int nrRe,String mod,float mPred){
        silnik=sil;
        skrzynia=sb;
        stanWlaczenia=false;
        nrRejest=nrRe;
        model = mod;
        maxPredkosc=mPred;
    }
}
