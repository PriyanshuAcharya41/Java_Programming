package Linked;

public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    //DOUBLY LINKED LIST
    // public void addFirst(int data){
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=tail=newNode;
    //         return;
    //     }
    //     newNode.next=head;
    //     head.prev=newNode;
    //     head=newNode;
    // }

    // public void addLast(int data){
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=tail=newNode;
    //         return;
    //     }
    //     Node temp=head;
    //     while(temp.next!=null){
    //         temp=temp.next;
    //     }
    //     temp.next=newNode;
    //     newNode.prev=temp;
    //     tail=newNode;
    // }

    // DOUBLY CIRCULAR LINKED LIST:- Not COMPLETED, WILL BE CONTINUED FURTHER
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(tail==null){
            System.out.println("true");
        }
        if(tail==null && head==null){
            newNode.next=head;
            newNode.prev=tail;
            head=tail=newNode;
            
            System.out.println(head.next +" "+head.data);
            System.out.println(tail.next +" "+tail.data);
            return;
        }
        newNode.next=tail.next;
        newNode.prev=tail;
        head=newNode;
        tail.next=head;

        
        return;
    }

    public void visit(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked List is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
        
    }

    public static void main(String args[]){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(30);
        // dll.addFirst(40);
        // dll.addFirst(40);
        // dll.addFirst(40);
        // dll.addFirst(40);

        // dll.addFirst(40);
        // dll.addFirst(50);
        // dll.addLast(80);
        dll.visit();

    }
}
