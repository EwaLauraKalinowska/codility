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

        Stack<Character> openBrackets = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case ')': {
                    if(!openBrackets.isEmpty()){
                        if ('('== openBrackets.peek()) {
                            openBrackets.pop();

                        } }else {
                        return 0;
                    }

                    break;
                }
                case '}': {
                    if(!openBrackets.isEmpty()){
                        if ('{' == openBrackets.peek() && !openBrackets.isEmpty()) {
                            openBrackets.pop();
                        } }else {
                        return 0;
                    }

                    break;
                }
                case ']': {
                    if(!openBrackets.isEmpty()){
                        if ('[' == openBrackets.peek()) {
                            openBrackets.pop();
                        }
                    }else {
                        return 0;
                    }

                    break;
                }
                default: {
                    openBrackets.push(S.charAt(i));
                    break;
                }
            }
        }
        if (openBrackets.isEmpty()) {
            return 1;
        } else {
            return 0;
        }

}}
