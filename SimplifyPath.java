import java.util.Stack;

public class SimplifyPath {
    public static void main(String args[]){
        StringBuilder str=new StringBuilder("/apnacollege./");
        Stack<Character>s=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        //lets pop
        boolean loop=true;
        while(loop){
            Character ch=s.peek();
            if(ch=='.'){
                while(s.peek()!='/'){
                    s.pop();
                }
                s.pop();
            }
            if(s.isEmpty()){
                loop=false;
            }
            else if(s.peek()!='/'){
                loop=false;
            }

            else if(s.peek()!='.'){
                loop=false;
            }
            else
            loop=true;
            
        }
        if(s.isEmpty()){
            System.out.println('/');
        }
    }
}
