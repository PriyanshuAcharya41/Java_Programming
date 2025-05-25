import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean dupliparenthesis(Stack<Character>s,String str){
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            System.out.println(s);
            if(ch==')'){
                Character re=s.peek();
                int count=0;
                while(re!='('){
                    count++;
                    s.pop();
                    re=s.peek();
                }
                if(count==0){
                    return true;
                }
                s.pop();
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str="(((a+b)+(c+d)))";
        Stack<Character>s=new Stack<>();
        System.out.println(dupliparenthesis(s, str));
    }
}
