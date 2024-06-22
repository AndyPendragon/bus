package com.andyPendragon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilisateurTest {

    @Test
    void liana_cherche_les_lignes_directs_de_imatep_ivandry_vers_mausolee() {
        var liana = new Utilisateur("Liana");

        var ligne_194_bleu_vers_mausolee = new Ligne(194,"Bleu","Mausolée");
        var ligne_150 = new Ligne(150,"","");
        var ligne_186 = new Ligne(186, "", "");
        var ligne_163 = new Ligne(163, "","");
        var ligne_165 = new Ligne(165, "","");
        var ligne_162 = new Ligne(162, "","");

        var arret_imatep_ivandry = new Arret("IMATEP", "Ivandry");

        var arret_terminus_194_mausolee = new Arret("Terminus 194","Mausolée");

        arret_imatep_ivandry.ajouterLigne(ligne_194_bleu_vers_mausolee);
        arret_imatep_ivandry.ajouterLigne(ligne_150);
        arret_imatep_ivandry.ajouterLigne(ligne_186);
        arret_imatep_ivandry.ajouterLigne(ligne_163);
        arret_imatep_ivandry.ajouterLigne(ligne_165);
        arret_imatep_ivandry.ajouterLigne(ligne_162);

        arret_terminus_194_mausolee.ajouterLigne(ligne_194_bleu_vers_mausolee);

        var lignesEnCommun_imatep_ivandry_mausolee = liana.demandeLignesDirectes(arret_imatep_ivandry, arret_terminus_194_mausolee);

        for (Ligne ligne : lignesEnCommun_imatep_ivandry_mausolee) {
            System.out.println(ligne.toString());
        }

        Assertions.assertTrue(
                lignesEnCommun_imatep_ivandry_mausolee.contains(ligne_194_bleu_vers_mausolee)
        );
    }

    @Test
    void dylan_cherche_les_lignes_directs_de_lewis_amboditsiry_a_en_face_d_imatep_ivandry() {
        var dylan = new Utilisateur("Dylan");

        var arret_en_face_imatep_ivandry = new Arret("En face IMATEP","Ivandry");

        var arret_lewis_amboditsiry = new Arret("Lewis", "Amboditsiry");

        Assertions.assertEquals(
                new AucuneLignesDirectes,
                dylan.demandeLignesDirectes(arret_lewis_amboditsiry, arret_en_face_imatep_ivandry)
        );
    }
}