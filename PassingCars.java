/**
 * Created by ewcia on 03.04.17.
 */
public class PassingCars {
    public int solution(int[] A) {
        // write your code in Java SE 8
    int sum=0;
    int a=0;

    for(int i=0; i<A.length; i++){
        if(A[i]==0){
            a++;
        }else{
            sum=sum+a;
            if(sum>1000000000){
                return -1;
            }
        }
    }
    return sum;

    }
}
