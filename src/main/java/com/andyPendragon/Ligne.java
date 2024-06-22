package com.andyPendragon;

import java.util.Objects;

public final class Ligne {
    private final int numero;
    private final String derivation;
    private final String direction;

    public Ligne(int numero, String derivation, String direction){
        this.numero=numero;
        this.derivation=derivation;
        this.direction=direction;
    }

    public int getNumero(){ return numero; }

    public String getDerivation(){ return derivation; }

    public String getDirection(){ return direction; }

    @Override
    public String toString() {
        return "Ligne " + numero + " - " + derivation  + ", vers " + direction;
    }
}
