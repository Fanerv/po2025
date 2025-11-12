package symulator;

public class Pozycja {
    public Pozycja(double dx,double dy) {
        x=dx; y=dy;
    }

    public void aktualizujPoz(double dx, double dy){
        x+=dx;
        y+=dy;
    }
    void przemiesc(Pozycja cel,double vel,float dt){
        x +=cel.x*vel*dt;
        y +=cel.y*vel*dt;
    }
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
