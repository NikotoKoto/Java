package org.example.Salarie.fille;

import org.example.Salarie.mere.salarie;
import org.example.Salarie.sousFille.mission;

import java.util.ArrayList;
import java.util.List;

public class ingenieur extends salarie {

    private String grade;
    private double prime;
    private List<mission> missions = new ArrayList<>();

    public ingenieur(int nbEnfant, double salaireBase, String prenom, String nom, String grade, double prime) {
        super(nbEnfant, salaireBase, prenom, nom);
        this.grade= grade;
        this.prime = prime;
    }

    public List<mission> getMissions() {
        return missions;
    }

    public void setMissions(List<mission> missions) {
        this.missions = missions;
    }

    public double getPrime() {
        return prime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public double CalculerSalaire(){
       return super.CalculerSalaire() + getPrime();
    }
}
