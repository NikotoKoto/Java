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

        /*
        Handle stream
         */

        //Ex.1
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> name = names.stream()
                .map(String::toLowerCase)
                .filter(n -> n.startsWith("a"))
                .toList();

        System.out.println(name);


        //Ex.2

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Long number = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(number);




    }


}