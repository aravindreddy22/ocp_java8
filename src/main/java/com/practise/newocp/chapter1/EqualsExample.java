package com.practise.newocp.chapter1;

public class EqualsExample {

    public static void main(String[] args) {


        String s1= new String("Lion");
        String s2= new String("Lion");

        // The string Class Overrides the equals method and it compares the 2 strings and yeild the result.

        System.out.println( " Normal String :" +s1.equals(s2));


        StringBuilder sb1= new StringBuilder("lion");
        StringBuffer sb2= new StringBuffer("lion");

        //The Stringbuilder didn't has the equals method overriden .
        // so, it uses the Object class equals method which is just the
        // Object address Comparision.
        System.out.println(" String Builder case : "+sb1.equals(sb2));


        // Validating the equals Method

        Zoo zoo = new Zoo(1,"Leo",10);
        Zoo zoo1=new Zoo(2,"leon",20);

        System.out.println(" Both the Animals are Equal: " +zoo.equals(zoo1));

        Zoo nullZoo= null;

        System.out.println(" Chcking with the null : "+zoo.equals(nullZoo));
    }
}

class Zoo{
    private int id;
    public String name;
    public  int age;

    public Zoo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override public boolean equals(Object obj){

        if(!(obj instanceof Zoo))
            return false;
            Zoo zoo=(Zoo) obj;
            return  zoo.id == this.id;

    }
}
