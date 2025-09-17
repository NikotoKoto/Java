package org.example;

public abstract class Animal implements mangeable{
    protected String nom;
    protected String race;
    protected String aliment;
    public Animal(String nom, String race,String aliment){
        this.nom = nom;
        this.race = race;
        this.aliment = aliment;
    }

    public void parler(){
        System.out.println("Un animal fait un bruit");
    }

    public void seDeplacer(){
    System.out.println("L'animal se déplace");
    }

    public String getNom(){
    return nom;
    }
    public String getRace(){
        return race;
    }
    @Override
    public void manger(){
        System.out.println(getNom()+" mange " +this.aliment);
    }

    public void manger(String aliment){
        System.out.println(getNom()+" mange " + aliment);
    }
}
