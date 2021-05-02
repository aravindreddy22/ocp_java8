package com.practise.newocp.chapter1;

public enum Season {
    WINTER("Low"),SPRING("Medium"),SUMMER("High"),FALL("Medium");

    public String expectedVisitors;

    private Season(String expectedVisitors){
        this.expectedVisitors= expectedVisitors;
    }

    public void printExpectedVisitors(){
        System.out.println(" The Expected Visitors are :" +expectedVisitors);
    }

    public static void main(String[] args) {
        Season.SUMMER.printExpectedVisitors();
    }


}
