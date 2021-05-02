package com.practise.newocp.chapter2;

public class HayStorage {

    private HayStorage(){ }

    private int quantity =0;

    private static final HayStorage instance= new HayStorage();

    public static HayStorage getInstance(){
        return instance;
    }

    public synchronized void addHay(int amount){
        quantity+=amount;
    }

    public synchronized boolean removeHay(int amount){
        if(quantity<0) return false;
        quantity-=amount;
        return true;
    }

    public synchronized int getHayQuantity(){
        return quantity;
    }


}

class HayStorageRun {

    public static void main(String[] args) {

        HayStorage hayStorage= HayStorage.getInstance();

        hayStorage.addHay(10);

        System.out.println(hayStorage.removeHay(5));

        System.out.println(hayStorage.getHayQuantity());
    }
}
