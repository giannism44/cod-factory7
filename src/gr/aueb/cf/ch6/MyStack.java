package gr.aueb.cf.ch6;

import java.sql.SQLOutput;

public class MyStack {

    static int[] stack = new int[50];
    static int top = -1;

    public static void main(String[] args) {

    }

    public static void push(int num){
        if (isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = num;
    }

    public static int pop(){
        if (isEmpty()){
            System.out.println("Stack is full");
            throw new RuntimeException("Stack is empty");
        }

        return stack[top--];
    }

    private static boolean isFull(){
        return top == stack.length;
    }

    private static boolean isEmpty(){
        return top == -1;
    }
}
