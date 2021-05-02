package com.practise.newocp.chapter2;

public abstract class Food {
    private int quantity;
    public Food(int quantity){
        this.quantity= quantity;
    }


    public int getQuantity(){
        return this.quantity;

    }

    public abstract void consumed();
}

class Hay extends Food{
    public Hay(int quantity){
        super(quantity);
    }
    public void consumed(){
        System.out.println(" Hay eaten : "+getQuantity());
    }
}

class Pellets extends Food{

    public Pellets(int quantity){
        super(quantity);
    }

    public void consumed(){
        System.out.println(" Pellets eaten: "+getQuantity());
    }
}

class FoodFactory{

    public static Food getFood(String animalName){
        switch (animalName){
            case "zebra": return new Hay(500);
            case "rabbit" : return new Pellets(10);
            case "goat": return new Pellets(20);
            default:
                throw new IllegalArgumentException(" Please enter the valid Input");
        }
    }

    public static void main(String[] args) {
        Food food= FoodFactory.getFood("zebra");
        System.out.println(" The amount of Food Consumed : "+food.getQuantity());
        food.consumed();
    }
}