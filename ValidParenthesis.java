import java.util.Stack;

public class ValidParenthesis {
    public static boolean parenthesis(Stack<Character>s,String str){
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            System.out.println("char is "+ch);
            if(ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }
            else{
                Character re=s.peek();
                if( (ch==']' && re=='[')){
                    s.pop();
                }
                else if( (ch==')' && re=='(')){
                    s.pop();
                }
                else if( (ch=='}' && re=='{')){
                    s.pop();
                }
                else{
                    return false;
                }
            }

            
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
    public static void  main(String args[]){
        String str="(({]}))";
        Stack<Character>s=new Stack<>();
        System.out.println(parenthesis(s, str));
        
    }
}
