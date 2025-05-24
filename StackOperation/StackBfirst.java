package StackOperation;

import java.util.*;

public class StackBfirst {

    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void main(String args[]){
        // Stack<Integer>s=new Stack();
        // int data=4;
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s,data);
        // System.out.println(s+" "+s.getClass().getName()+" "+s.peek());

        //REVERSE OF A STRING ------------------------------------------------------------------
        // String str="JAI HIND";
        // Stack<Character>sb=new Stack<>();
        // for(int i=0;i<str.length();i++){
        //     sb.push(str.charAt(i));
        // }
        // String rev="";
        // System.out.println("word "+rev);
        // while(!sb.isEmpty()){
        //     rev+=sb.pop();
        // }    

        // System.out.println(rev);

        
        //REVERSE OF A STACK ------------------------------------------------------------------
        Stack<Integer>s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
