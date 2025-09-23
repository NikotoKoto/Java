package org.example.Salarie.sousFille;

import org.example.Salarie.fille.ingenieur;

import java.time.LocalDate;


public class mission extends ingenieur {
    private String intitule;
    private double indemnite;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private boolean done;

    public mission(int nbEnfant, double salaireBase, String prenom, String nom, String grade, double prime, String intitule, double indemnite, LocalDate dateDebut, LocalDate dateFin) {
        super(nbEnfant, salaireBase, prenom, nom, grade, prime);
        this.intitule = intitule;
        this.indemnite = indemnite;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getIndemnite() {
        return indemnite;
    }

    public void setIndemnite(double indemnite) {
        this.indemnite = indemnite;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "mission{" +
                "dateFin=" + dateFin +
                ", indemnite=" + indemnite +
                ", dateDebut=" + dateDebut +
                ", intitule='" + intitule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaireBase=" + salaireBase +
                ", nbEnfant=" + nbEnfant +
                '}';
    }
}
