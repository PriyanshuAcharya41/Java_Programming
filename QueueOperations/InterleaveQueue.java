package QueueOperations;

import java.util.*;

public class InterleaveQueue {
    public static void main(String args[]){
        Queue<Integer>q=new ArrayDeque<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int size=q.size();
        Queue<Integer>q1=new ArrayDeque<>();
        
        Queue<Integer>q2=new ArrayDeque<>();
        int i=0;
        while(i<size/2){
            q1.add(q.remove());
            i++;
        }
        while(i<size){
            q2.add(q.remove());
            i++;
        }
        System.out.println(q1.peek()+" size is "+q1.size());
        System.out.println(q2.peek()+" size is "+q2.size());
        System.out.println("q is "+q.peek());

        //lets give the answer
        boolean a=true;
        for(int j=0;j<size;j++){
            if(a){
                a=false;
                q.add(q1.remove());
            }
            else{
                a=true;
                q.add(q2.remove());
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(q1.peek()+" size is "+q1.size());
        System.out.println(q2.peek()+" size is "+q2.size());
        System.out.println("q is "+q.peek());
        while(q.peek()!=null){
            System.out.println(q.remove());
        }

    }
}
