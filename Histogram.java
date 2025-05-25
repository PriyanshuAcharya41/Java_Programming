import java.util.Stack;

public class Histogram {
    public static void nsl(int heights[],int arr[]){
        Stack<Integer>s=new Stack<>();
        s.push(0);
        arr[0]=-1;

        for(int i=1;i<heights.length;i++){
            int curr=heights[i];
            while(!s.isEmpty() && curr<heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                arr[i]=-1;
            }
            else{
                int prevlow=s.peek();
                arr[i]=prevlow;  
            }
            s.push(i);
        }

    }
    public static void nsr(int heights[],int arr1[]){
        arr1[arr1.length-1]=heights.length;
        Stack<Integer>s=new Stack<>();
        s.push(arr1.length-1);
        for(int i=heights.length-2;i>=0;i--){
            int curr=heights[i];
            while(!s.isEmpty() && curr<heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                arr1[i]=heights.length;
            }
            else{
                int nextlow=s.peek();
                arr1[i]=nextlow;
            }
            s.push(i);
        }
    }
    public static int HistorgramAns(int heights[],int width[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int val=heights[i]*width[i];
            max=Math.max(val,max);
        }
        return max;
    }
    public static void main(String args[]){
        int heights[]={2,1,5,6,2,3};
        int arr[]=new int[heights.length];
        int arr1[]=new int[heights.length];
        nsl(heights, arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        nsr(heights, arr1);
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
        int width[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            int val=arr1[i]-arr[i]-1;
            //int val=j-i-1;
            width[i]=val;
        }
        int maximum=HistorgramAns(heights,width);
        System.out.println("Maximum area is "+maximum);
    }
}
