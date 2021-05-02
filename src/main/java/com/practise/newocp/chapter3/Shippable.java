package com.practise.newocp.chapter3;

public interface Shippable<T> {

    public void ship(T t);
}

//Ways to implement the Generic Interfaces .
//Way1
class ShippableRobotCase implements Shippable<Robot>{
    public void ship(Robot robot){

        System.out.println(" The Shippable Robot is  called");
    }
}

//Way2
class ShippableAbstarctCrate<U> implements Shippable<U>{

    public void ship(U u){
        System.out.println(" The Object type pointing is ");
    }
}


//way3
class Shippablecrate implements Shippable{

    public void ship (Object t){

        System.out.println(" No Generics in the specified example");

    }
}


class ShippableTest{

    public static void main(String[] args) {

        //Way1 Object
        ShippableRobotCase shippableRobotCase= new ShippableRobotCase();

        shippableRobotCase.ship(new Robot());


        //way2 Object Creation

        ShippableAbstarctCrate<Robot> shippableAbstarctCrate= new ShippableAbstarctCrate<>();

        shippableAbstarctCrate.ship(new Robot());


        //way3
        Shippablecrate shippablecrate= new Shippablecrate();
        shippablecrate.ship(new Robot());
    }
}
