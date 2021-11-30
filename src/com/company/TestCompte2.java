package com.company;

import java.lang.reflect.Array;

public class TestCompte2 {
    public static void main(String[] args) {
        
        Compte [] comptes = new Compte[10];
        comptes[0] = new Compte("compte 1");
        comptes[1] = new Compte("compte 2");
        comptes[2] = new Compte("compte 3");
        comptes[3] = new Compte("compte 4");
        comptes[4] = new Compte("compte 5");
        comptes[5] = new Compte("compte 6");
        comptes[6] = new Compte("compte 7");
        comptes[7] = new Compte("compte 8");
        comptes[8] = new Compte("compte 9");
        comptes[9] = new Compte("compte 10");

        for (int i = 0; i < comptes.length ;i++) {
            double montant = 200 + i*100;
            comptes[i].deposer(montant);
            for (int j = i+1; j < comptes.length ; j++){
                comptes[i].virerVers(20,comptes[j]);
            }
        }
        for (Compte compte: comptes) {
            compte.afficher();
        }


    }
}
