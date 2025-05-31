package QueueOperations;

import java.util.Stack;

public class QueueUsingStack {
    static class Queue{
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            //Step1- Transfer all elements to to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            //Step2- Then add the comming element to s1
            s1.push(data);
            //Step3- Then transfer all the elements from s2 to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int pop(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[]){
        Queue q=new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("peek is "+q.peek());
        System.out.println("poped value is "+q.pop());
        System.out.println("poped value is "+q.pop());
        System.out.println("poped value is "+q.pop());
    }
}
