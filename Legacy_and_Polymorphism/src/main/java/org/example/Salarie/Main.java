package org.example.Salarie;

import org.example.Salarie.fille.ingenieur;
import org.example.Salarie.mere.salarie;
import org.example.Salarie.sousFille.mission;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
    salarie toto = new ingenieur(3,1600,"Nicolas","Floris","ingenieur",250);
    ingenieur inge = new mission(3,1600,"Nicolas", "Floris","ingenieur",300,"Dev front",25, LocalDate.of(2024,8,30),LocalDate.of(2024,10,3));
    System.out.println(toto.toString());
    System.out.println(inge.toString());
    }
}
