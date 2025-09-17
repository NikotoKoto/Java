package org.example;

public class Chien extends Animal{


    public Chien(String nom, String race,String aliment){
        super(nom,race,aliment);


    }

    @Override
    public void parler (){
         System.out.println("Wouaf");
    }

    public void flairer(){
        System.out.println("sentir");
    }

    @Override
    public void manger(String aliment){
        System.out.println(getNom()+ " mange des "+ aliment);
    }
}
