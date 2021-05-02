package com.practise.newocp.chapter1;

public class Outer {

    private String greetings= "Hi";

    protected class InnerClass{
        private int count = 3;

        public void go(){
            for(int i=0;i<count; i++)
                System.out.println(greetings);
        }
    }

    public void callerInner(){
        InnerClass innerClass=  new InnerClass();
        innerClass.go();
    }

    public static void main(String[] args) {

        Outer outer= new Outer();
        outer.callerInner();
        /**
         * Calling the inner Class Directly
         *
         * we can't call / create the Objects of non-staic inner class in the static method.
         */
        InnerClass innerClass=outer.new InnerClass();
        innerClass.go();
    }
}
