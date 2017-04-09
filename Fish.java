import java.util.Stack;

/**
 * Created by ewcia on 08.04.17.
 */
public class Fish {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> stack=new Stack<>();
        int liveFisch=0;
        int j=0;
        if(A.length==1){
            return 1;
        }
        if (A.length==2){
            if(B[0]==B[1]||B[0]==0){
                return 2;
            }else {
                return 1;
            }
        }
        while (B[j]==0){
            j++;
            liveFisch++;
        }
        for(int i=j; i<B.length; i++){
            if(B[i]==1){
                stack.push(A[i]);
            }else{
                while (!stack.isEmpty()&&stack.peek()<A[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    liveFisch++;
                }
            }
        }
        while (!stack.isEmpty()){
            liveFisch++;
            stack.pop();
        }
        return liveFisch;
    }
}
