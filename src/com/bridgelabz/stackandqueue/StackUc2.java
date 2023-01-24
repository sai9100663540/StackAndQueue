package com.bridgelabz.stackandqueue;
import java.util.*;
public class StackUc2 {
    LinkedList<Integer> al = new LinkedList<Integer>();
    public void push(Integer num)
    {
        if(this.al.size()<4)
        {
            this.al.add(num);
        }
        else
        {
            System.out.println("Stack is full");
        }
    }
    public void pop() {
        if(this.al.size()<0)
        {
            this.al.remove(this.al.size());
        }
        else
        {
            System.out.println("Stack is empty");
        }

    }
    public void peek()
    {
        if(this.al.size()<0) {
            this.al.get(this.al.size());
        }
        else
        {
            System.out.println( "[] + Stack is empty");

        }
    }


    public static void main(String[] args) {

        Stack<Integer> st = new Stack();

        st.push(25);
        st.push(35);
        st.push(45);

        System.out.println("stack contains these elemenmts :" + st);
        System.out.println("Top of the stack :" + st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("Top of the stack :" + st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("Top of the stack :" + st.peek());
        st.pop();
        System.out.println(st + " stack is empty");

    }
}
