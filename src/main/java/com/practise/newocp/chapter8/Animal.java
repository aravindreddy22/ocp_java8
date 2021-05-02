package com.practise.newocp.chapter8;

import java.io.Serializable;

public class Animal implements Serializable {
    private static final long serialVersionUID=1L;
    private transient String name;
    private transient int age;
    private static char type ='C';

    public Animal(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Animal() {
        this.name = "Unkonwn";
        this.age = 12;
        this.type = 'Q';
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", type=" + type +
                '}';
    }
}
