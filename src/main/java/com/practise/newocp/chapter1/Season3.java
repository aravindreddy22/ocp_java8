package com.practise.newocp.chapter1;

public enum Season3 {
    WINTER{
        public void printHours(){
            System.out.println(" The Winter is chilling");
        }
    },SUMMER;

    public void printHours(){
        System.out.println(" It is the default time");
    }
}
