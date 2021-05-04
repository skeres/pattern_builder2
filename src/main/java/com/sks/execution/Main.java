package com.sks.execution;

import com.sks.utils.Voiture;

public class Main {


    public static void main(String[] args) {
        System.out.println("begin");

        Voiture voiture1= new Voiture.Builder().setgps(true).setnombreDeSieges(4).setpuissanceMoteur(140).build();
        System.out.println(voiture1);

        Voiture voiture2= new Voiture.Builder().setgps(true).setnombreDeSieges(2).setpuissanceMoteur(300).build();
        System.out.println(voiture2);

        System.out.println("ending");
    }
}
