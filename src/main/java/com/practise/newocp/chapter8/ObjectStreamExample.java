package com.practise.newocp.chapter8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamExample {

    public static List<Animal> getAnimals(File dataFile) throws IOException,ClassNotFoundException {
        List<Animal> animals= new ArrayList<>();
        try(ObjectInputStream in= new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))){
         while (true){
             Object object = in.readObject();
             if(object instanceof Animal)
                 animals.add((Animal)object);

         }
        }catch (EOFException ex){

        }
        return animals;
    }

    public static void createAnimalsFile(List<Animal> animals,File dataFile) throws IOException{
        try(ObjectOutputStream outputStream= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))){
            for (Animal animal : animals) {
                outputStream.writeObject(animal);
            }
        }
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        List<Animal> animals= new ArrayList<>();
        animals.add(new Animal("Tommy Tiger",5,'T'));
        animals.add(new Animal("Peter",8,'P'));
        File dataFile = new File("C:\\Users\\aletakul\\Desktop\\test\\animals.txt");
        createAnimalsFile(animals,dataFile);
        System.out.println(getAnimals(dataFile));

    }
}
