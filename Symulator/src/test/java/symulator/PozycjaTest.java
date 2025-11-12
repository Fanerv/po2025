package symulator;

import static org.junit.Assert.*;

public class PozycjaTest {
    Pozycja wynik = new Pozycja(6,12);
    Pozycja pos = new Pozycja(2,4);
    Pozycja cel=new Pozycja(2,4);
    @org.junit.Test
    public void przemiescTest() {
        pos.przemiesc(cel,2,1);
        assertEquals(wynik.getX(),pos.getX(),0.001); //x +=cel.x*vel*dt;
        assertEquals(wynik.getY(),pos.getY(),0.001);
    }
}