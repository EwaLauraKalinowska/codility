import java.util.Stack;

/**
 * Created by ewcia on 28.04.17.
 */
public class StoneWall {
    public int solution(int[] H){
        int numberOfStone=0;
        Stack <Integer>stack=new Stack();
        for (int i=0; i<H.length; i++){
            if(stack.isEmpty()){
                stack.push(H[i]);
            }else{
                if (stack.peek().equals(H[i])){

                }else{

                    if(H[i]>stack.peek()){
                        stack.push(H[i]);
                    }else {
                        while (!stack.isEmpty()&&stack.peek()>H[i]){
                            stack.pop();
                            numberOfStone++;
                        }
                        if(stack.isEmpty()||(!stack.isEmpty()&&!stack.peek().equals(H[i]))){
                            stack.push(H[i]);
                        }}
                }
            }}

        while (!stack.isEmpty()){
            stack.pop();
            numberOfStone++;
        }



        return numberOfStone;
    }
}






