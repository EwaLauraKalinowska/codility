import java.util.Stack;

/**
 * Created by ewcia on 21.04.17.
 */
public class Nesting {
    public int solution(String S) {
        // write your code in Java SE 8
        if(S.length()==0){
            return 1;
        }

        if(S.length()%2==1){
            return 0;
        }

        Stack<Character> stack=new Stack<>();
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)=='('){
                stack.push('(');
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    return 0;
                }
            }
        }
        if(stack.isEmpty()){
            return 1;
        }else {
            return 0;
        }
    }
}
