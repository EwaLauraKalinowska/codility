import java.util.Stack;

/**
 * Created by ewcia on 21.04.17.
 */
public class Brackets {
    public int solution(String S) {
        // write your code in Java SE 8
        if (S == null || "".equals(S)) {
            return 1;
        }

        if(S.length()%2==1){
            return 0;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case ')': {
                    if(!stack.isEmpty()){
                        if ('('== stack.peek()) {
                            stack.pop();

                        } }else {
                        return 0;
                    }

                    break;
                }
                case '}': {
                    if(!stack.isEmpty()){
                        if ('{' == stack.peek() && !stack.isEmpty()) {
                            stack.pop();

                        } }else {
                        return 0;
                    }

                    break;
                }
                case ']': {
                    if(!stack.isEmpty()){
                        if ('[' == stack.peek()) {
                            stack.pop();

                        } }else {
                        return 0;
                    }

                    break;
                }
                default: {
                    stack.push(S.charAt(i));
                    break;
                }
            }
        }
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }

}}
