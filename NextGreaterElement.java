import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreat(int arr[],int nextGreater[]){
        Stack<Integer>s=new Stack<>();
        s.push(arr[arr.length-1]);
        nextGreater[nextGreater.length-1]=-1;
        for(int i=nextGreater.length-2;i>=0;i--){
            int curr=arr[i];
            while(!s.isEmpty() && curr>s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=s.peek();
            }
            s.push(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        nextGreat(arr, nextGreater);
        for(int i=0;i<nextGreater.length;i++){
            System.out.println(nextGreater[i]);
        }
    }
}
