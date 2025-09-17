package org.example;

public class Oiseau extends Animal {


    public Oiseau(String name, String race,String aliment) {
        super(name, race, aliment);

    }

    @Override
    public void seDeplacer() {
        System.out.println("S'envole");

    }

    @Override
    public void manger(String aliment){
        System.out.println("Il mange des "+ aliment);
    }

    @Override
    public void parler() {
    System.out.println("cui-cui");
    }
}
