package org.example;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         * Polymorphism & legacy
         *
         */
        Animal Chien = new Chien("Rex", "Doberman", "croquettes");
        Animal Chat = new Chat("Pipas", "goutiere", "paté");
        Animal Oiseau = new Oiseau("Pioupiou", "Aigle", "graines");

        List<Animal> list = List.of(Chien, Chat, Oiseau);

        for (Animal a : list) {
            a.parler();
            a.seDeplacer();
            a.manger();
            a.manger("choucroute");
        }



    }


}