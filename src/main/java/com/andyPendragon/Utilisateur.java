package com.andyPendragon;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public record Utilisateur(String prénom) {
    public ArrayList<Ligne> demandeLignesDirectes(Arret depart, Arret arrivee) {
        ArrayList<Ligne> lignesAuDepart = depart.getLignes();
        ArrayList<Ligne> lignesALArrivee = arrivee.getLignes();

        ArrayList<Ligne> lignesDirectes = IntStream.range(0, lignesAuDepart.size()).filter(ligneIndex -> lignesALArrivee.contains(lignesAuDepart.get(ligneIndex))).mapToObj(lignesALArrivee::get).collect(Collectors.toCollection(ArrayList::new));

        if (lignesDirectes.isEmpty()) throw new AucuneLignesDirectes();

        return lignesDirectes;
    }
}
