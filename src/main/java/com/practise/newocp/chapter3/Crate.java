package com.practise.newocp.chapter3;

public class Crate<T> {

    public T contents;

    public T emptyCrate(){
        return contents;
    }


    public void packCrate(T content){

        this.contents =content;
    }


}

class Elephant{

    public String name;
    public int weight;

    public static void main(String[] args) {
        Elephant elephant= new Elephant();
        elephant.name= "New One";
        elephant.weight=180;
        Crate<Elephant> crate= new Crate<>();
        crate.packCrate(elephant);
        System.out.println(crate.emptyCrate());
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
