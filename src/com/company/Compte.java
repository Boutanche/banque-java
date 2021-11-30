package com.company;

/**
 * Modélise un compte en banque et les opération qu'on peut effectuer dessus
 */
public class Compte {

    private String nom;
    private double solde;

    /**
     * Constructeur avec nom du compte
     * @param nomCompte
     */
    public Compte(String nomCompte){
        nom = nomCompte;
    }

    /**
     * Incrémenter le solde du montant passé en paramètre
     * @param montant
     */
    public void deposer(double montant){
        double soldeCourant = getSolde() + montant;
        setSolde(soldeCourant);
    }

    /**
     * Décrémenter le solde du montant passé en paramètre
     * @param montant
     */
    public void retirer(double montant){
        double soldeCourant = getSolde() - montant;
        setSolde(soldeCourant);
    }

    /**
     * Affiche à l'écran le nom du compte et son solde
     */
    public void afficher(){
        System.out.println("Compte : " + getNom() + " - Solde : " + getSolde());
    }

    /**
     * Effectuer un virement du compte vers compte destination
     * @param montant
     * @param destination
     */
    public void virerVers(double montant, Compte destination){
        retirer(montant);
        destination.deposer(montant);
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
