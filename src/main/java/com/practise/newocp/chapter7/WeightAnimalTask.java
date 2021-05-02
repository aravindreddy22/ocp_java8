package com.practise.newocp.chapter7;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class WeightAnimalTask extends RecursiveTask<Double> {

    private int start;
    private int end;
    private Double[] weights;

    public WeightAnimalTask(int start, int end, Double[] weights) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    public Double compute(){
        if(end-start<3){
            double sum=0;
            for(int i= start; i<end;i++)
            {
                weights[i]= (double)new Random().nextInt(100);
                System.out.println("Animal weighted : "+i);
                sum += weights[i];
            }
            return sum;
        }else
        {
            int middle= start+((end-start)/2);
            System.out.println("[start="+start+",middle="+middle+",end="+end+"]");
            RecursiveTask<Double> otherTask= new WeightAnimalTask(start,middle,weights);
            otherTask.fork();
            return new WeightAnimalTask(middle,end,weights).compute()+otherTask.join();

        }
    }

    public static void main(String[] args) {
        Double[] weights= new Double[10];
        ForkJoinTask<Double> task = new WeightAnimalTask(0,weights.length,weights);
        ForkJoinPool pool= new ForkJoinPool();
        Double sum =pool.invoke(task);

        System.out.println();
        System.out.println("Sum ="+sum);

    }
}
