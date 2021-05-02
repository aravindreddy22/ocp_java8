package com.practise.newocp.chapter1;

public enum SeasonAbstract {

    WINTER{
        public void printHours(){
            System.out.println(" The hours is 9:00 to 3:00");
        }
    },
    SPRING{
        public void printHours(){
            System.out.println(" The hours is 9:00 to 3:00");
        }
    },
    FALL{
        public void printHours(){
            System.out.println(" The hours is 9:00 to 3:00");
        }
    };
    public abstract void printHours();
}

class menumRun{

    public static void main(String[] args) {
        SeasonAbstract.WINTER.printHours();
    }
}
