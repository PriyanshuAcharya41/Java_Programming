package StackOperation;

import java.util.ArrayList;

public class StackB{

    //STACK IMPLEMENTATION THROUGH ARRAYLIST-------------------------------------------
    // static class Stack{
    //     static ArrayList<Integer> list=new ArrayList<>();
    //     public static boolean isEmpty(){
    //         if(list.size()==0){
    //             return true;
    //         }
    //         return false;
    //     }

    //     public static void push(int data){
    //         list.add(data);
    //     }
    //     public static int pop(){
    //         int top=list.get(list.size()-1);
    //         System.out.println("Element that got pop "+top);
    //         list.remove(list.size()-1);
    //         return top;
    //     }
    //     public static int peek(){
    //         return list.get(list.size()-1);
    //     }



    // }
    //STACK IMPLEMENTATION THROUGH LINKEDLIST-------------------------------------------
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }

        public static void push(int data){
            
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            System.out.println("Element that got pop"+top);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        
        Stack st=new Stack();
        System.out.println(st.isEmpty());
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}