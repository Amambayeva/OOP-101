import java.util.*;

public class Problem_E {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pow2 = 1;
        int k = 0;
        while(pow2 < n){
            pow2 <<=1;
            k++;
        }
        System.out.println(k);
    }
}
