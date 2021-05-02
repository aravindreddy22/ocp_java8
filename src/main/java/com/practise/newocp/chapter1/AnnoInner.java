package com.practise.newocp.chapter1;

public class AnnoInner {

    //Abstract Class
    abstract class SalesToday{
        abstract int dollarsOff();
    }

    public int admission(int baseprice){

        SalesToday salesToday= new SalesToday() {
            @Override
            int dollarsOff() {
                return 3;
            }

        };
        return baseprice-salesToday.dollarsOff();
    }

    public static void main(String[] args) {

        AnnoInner inner= new AnnoInner();
        int discount =inner.admission(10);
        System.out.println(" The discount value is the :"+discount);
        Testinter testinter= new Testinter() {
            @Override
            public void egg() {
                System.out.println(" The Egg is ready honey");
            }
        };
        testinter.egg();


        System.out.println(" the value of inner.pay(): "+inner.pay());
    }

    //Interface
    private interface Testinter{
        public void egg();
    }

  // passing the nnonymus class as the argument.

    interface SaleTodayonly{
        int dollarsOff();
    }

    public int pay(){
            return admission(10, new SaleTodayonly() {
                @Override
                public int dollarsOff() {
                    return 4;
                }
            });
    }

    public int admission(int baseprice, SaleTodayonly sale){
        return baseprice -sale.dollarsOff();
    }
}
