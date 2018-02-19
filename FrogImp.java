//https://codility.com/programmers/lessons/3-time_complexity/frog_jmp/

/**
 * Created by ewcia on 30.03.17.
 */
public class FrogImp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int jumps;
        Y=Y-X;
        if(Y%D==0){
            return Y/D;
        }else{
        int t=Y%D;
        t=D-t;
        Y=Y+t;
        jumps=Y/D;
        return jumps;
        }
    }
}
