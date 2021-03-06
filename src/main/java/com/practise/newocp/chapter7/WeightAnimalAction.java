package com.practise.newocp.chapter7;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class WeightAnimalAction extends RecursiveAction {

    private int start;
    private int end;
    private Double[] weights;

    public WeightAnimalAction(int start, int end, Double[] weights) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    public void compute(){
        if(end-start<3){
            for(int i= start; i<end;i++)
            {
                weights[i]= (double)new Random().nextInt(100);
                System.out.println("Animal weighted : "+i);
            }
        }else
        {
            int middle= start+((end-start)/2);
            System.out.println("[start="+start+",middle="+middle+",end="+end+"]");
            invokeAll(new WeightAnimalAction(start,middle,weights),
                    new WeightAnimalAction(middle,end,weights));
        }
    }

    public static void main(String[] args) {
        Double[] weights= new Double[10];
        ForkJoinTask<?> task = new WeightAnimalAction(0,weights.length,weights);
        ForkJoinPool pool= new ForkJoinPool();
        pool.invoke(task);

        System.out.println();
        System.out.println("weights");
        Arrays.asList(weights).stream().forEach(d-> System.out.println(d.intValue()+ ""));
    }
}
