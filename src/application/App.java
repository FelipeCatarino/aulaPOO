package application;

import entities.Eevee;
import entities.Joelton;

public class App{
    public static void main(String[] args) {

        Eevee e1 = new Eevee();
        Joelton j1 = new Joelton();

        System.out.println("ataque: " + e1.ataque());
        System.out.println("defesa: " + e1.defesa());
        System.out.println("especial: " + e1.especial());

        System.out.println("ataque: " + j1.ataque());
        System.out.println("defesa: " + j1.defesa());
        System.out.println("especial: " + j1.especial());

    }
}