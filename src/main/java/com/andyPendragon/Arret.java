package com.andyPendragon;

import java.util.ArrayList;
import java.util.Objects;

public final class Arret {private final String nom;
private final String lieu;
private final ArrayList<Ligne> lignes;

    public Arret(String nom, String lieu, ArrayList<Ligne> lignes){
        this.nom=nom;
        this.lieu=lieu;
        this.lignes=lignes;
    }

    public Arret(String nom, String lieu) {
        this.nom = nom;
        this.lieu = lieu;
        this.lignes = new ArrayList<Ligne>();
    }

    public String getNom() { return nom; }

    public String getLieu() { return lieu; }

    public ArrayList<Ligne> getLignes() { return lignes; }

    public void ajouterLigne(Ligne ligne) {
        lignes.add(ligne);
    }
}