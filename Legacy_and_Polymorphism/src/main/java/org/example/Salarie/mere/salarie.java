package org.example.Salarie.mere;

public abstract class salarie {
    protected String nom;
    protected String prenom;
    protected double salaireBase;
    protected int nbEnfant;

    public salarie(int nbEnfant, double salaireBase, String prenom, String nom) {
        this.nbEnfant = nbEnfant;
        this.salaireBase = salaireBase;
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public int getNbEnfant() {
        return nbEnfant;
    }

    public void setNbEnfant(int nbEnfant) {
        this.nbEnfant = nbEnfant;
    }

    public double CalculerSalaire(){
        return (salaireBase + nbEnfant) * 300;
    };

    @Override
    public String toString() {
        return "salarie{" +
                "nom='" + nom + '\n' +
                ", prenom='" + prenom + '\n' +
                ", salaireBase=" + salaireBase + '\n' +
                ", nbEnfant=" + nbEnfant + '\n' +
                ", Salaire net =" + CalculerSalaire() + '\n' +
                '}';
    }
}
