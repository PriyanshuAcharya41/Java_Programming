package QueueOperations;

public class QueueB {
    //Normal Queue
    // static class Queue{
    //     static int arr[];
    //     static int rear=-1;
    //     static int size;
    //     Queue(int n){
    //         arr=new int[n];
    //         size=n;
    //         rear=-1;
    //     }
    //     public static boolean isEmpty(){
    //         return rear==-1;
    //     }
    //     public static void add(int data){
    //         if(rear==size-1){
    //             System.out.println("queue is full ");
    //             return;
    //         }
    //         rear+=1;
    //         arr[rear]=data;
    //     }
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         //shift to left
    //         int front=arr[0];
    //         for(int i=0;i<arr.length-1;i++){
    //             arr[i]=arr[i+1];
    //         }
    //         rear--;
    //         return front;
    //     }
    // }

    //Circular Queue-----------------++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static class Queue{
        static int arr[];
        static int rear=-1;
        static int front=-1;
        static int size;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return (rear==-1 && front==-1);
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full ");
                return;
            }
            rear=(rear+1)%size;
            if(front==-1){
                front=0;
            }
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            //shift to left
            int result=arr[front];
            
            //when last element is deleted;
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
    }
    
    
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        System.out.println(q.remove());
        
    }
}
