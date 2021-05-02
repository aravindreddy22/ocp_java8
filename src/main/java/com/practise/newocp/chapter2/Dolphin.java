package com.practise.newocp.chapter2;

public class Dolphin implements LivesInOcean {

    public void makeSound(){
        System.out.println(" The Dolphin is good at whistiling");
    }
}

class Whale implements LivesInOcean{

    public void makeSound(){
        System.out.println(" The Whale is good at singing");
    }
}


class Oceanographer{

    public void checkSound(LivesInOcean animal){
        animal.makeSound();
    }

    public static void main(String[] args) {

        Oceanographer oceanographer= new Oceanographer();
        oceanographer.checkSound(new Dolphin());
        oceanographer.checkSound(new Whale());
    }
}