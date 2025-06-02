package QueueOperations;

import java.util.ArrayDeque;
import java.util.*;
import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Queue<Character>q=new ArrayDeque<>();
        String str=sc.nextLine();
        int freq[]=new int[26];

        for(int i=0;i<str.length();i++){
            q.add(str.charAt(i));
            freq[str.charAt(i)-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("-1"+  " ");
            }
            else{
                System.out.print(q.peek()+ " ");
            }
        }
    }
}
