package QueueOperations;

public class QueueLinked {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    static class Queue{
        static Node head;
        static Node tail;

        public static boolean isEmpty(){
            return (head==null && tail==null);
        }

        public static void add(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front=head.data;
            if(head==tail){
                head=tail=null;
            }
            else{
                head=head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q=new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("head is "+q.peek());
        System.out.println(q.remove());
        System.out.println("head is "+q.peek());
        System.out.println(q.remove());
        System.out.println("head is "+q.peek());
        System.out.println(q.remove());
        System.out.println("head is "+q.peek());
        System.out.println(q.remove());
    }
}
