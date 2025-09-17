package org.example;

public class Chat extends Animal{

    public Chat(String name, String race,String aliment){
        super(name,race,aliment);

    }

    @Override
    public void manger(String aliment){
        System.out.println("Il mange de la "+ aliment);
    }

    @Override
    public void parler(){
        System.out.println("Miaou");
    }

    public void ronronner(){};
}
