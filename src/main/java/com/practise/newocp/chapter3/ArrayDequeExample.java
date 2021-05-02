package com.practise.newocp.chapter3;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample {

    public static void main(String[] args) {
        Queue<Integer> queue= new ArrayDeque<>();
       // System.out.println(queue.add(10));
        System.out.println(queue.offer(1));
        System.out.println(queue.offer(2));
        System.out.println(queue.offer(3));
        System.out.println(queue.offer(4));
        System.out.println(queue.offer(5));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


        ArrayDeque<Integer> dqueue= new ArrayDeque<>();
        dqueue.push(10);
        dqueue.push(4);
        System.out.println(dqueue.peek());
        System.out.println(dqueue.poll());
        System.out.println(dqueue.poll());
        System.out.println(dqueue.peek());
    }
}
