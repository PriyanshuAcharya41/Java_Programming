package Linked;
public class LinkedList{

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;

        head=newNode;

        
    }

    public void visit(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
        
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
        tail=newNode;
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        try{
            System.out.println(head.data);
        }
        catch(Exception e){
            System.out.println(e);
        }
        ll.addFirst(20);
        ll.addFirst(30);
        
        ll.addFirst(40);

        ll.addLast(50);
        ll.visit();
    }
    
}
