import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {
    
    public static void main(String args[]){
        LinkedList<Character>list=new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('B');
        list.add('A');
        Stack<Character>s=new Stack();
        for(Character ch:list){
            s.add(ch);
        }
        for(Character ch:list){
            if(ch==s.peek()){
                s.pop();
            }
            else{
                break;
            }
        }
        
        if(s.isEmpty()){
            System.out.println("List is a Palindrome");
        }
        else{
            System.out.println("List is not a Palindrome");
        }
        System.out.println(s);
    }
}
