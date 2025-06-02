package QueueOperations;

import java.util.*;;

public class StackUsingQueue {
    static class Stack{
        static Queue<Integer>q1=new ArrayDeque<>();
        static Queue<Integer>q2=new ArrayDeque<>();
        public static boolean isEmpty(){
            return (q1.isEmpty() && q2.isEmpty());
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        public static int pop(){
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());    
        System.out.println(s.pop());
    }
}
