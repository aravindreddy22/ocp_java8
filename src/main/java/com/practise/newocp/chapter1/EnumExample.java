package com.practise.newocp.chapter1;

public enum EnumExample {
    WINTER,SUMMER,SPRING,FALL
}

class SeasonExp{
    public EnumExample season;

    public static void main(String[] args) {
        EnumExample seasonExp=EnumExample.WINTER;;
        System.out.println(seasonExp == EnumExample.WINTER);
        System.out.println(seasonExp);

        for(EnumExample e:EnumExample.values()){
            System.out.println("The Enum Values are: "+e + " the int value asspciated with it: "+e.ordinal());

        }

        EnumExample e1= EnumExample.valueOf("SUMMER");

       String s = EnumExample.valueOf("SUMMER").toString();
        System.out.println(s);



        switch(e1){
            case WINTER:
                System.out.println(" Get out of sled");
                break;
            case SUMMER:
                System.out.println(" Lets go to beach");
                break;
            case SPRING:
                System.out.println(" The Leaves are changing beautiful color");
                break;
            default:
                System.out.println(" is it summer yet ?");
        }
    }
}