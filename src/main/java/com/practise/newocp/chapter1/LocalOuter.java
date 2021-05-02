package com.practise.newocp.chapter1;

public class LocalOuter {

    private int length=5;

    public void calculate(){
        final int width=10;
        class Inner{

            public void multiply(){
                System.out.println(" The multiplication value is: "+length*width);
            }
        }

        Inner inner= new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {

        LocalOuter localOuter= new LocalOuter();
        localOuter.calculate();
    }
}
