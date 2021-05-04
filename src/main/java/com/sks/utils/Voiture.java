package com.sks.utils;

public class Voiture {

    //TIP : tous les attributs sont private
    private int nombreDeSieges=0;
    private int puissanceMoteur=0;
    private boolean gps=false;

    private Voiture(int nombreDeSieges, int puissanceMoteur, boolean gps) {
        this.nombreDeSieges = nombreDeSieges;
        this.puissanceMoteur = puissanceMoteur;
        this.gps = gps;
    }

    //TIP : tous les getters sont public, mais AUCUN setter décrits dans Voiture.
    //les setters sont dans la classe static BUILDER
    public int getNombreDeSieges() {
        return nombreDeSieges;
    }

    public int getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public boolean isGps() {
        return gps;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "nombreDeSieges=" + nombreDeSieges +
                ", puissanceMoteur=" + puissanceMoteur +
                ", gps=" + gps +
                '}';
    }


    //TIP : cette inner classe est static !
    public static class Builder {

        private int nombreDeSieges=0;
        private int puissanceMoteur=0;
        private boolean gps=false;


        public Builder() {
        }

        //TIP : les tous les setters retournent un BUILDER
        public Builder setnombreDeSieges(int nombreDeSieges) {
            this.nombreDeSieges=nombreDeSieges;
            return this;
        }

        public Builder setpuissanceMoteur(int puissanceMoteur) {
            this.puissanceMoteur=puissanceMoteur;
            return this;
        }


        public Builder setgps(boolean gps) {
            this.gps=gps;
            return this;
        }

        //TIP : une fois les attribut settés dans Builder, on peut appeler la méthode build
        //qui génère l'instance Voiture à partir des attributs du builder
        public Voiture build() {
            return new Voiture(this.nombreDeSieges, this.puissanceMoteur,this.gps);
        }


    }
}
