package com.bridgelabz.stackandqueue;
import java.util.*;
public class QueueProblem<T> {
    LinkedList<Integer> ll = new LinkedList<>();
    private void enqueue(Integer i) {
        this.ll.add(i);
    }
    public void dequeue(){
        if(this.ll.size() > 0) {
            this.ll.remove(this.ll.get(0));
        }else{
            System.out.println("No elements in Queue");
        }
    }
    public void peek(){
        if(this.ll.size() > 0) {
            System.out.println(this.ll.get(0));
        }else{
            System.out.println("No elements in Queue");
        }
    }

    public static void main(String[] args) {
        QueueProblem<Integer> qu=new QueueProblem<>();
        qu.enqueue(25);
        qu.enqueue(35);
        qu.enqueue(45);
        System.out.println("Queue contains these elements : " + qu.ll);
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        System.out.println("After removing elements :  "  + qu.ll);
        qu.peek();
    }
}
