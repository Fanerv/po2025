package org.example;

import symulator.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Silnik silnik = new Silnik(800,8000);
        Sprzeglo sprzeglo= new Sprzeglo(3,100,"kotki");
        SkrzyniaBiegow skrzynka = new SkrzyniaBiegow(sprzeglo,6);
        Samochod pmobile = new Samochod(silnik,skrzynka,4273,);
    }
}
