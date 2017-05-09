/**
 * Created by ewcia on 09.05.17.
 */
public class CountFactors {
    public int solution(int N){
        if(N==1){
            return 1;
        }

        int factors=2;
        double sqrt=Math.sqrt(N);
        int i=2;
        while (i<sqrt){
            if(N%i==0){
                factors=factors+2;
            }
            i++;
        }
        if(i==sqrt){
            factors++;
        }


        return factors;
    }
}
