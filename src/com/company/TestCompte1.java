package com.company;

public class TestCompte1 {

    public static void main(String[] args) {
        Compte compte1 = new Compte("compte1");
        Compte compte2 = new Compte("compte2");
        compte1.deposer(500);
        compte2.deposer(1000);
        compte2.retirer(10);
        compte1.virerVers(75, compte2);
        compte1.afficher();
        compte2.afficher();
    }
}
