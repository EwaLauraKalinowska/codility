/**
 * Created by ewcia on 01.04.17.
 */
public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        while (N%2==0){
            N=N/2;
        }
        int max=0;
        int binaryGap=0;
        while(N>1){
            if(N%2==1){
                N=N-1;
                N=N/2;
                binaryGap=0;
            }else{
                N=N/2;
                binaryGap++;
                if(binaryGap>max){
                    max=binaryGap;
                }
            }
        } return max;
    }
}
