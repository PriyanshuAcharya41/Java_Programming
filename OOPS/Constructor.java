import java.util.*;
public class Constructor {
    public static void main(String args[]){
        See first=new See(30);
        System.out.println(first.val);

        first.marks[0]=100;
        first.marks[1]=99;
        first.marks[2]=100;
        See second=new See(first);
        first.marks[0]=99;
        first.marks[1]=99;
        first.marks[2]=99;
        System.out.println(second.marks[0]);
        System.out.println(second.marks[1]);
        System.out.println(second.marks[2]);
    }
}
class See{
    public int val=10;
    int marks[];
    See(int val){
        marks=new int[3];
        this.val=val;
        this.marks=marks;
    }

    //shallow copy
    // See(See s1){
    //     marks=new int[3];
    //     this.val=s1.val;
    //     this.marks=s1.marks;
    // }
    

    //DEEP COPY
    See(See s1){
        marks=new int[3];
        this.val=s1.val;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}
